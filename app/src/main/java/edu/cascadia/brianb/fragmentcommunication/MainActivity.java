package edu.cascadia.brianb.fragmentcommunication;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends Activity
implements ItemFragment.OnFragmentInteractionListener{
//TODO: require the Activity to implement the interface 'OnFragmentInteractionListener'

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TODO: Use the fragment transaction manager to add the item fragment to the fragment container

        if (savedInstanceState == null){
            getFragmentManager()
                    .beginTransaction()
                    .add(R.id.fragment_container,ItemFragment.newInstance(),"firstFrag")
                    .commit();
        }

    }

    //TODO: Implement the method 'onFragmentInteraction' to creates a new SimpleFragment using its FragmentFactory method 'newInstance'

    @Override
    public void onFragmentInteraction(String id) {
        final SimpleFragment simpleFragment = SimpleFragment.newInstance(id);
        getFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, simpleFragment, "SimpleString")
                .addToBackStack(null)
                .commit();

    }
}
