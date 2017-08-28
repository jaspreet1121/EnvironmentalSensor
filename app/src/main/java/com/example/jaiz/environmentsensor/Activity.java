package com.example.jaiz.environmentsensor;

import android.hardware.SensorEvent;

/**
 * Created by Jaiz on 8/28/2017.
 */

interface Activity {
    void onSensorChanged(SensorEvent event);
}
