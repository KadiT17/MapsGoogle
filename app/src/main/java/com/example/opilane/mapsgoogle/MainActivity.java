package com.example.opilane.mapsgoogle;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private static final int ERROR_DIALOG_REQUEST =9001;
    private String msg;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean servissOK(){

        Log.d(TAG, msg: "servicOK: kontrllimine google services versiooni");


        int oigeVersioon =GoogleApiAvailability.getIntstance().isGooglePlayServicesAvailable
                (Context.MainActivity.this);
        if (oigeVersioon == ConnectionResult.SUCCESS){
            Log.d(TAG, msg  "ServicesOK: Google Play services töötab");
        }

        else if (GoogleApiAvailability.getInstance() .isUserResolvableerror(oigeVersioon)) {
            Log.d(TAG,msg: "ServisesOK; esimene viga...");
            Dialog dialog = GoogleApiAvailability.getInstance().getErrorDialog(Activity.Mainactivity.this
            , oigeVersioon, ERROR_DIALOG_REQUEST);
            dialog.show();












        }
    }



    }
}

