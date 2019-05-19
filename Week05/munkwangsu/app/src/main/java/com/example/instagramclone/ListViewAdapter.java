package com.example.instagramclone;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {

    ArrayList<ListViewModel> list;

    public ListViewAdapter(ArrayList<ListViewModel> list){
        this.list = list;

    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) { // 혼자 공부하셈.
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.instagram_lvitem,null, false);
        ListViewModel data = list.get(position);

        ImageView profileImg = view.findViewById(R.id.profile);
        TextView personId = view.findViewById(R.id.personId);

        ImageView contentImg = view.findViewById(R.id.contentImg);
//        TextView contentText = view.findViewById(R.id.contentText);

        TextView personId2 = view.findViewById(R.id.personId2);

        TextView guestId = view.findViewById(R.id.personId3);
        TextView guestText = view.findViewById(R.id.guestContent);


        /////

        profileImg.setImageResource(data.getProfileImg());
        personId.setText(data.getProfileId());
        personId2.setText(data.getProfileId());

//        contentText.setText(data.getContentText());

        contentImg.setImageResource(data.getContentImg());
        guestId.setText(data.getGuestId());
        guestText.setText(data.getGuestContent());


        return view;
    }
}
