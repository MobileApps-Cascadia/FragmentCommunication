package edu.cascadia.brianb.fragmentcommunication;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
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

        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fm.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, new ItemFragment());
        fragmentTransaction.commit();
    }

    //TODO: Implement the method 'onFragmentInteraction' to creates a new SimpleFragment using its FragmentFactory method 'newInstance'

    @Override
      public void onFragmentInteraction(String id) {

        Fragment fr = SimpleFragment.newInstance(id);
        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, fr);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();



           }


               public void onBackPressed() {
                   if(getFragmentManager().getBackStackEntryCount() > 0){
                       getFragmentManager().popBackStack();
                   }
                   else {
                       super.onBackPressed();
                   }
    }
}
