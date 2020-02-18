package edu.cascadia.brianb.fragmentcommunication;

import androidx.appcompat.app.AppCompatActivity;
import android.app.FragmentManager;
import android.content.ClipData;
import android.os.Bundle;
import android.widget.Toast;

//TODO: require the Activity to implement the interface 'OnFragmentInteractionListener'
public class MainActivity extends AppCompatActivity implements ItemFragment.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TODO: Add the ItemFragment to the Activity layout's fragment container

        // HINT: Use the getFragmentManager to begin a transaction, add, and commit

        getFragmentManager().beginTransaction()
                .add(R.id.fragment_container, new ItemFragment(), "item_fragment")
                .commit();

    }

    //TODO: Implement the method 'onFragmentInteraction' to creates a new SimpleFragment
    //      using its FragmentFactory method 'newInstance'
    @Override
    public void onFragmentInteraction(String id) {

        String actualIndex = Integer.toString(Integer.parseInt(id) + 1);

        getFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, new SimpleFragment().newInstance(actualIndex))
                .addToBackStack(null)
                .commit();
    }

}
