package edu.cascadia.brianb.fragmentcommunication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements ItemFragment.OnFragmentInteractionListener {

    FragmentManager fm;

//TODO: require the Activity to implement the interface 'OnFragmentInteractionListener'

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TODO: Add the ItemFragment to the Activity layout's fragment container
        // HINT: Use the getFragmentManager to begin a transaction, add, and commit
        fm = getFragmentManager();
        fm.beginTransaction()
                .add(R.id.fragment_container, new ItemFragment())
                .commit();
    }

    //TODO: Implement the method 'onFragmentInteraction' to creates a new SimpleFragment
    //      using its FragmentFactory method 'newInstance'
    public void onFragmentInteraction(String string) {
        fm = getFragmentManager();
        fm.beginTransaction()
                .replace(R.id.fragment_container, SimpleFragment.newInstance(string))
                .commit();

    }


}
