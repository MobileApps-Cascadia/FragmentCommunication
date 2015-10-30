package edu.cascadia.brianb.fragmentcommunication;

import android.app.Activity;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity
        implements ItemFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, new ItemFragment())
                .commit();
    }

    @Override
    public void onFragmentInteraction(String id) {
        getFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, SimpleFragment.newInstance(id))
                .addToBackStack(null)
                .commit();
    }

    public void onBackPressed() {
        getFragmentManager().popBackStack();
    }
}
