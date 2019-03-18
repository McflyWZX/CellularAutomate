package com.storm.ca;

import android.app.*;
import android.os.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
		MainAnimationView mav = new MainAnimationView(this);
        setContentView(mav);
    }
}
