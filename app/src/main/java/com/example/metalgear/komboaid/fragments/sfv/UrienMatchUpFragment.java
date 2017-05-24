package com.example.metalgear.komboaid.fragments.sfv;

import android.app.ProgressDialog;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.example.metalgear.komboaid.R;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;

public class UrienMatchUpFragment extends Fragment {
    // URL Address
    protected String url = "http://www.eventhubs.com/tiers/sf5/character/urien/";
    private ProgressDialog mProgressDialog;
    private ArrayList<String> elemsArray = new ArrayList<>();
    private String[] titles = {"Rank", "Character", "Votes", "Match Avg.", "Day", "Week", "Month"};
    private int count = 0;
    private int size = 0;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_urien_match_up, container, false);

        new MatchUpList().execute();

        return view;

    }

    // Description AsyncTask
    private class MatchUpList extends AsyncTask<Void, Void, Void> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            mProgressDialog = new ProgressDialog(getActivity());
            mProgressDialog.setTitle("Loading Tier List, Please Stand By.");
            mProgressDialog.setMessage("Loading...");
            mProgressDialog.setIndeterminate(false);
            mProgressDialog.show();
        }

        @Override
        protected Void doInBackground(Void... params) {
            try {
                // Connect to the web site
                Document document = Jsoup.connect(url).get();
                // Using Elements to get the Meta data
                Elements table = document.select("table[class=tierstable]");

                //First for loop will go through multiple tables
                for (int r = 0; r < table.size()-1; r++) {
                    Element t = table.get(r);
                    Elements rows = t.select("tr");

                    for (int j = 0; j < rows.size(); j++) {
                        Element row = rows.get(j);
                        Elements cols = row.select("td");
                        size ++;


                        for (int i = 0; i < cols.size(); i++) {
                            if(i>0&&i<7) {
                                elemsArray.add(cols.get(i).text());
                            }else if (i==0){
                                //Converting each size to a string for the correct number ranking
                                StringBuilder sb = new StringBuilder(1);
                                sb.append(size-1);
                                String rank = sb.toString();
                                elemsArray.add(rank);
                            }else {break;}
                        }
                    }
                    //Counts for the title in each table
                    size=size-1;
                }

            }catch (IOException e){
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void result) {

            TableLayout rankTable = (TableLayout) getView().findViewById(R.id.match_up_table);

            TableRow titleRow = new TableRow(getActivity());
            TableRow.LayoutParams titleParams = new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT);
            titleParams.topMargin = 2;
            titleParams.rightMargin = 2;

            for(int j=0; j<7 ; j++) {
                TextView title = new TextView(getActivity());
                title.setText(titles[j]);

                //Styles-----------------------------------------------
                title.setLayoutParams(titleParams);
                //Text
                title.setTypeface(Typeface.SERIF);
                title.setTextSize(16);
                title.setTextColor(Color.WHITE);
                title.setBackgroundColor(Color.BLACK);
                title.setPadding(10,10,15,10);

                titleRow.addView(title);
            }
            titleRow.setBackgroundColor(Color.BLACK);
            rankTable.addView(titleRow);

            for(int j=0; j< size; j++) {
                TableRow rankRow = new TableRow(getActivity());
///////////////////////////////
                TableRow.LayoutParams rowParams = new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT);
                rowParams.topMargin = 2;
                rowParams.rightMargin = 2;
////////////////////////////////
                for (int i = 0; i <7 ; i++) {
                    TextView rank = new TextView(getActivity());
                    rank.setText(elemsArray.get(count));
                    //Styles-----------------------------------------------
                    rank.setLayoutParams(rowParams);
                    //Text Styles
                    rank.setTypeface(Typeface.SANS_SERIF);
                    rank.setTextSize(16);
                    rank.setTextColor(Color.DKGRAY);
                    rank.setPadding(10,10,15,10);
                    if(i==0){
                        rank.setTypeface(Typeface.DEFAULT_BOLD);
                    }

                    if(j%2==0){
                        rank.setBackgroundColor(Color.LTGRAY);
                    }
                    rankRow.addView(rank);
                    count++;
                }

                if(j%2==0){
                    rankRow.setBackgroundColor(Color.LTGRAY);
                }
                rankTable.addView(rankRow);
            }

            mProgressDialog.dismiss();
        }
    }
}
