package edu.cascadia.brianb.fragmentcommunication;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.ClipData;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends Activity implements ItemFragment.OnFragmentInteractionListener {
//require the Activity to implement the interface 'OnFragmentInteractionListener'

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Add the ItemFragment to the Activity layout's fragment container
        // HINT: Use the getFragmentManager to begin a transaction, add, and commit
            getFragmentManager()
                    .beginTransaction()
                    .add(R.id.fragment_container, new ItemFragment())
                    .commit();
    }

    //Implement the method 'onFragmentInteraction' to creates a new SimpleFragment using its FragmentFactory method 'newInstance'
    public void onFragmentInteraction(String position) {
        getFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, SimpleFragment.newInstance(position))
                .addToBackStack("ItemList")
                .commit();
    }
}
