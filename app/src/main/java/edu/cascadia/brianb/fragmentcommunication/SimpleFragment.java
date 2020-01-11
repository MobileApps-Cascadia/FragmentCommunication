package edu.cascadia.brianb.fragmentcommunication;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class SimpleFragment extends Fragment {
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";

    private String mParam1;

    private ItemFragment.OnFragmentInteractionListener mListener;

    /**
     * Use this factory method to create a new instance of
     * this fragment with a single string parameter.
     *
     * @param param1 Parameter 1.
     * @return A new instance of fragment SimpleFragment.
     */
    public static SimpleFragment newInstance(String param1) {
        SimpleFragment fragment = new SimpleFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }

    public SimpleFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment AND store the resulting view in a variable myView
        View myView =  inflater.inflate(R.layout.fragment_simple, container, false);

        //TODO: Set the resultsTextView to display the string with the position number passed by the bundle and stored in param1
        //(HINT: myView has a findViewById() method that can retrieve a copy of the TextView
        myView.findViewById(R.id.resultTextView);

        // returns the final view
        return myView;
    }



}
