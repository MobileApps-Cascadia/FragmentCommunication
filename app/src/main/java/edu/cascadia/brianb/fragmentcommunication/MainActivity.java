package edu.cascadia.brianb.fragmentcommunication;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import edu.cascadia.brianb.fragmentcommunication.dummy.DummyContent;


public class MainActivity extends AppCompatActivity
        implements ItemFragment.OnSelectItemListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onSelectItem(DummyContent.DummyItem item) {

    }
}
