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

public class fragment1 extends Fragment {

    ListView listView;
    ArrayList<ListViewModel> list = new ArrayList<>();

    public fragment1()
    {
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1, null, false);
        // inflater: layout에 있는 xml을 바인딩 시켜주는 놈.
        //fragment1.xml이 view안에 들어간다.

        listView = view.findViewById(R.id.listView);


        for(int i = 0 ; i < 10; i++){
            list.add(addBoard(R.drawable.profile, i + "번 아이디", R.drawable.test1, "오다 주웠다."));
        }

        ListViewAdapter adapter = new ListViewAdapter(list);
        listView.setAdapter(adapter);


        return view;
    }

    ListViewModel addBoard(int profileImg, String profileId, int contentImg, String contentText){

        return new ListViewModel(profileImg, profileId, contentImg, contentText, "게스트1", "게시글이 좋네요");
    }

}
