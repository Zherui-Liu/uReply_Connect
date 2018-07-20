package com.example.ur_0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2018/7/17.
 */

public class InfoAdapter extends ArrayAdapter<InfoArticle> {

    private int resourceId;

    public InfoAdapter(Context context,int textViewResourceId, List<InfoArticle> objects){
        super(context,textViewResourceId, objects);
        resourceId = textViewResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        InfoArticle infoarticle = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
        TextView articlename = (TextView)view.findViewById(R.id.article_name);
        articlename.setText(infoarticle.getName());
        return view;
    }
}
