package com.example.instagramclone;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {

    ArrayList<ListViewModel> list;

    public ListViewAdapter(ArrayList<ListViewModel> list) {
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
    public long getItemId(int position) { // 따로 안가르쳐줌
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.instagram_lvitem, null, false); // lvitem 을 view 에 넣음
        ListViewModel data = list.get(position);

        ImageView profileImg = view.findViewById(R.id.personImg);
        TextView profileId = view.findViewById(R.id.personId);
        ImageView contentImg = view.findViewById(R.id.contentImg);
        TextView profileId2 = view.findViewById(R.id.contentId);
        TextView guestId = view.findViewById(R.id.guestId);
        TextView guestText = view.findViewById(R.id.guestContent);
        TextView contentText = view.findViewById(R.id.contentText);

        profileImg.setImageResource(data.getProfileImg());
        profileId.setText(data.getProfileId());
        profileId2.setText(data.getProfileId());
        contentImg.setImageResource(data.getContentImg());
        guestId.setText(data.getGuestId());
        guestText.setText(data.getGuestContent());
        contentText.setText(data.getContentText());

        return view;
    }
}