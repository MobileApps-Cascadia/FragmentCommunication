package edu.cascadia.brianb.fragmentcommunication;

import androidx.appcompat.app.AppCompatActivity;


import android.app.FragmentManager;
import android.content.ClipData;
import android.os.Bundle;

//TODO: require the Activity to implement the interface 'OnFragmentInteractionListener'
public class MainActivity extends AppCompatActivity implements ItemFragment.OnFragmentInteractionListener{

    FragmentManager fm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TODO: Add the ItemFragment to the Activity layout's fragment container

        ItemFragment itemFragment = new ItemFragment();
        SimpleFragment simpleFragment = new SimpleFragment();

        // HINT: Use the getFragmentManager to begin a transaction, add, and commit

        fm = getFragmentManager();
        fm.beginTransaction()
                .add(R.id.fragment_container, itemFragment, "frag")
                .commit();

    }

    //TODO: Implement the method 'onFragmentInteraction' to creates a new SimpleFragment
    //      using its FragmentFactory method 'newInstance'
    @Override
    public void onFragmentInteraction(String id) {
        SimpleFragment.newInstance("frag");
    }

}
