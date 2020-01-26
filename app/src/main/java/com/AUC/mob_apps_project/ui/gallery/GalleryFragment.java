package com.AUC.mob_apps_project.ui.gallery;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.AUC.mob_apps_project.LoginActivity;
import com.AUC.mob_apps_project.R;
import com.google.firebase.auth.FirebaseAuth;

public class GalleryFragment extends Fragment {

//    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_gallery,container,false);
//
//        view.findViewById(R.id.logout1).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                FirebaseAuth.getInstance().signOut();
//                startActivity(new Intent(getActivity(),LoginActivity.class));
//
//            }
//        });

        return view;
    }

}