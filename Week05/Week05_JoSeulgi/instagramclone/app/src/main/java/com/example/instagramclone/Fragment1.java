package com.example.instagramclone;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class Fragment1 extends Fragment {

    ListView listView;
    ArrayList<ListViewModel> list = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1, null, false);

        listView = view.findViewById(R.id.ListView);
        for(int i = 0; i < 3; ++i) {
            list.add(addBoard(R.drawable.person, "insta_id1", R.drawable.test1, "1111111111"));
            list.add(addBoard(R.drawable.person, "insta_id2", R.drawable.test1, "22222222222"));
            list.add(addBoard(R.drawable.person, "insta_id3", R.drawable.test1, "3333333333"));
        }
        ListViewAdapter adapter = new ListViewAdapter(list);
        listView.setAdapter(adapter);

        return view;
    }

    ListViewModel addBoard(int profileImg, String profileId, int contentImg, String contentText){

        return new ListViewModel(profileImg, profileId, contentImg, contentText, "게스트1", "댓글");
    }
}
