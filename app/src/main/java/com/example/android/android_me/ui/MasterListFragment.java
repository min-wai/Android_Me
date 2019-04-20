<<<<<<< Updated upstream
/*
* Copyright (C) 2017 The Android Open Source Project
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*  	http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package com.example.android.android_me.ui;

=======
package com.example.android.android_me.ui;


import android.content.Context;
>>>>>>> Stashed changes
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
<<<<<<< Updated upstream
import android.widget.GridView;
=======
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;
>>>>>>> Stashed changes

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

<<<<<<< Updated upstream

// This fragment displays all of the AndroidMe images in one large list
// The list appears as a grid of images
public class MasterListFragment extends Fragment {

    // TODO (1) Define a new interface OnImageClickListener that triggers a callback in the host activity
        // The callback is a method named onImageSelected(int position) that contains information about
        // which position on the grid of images a user has clicked

    // TODO (2) Override onAttach to make sure that the container activity has implemented the callback


    // Mandatory empty constructor
    public MasterListFragment() {
    }

    // Inflates the GridView of all AndroidMe images
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.fragment_master_list, container, false);

        // Get a reference to the GridView in the fragment_master_list xml layout file
        GridView gridView = (GridView) rootView.findViewById(R.id.images_grid_view);

        // Create the adapter
        // This adapter takes in the context and an ArrayList of ALL the image resources to display
        MasterListAdapter mAdapter = new MasterListAdapter(getContext(), AndroidImageAssets.getAll());

        // Set the adapter on the GridView
        gridView.setAdapter(mAdapter);

        // TODO (3) Set a click listener on the gridView and trigger the callback onImageSelected when an item is clicked

        // Return the root view
        return rootView;
    }

=======
/**
 * A simple {@link Fragment} subclass.
 */
public class MasterListFragment extends Fragment {

    OnImageClickListener callback;

    public MasterListFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_master_list, container, false);
        GridView gridView = rootView.findViewById(R.id.gridView);
        gridView.setAdapter(new MasterListAdapter(getContext(), AndroidImageAssets.getAll()));
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                callback.onImageClicked(position);
            }
        });
        return gridView;
    }

    @Override
    public void onAttach(Context context) {
        callback = (OnImageClickListener) context;
        super.onAttach(context);
    }

    interface OnImageClickListener {
        void onImageClicked(int position);
    }
>>>>>>> Stashed changes
}
