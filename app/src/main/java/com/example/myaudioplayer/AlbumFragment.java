package com.example.myaudioplayer;

import static com.example.myaudioplayer.MainActivity.albums;
import static com.example.myaudioplayer.MainActivity.musicFiles;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * create an instance of this fragment.
 */
public class AlbumFragment extends Fragment {

    MusicAdapter musicAdapter;
    RecyclerView recyclerView;
    albumAdapter albumAdapter;

    public AlbumFragment(){

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_album, container, false);
        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true); // position tru - vị trí cố định
        if (!(albums.size() < 1))
        {
            albumAdapter = new albumAdapter(getContext(), albums);
            recyclerView.setAdapter(albumAdapter);
            recyclerView.setLayoutManager( new GridLayoutManager(getContext(), 2));

        }
        return view;
    }
}