package edu.cascadia.brianb.fragmentcommunication;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class SimpleFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_ITEM_NUMBER = "item";

    // TODO: Rename and change types of parameters
    private String item1;

    private ItemFragment.OnFragmentInteractionListener mListener;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param item Parameter 1.
     * @return A new instance of fragment SimpleFragment.
     */
    public static SimpleFragment newInstance(String item) {
        SimpleFragment fragment = new SimpleFragment();
        Bundle args = new Bundle();
        args.putString(ARG_ITEM_NUMBER, item);
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
            item1 = getArguments().getString(ARG_ITEM_NUMBER);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View myView =  inflater.inflate(R.layout.fragment_simple, container, false);

        //TODO: Set the resultsTextView to display the string with the position number passed by the bundle
        //TextView resultset = (TextView) getView().findViewById(R.id.resultTextView);
        TextView resultset = (TextView) myView.findViewById(R.id.resultTextView);
               if (resultset != null)
                   resultset.setText("You have selected item" + item1);

        // return the final view
        return myView;
    }



}
