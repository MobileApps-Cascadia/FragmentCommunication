package edu.cascadia.brianb.fragmentcommunication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuView;
import androidx.fragment.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;

class MainActivity extends AppCompatActivity  implements ItemFragment.OnFragmentInteractionListener{
//TODO: require the Activity to implement the interface 'OnFragmentInteractionListener'
    FragmentManager fragmentManager;
    private ItemFragment.OnFragmentInteractionListener mListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction()
                .add(R.id.fragment_container, new ItemFragment(), "frag1")
                .commit();
        //TODO: Add the ItemFragment to the Activity layout's fragment container
        // HINT: Use the getFragmentManager to begin a transaction, add, and commit

    }

    //TODO: Implement the method 'onFragmentInteraction' to creates a new SimpleFragment
    //      using its FragmentFactory method 'newInstance'

    public void onFragmentInteraction(String ID){
        fragmentManager.beginTransaction()
                .add(R.id.fragment_container, SimpleFragment.newInstance(ID), "frag2")
                .commit();

    }



}
