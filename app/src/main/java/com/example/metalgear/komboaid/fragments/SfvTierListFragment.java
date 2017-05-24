package com.example.metalgear.komboaid.fragments;

import android.app.ProgressDialog;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
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


public class SfvTierListFragment extends Fragment {
    // URL Address
    protected String url = "http://www.eventhubs.com/tiers/sf5/";
    private ProgressDialog mProgressDialog;
    private ArrayList<String> elemsArray = new ArrayList<>();
    private String[] titles = {"Rank", "Character", "Score", "Day", "Week", "Month", "Votes"};
    private int count = 0;
    private int size = 0;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view;
        view = inflater.inflate(R.layout.fragment_sfv_tier_list, container, false);

        new TierList().execute();

        return view;
    }

    // Description AsyncTask
    private class TierList extends AsyncTask<Void, Void, Void> {

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
                Elements rows = table.get(0).select("tr");

                for (int j = 0; j < rows.size(); j++) {
                    Element row = rows.get(j);
                    Elements cols = row.select("td");
                    size ++;

                    for (int i = 0; i < cols.size(); i++) {
                        if(i<7) {
                            elemsArray.add(cols.get(i).text());
                        }else{break;}
                    }
                }


            }catch (IOException e){
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void result) {

            TableLayout rankTable = (TableLayout) getView().findViewById(R.id.tier_table_content);

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

            for(int j=0; j< size-1; j++) {
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
