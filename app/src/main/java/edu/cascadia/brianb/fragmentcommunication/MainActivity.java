package edu.cascadia.brianb.fragmentcommunication;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import edu.cascadia.brianb.fragmentcommunication.dummy.NewsContent;

public class MainActivity extends AppCompatActivity implements ItemFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Check that the activity is using the layout version with the fragment_container FrameLayout
        if (findViewById(R.id.fragment_container) != null) {
            // Do nothing if returning from a previous state
            if (savedInstanceState != null) {
                return;
            }

            // Create a new fragment to be placed in the activity layout
            ItemFragment itemFragment = new ItemFragment();

            // In case this activity was started with special instructions from an
            // Intent, pass the Intent's extras to the fragment as arguments
            itemFragment.setArguments(getIntent().getExtras());

            // Add the fragment to the 'fragment_container' FrameLayout
            getFragmentManager().beginTransaction()
                    .add(R.id.fragment_container, itemFragment, "Headlines").commit();
        }
    }

    // Replace the current fragment with a new SimpleFragment
    public void onFragmentInteraction(NewsContent.NewsItem item) {

        getFragmentManager().beginTransaction()
            .replace(R.id.fragment_container, SimpleFragment.newInstance(item))
            .addToBackStack(null).commit();
    }
}
