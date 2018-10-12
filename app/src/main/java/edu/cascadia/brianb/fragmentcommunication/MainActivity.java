package edu.cascadia.brianb.fragmentcommunication;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends Activity implements ItemFragment.OnFragmentInteractionListener{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getFragmentManager().beginTransaction().add(R.id.fragment_container, new ItemFragment()).commit();
    }

    @Override
    public void onFragmentInteraction(String id) {
        getFragmentManager().beginTransaction().replace(R.id.fragment_container, SimpleFragment.newInstance(id)).addToBackStack("ItemList").commit();
    }

    //TODO: Implement the method 'onFragmentInteraction' to creates a new SimpleFragment using its FragmentFactory method 'newInstance'

}
