package com.example.saantoni.myapplication.tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.example.saantoni.myapplication.MainActivity;
import com.example.saantoni.myapplication.R;


/**
 * Created by saantoni on 4/13/2016.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity> {

    MainActivity mainActivity;

    public JUnit_test() {
        super(MainActivity.class);
    }

    public void test_first() {
        mainActivity = getActivity();

        TextView textView = (TextView) mainActivity.findViewById(R.id.tv1);
        String tester = textView.getText().toString();

        // checks to see if value of textview equals "Bye World"
        assertEquals("Hello World!", tester);

    }

}
