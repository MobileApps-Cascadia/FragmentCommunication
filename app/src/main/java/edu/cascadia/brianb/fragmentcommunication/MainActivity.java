package edu.cascadia.brianb.fragmentcommunication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements ItemFragment.OnFragmentInteractionListener {
//TODO: require the Activity to implement the interface 'OnFragmentInteractionListener'


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TODO: Add the ItemFragment to the Activity layout's fragment container
        // HINT: Use the getFragmentManager to begin a transaction, add, and commit
        getFragmentManager().beginTransaction()
                .add(R.id.fragment_container, new ItemFragment())
                .commit();

    }

    //TODO: Implement the method 'onFragmentInteraction' to creates a new SimpleFragment
    //      using its FragmentFactory method 'newInstance'


    @Override
    public void onFragmentInteraction(String id) {
        getFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, new SimpleFragment().newInstance(id))
                .addToBackStack(null)
                .commit();
    }
}
