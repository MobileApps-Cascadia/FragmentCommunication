package edu.cascadia.brianb.fragmentcommunication;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import edu.cascadia.brianb.fragmentcommunication.dummy.NewsContent;


public class SimpleFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_HEADLINE = "headline";
    private static final String ARG_ARTICLE = "article";

    // TODO: Rename and change types of parameters
    private String headline;
    private String article;

    private ItemFragment.OnFragmentInteractionListener mListener;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param news NewsItem
     * @return A new instance of fragment SimpleFragment.
     */
    public static SimpleFragment newInstance(NewsContent.NewsItem news) {
        SimpleFragment fragment = new SimpleFragment();
        Bundle args = new Bundle();
        args.putString(ARG_HEADLINE, news.headline);
        args.putString(ARG_ARTICLE, news.article);
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
            headline = getArguments().getString(ARG_HEADLINE);
            article = getArguments().getString(ARG_ARTICLE);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View myView =  inflater.inflate(R.layout.fragment_simple, container, false);

        //TODO: Set the resultsTextView to display the string with the position number passed by the bundle
        TextView textView = (TextView) myView.findViewById(R.id.resultTextView);
        textView.setText(headline + " - " + article);

        // return the final view
        return myView;
    }



}
