package com.example.opilane.mapsgoogle;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.annotation.VisibleForTesting;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.Manifest;

public class MapActivity extends AppCompatActivity {


    private static final String TAG = "MapActivity";
    private static final String FINE_LOCATION = Manifest.permission.ACCESS_FINE_LOCATION;
    private static final String COARSE_LOCATION =Manifest.permission.ACCESS_COARSE_LOCATION;
    private Boolean LocationPremissionsGranted = false;
    private static final int LOCATION_PERMISSION_REQUEST_CODE = 123;
    private GoogleMap gkaart;

    public OnMapReady(GoogleMap. googleMap) {
        this.gkaart = gkaart;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
    }

    private void getLocationPremission(){
        String[] permissions = {Manifest.permission.ACCESS_FINE_LOCATION,
                Manifest.permission.ACCESS_COARSE_LOCATION};
        if (ContextCompat.checkSelfPermission(this.getApplicationContext(),FINE_LOCATION)==
                getPackageManager().PERMISSION_GRANTED){
            if (ContextCompat.checkSelfPermission(this.getApplicationContext(),COARSE_LOCATION)==
                    PackageManager.PERMISSION_GRANTED){
                LocationPremissionsGranted = true;

            } else {
                ActivityCompat.requestPermissions(this,permissions,.LOCATION_PERMISSION);
        }

        } else {
            ActivityCompat.requestPermissions(this,permissions,.LOCATION_PERMISSION_REQUEST);
        }
    }

    @Override
    public void onRequestPremissionsResult (int requestcode, @NonNull String [] permissions,
                                            LocationPremissionGranted = false;
















    }




}
