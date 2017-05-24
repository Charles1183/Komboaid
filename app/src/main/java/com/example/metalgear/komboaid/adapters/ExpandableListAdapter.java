package com.example.metalgear.komboaid.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.metalgear.komboaid.R;

import java.util.HashMap;
import java.util.List;

public class ExpandableListAdapter extends BaseExpandableListAdapter {
    private List<String> parentItems;
    private HashMap<String, List<String>> childItems;
    private Context ctx;

    ExpandableListAdapter(Context ctx, List<String> headerTitles, HashMap<String, List<String>> childItems){
        this.ctx=ctx;
        this.childItems=childItems;
        this.parentItems=headerTitles;
    }

    @Override
    public int getGroupCount() {
        return parentItems.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return childItems.get(parentItems.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return parentItems.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return childItems.get(parentItems.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        String child = (String)this.getGroup(groupPosition);
        if(convertView==null){
            LayoutInflater layoutInflater = (LayoutInflater) this.ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.exp_parent_layout,null);
        }
        TextView textView = (TextView) convertView.findViewById(R.id.heading_text);
        //ImageView imageView = (ImageView) convertView.findViewById(R.id.item_image);
        // textView.setTypeface(null, Typeface.BOLD);
        textView.setText(child);

        /*switch (child) {
            case "child Item 0":imageView.setImageResource(R.mipmap.image_file_name);
                break;
            case "child Item 1":imageView.setImageResource(R.mipmap.image_file_name);
                break;
        }*/

        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        String child = (String) this.getChild(groupPosition, childPosition);
        if(convertView == null){
            LayoutInflater layoutInflater = (LayoutInflater) this.ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.exp_child_layout,null);
        }
        TextView textView = (TextView) convertView.findViewById(R.id.item_text);
        //ImageView imageView = (ImageView) convertView.findViewById(R.id.item_image);
        //textView.setTypeface();
        textView.setText(child);

        //String parentName = getGroup(groupPosition).toString();

        /*if (parentName=="parent Item") {
            switch (child) {
                case "child Item 0":imageView.setImageResource(R.mipmap.image_file_name);
                    break;
                case "child Item 1":imageView.setImageResource(R.mipmap.image_file_name);
                    break;
            }
        }*/

        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
