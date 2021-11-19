package com.zybooks.navdrawerfragments.ui.home;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.zybooks.navdrawerfragments.R;
import com.zybooks.navdrawerfragments.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home,container,false);
        //TODO: Sets the onClickListener for each button to the galleryItemButtonClick method with appropriate arguments


        Button mGalleryItem1 = root.findViewById(R.id.GalleryItem1);
        Button mGalleryItem2 = root.findViewById(R.id.GalleryItem2);
        Button mGalleryItem3 = root.findViewById(R.id.GalleryItem3);


        mGalleryItem1.setOnClickListener((View v) -> {
            galleryItemButtonClick(v, );
        });
        mGalleryItem2.setOnClickListener((View v) -> {
            // do something here
        });
        mGalleryItem3.setOnClickListener((View v) -> {
            // do something here
        });

        return root;
    }

    public void galleryItemButtonClick(View view, int item){
        HomeFragmentDirections.ActionNavHomeToNavGallery action = HomeFragmentDirections.actionNavHomeToNavGallery();
        //TODO: assign the appropriate item number value to the Destination Argument and navigate to the gallery page

    }
}