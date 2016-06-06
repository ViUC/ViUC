package com.synapsehub.viuc;

import android.app.Application;
import android.content.SharedPreferences;

import com.firebase.client.Firebase;


/**
 * Created by Michel on 06/06/2016.
 */
public class ViucApplication extends Application{

    public static Firebase viucBackend;
    public static SharedPreferences prefs;


    @Override
    public void onCreate(){
        super.onCreate();
        prefs=getSharedPreferences("com.synapsehub.viuc",MODE_PRIVATE);
        Firebase.setAndroidContext(this);
        Firebase.getDefaultConfig().setPersistenceEnabled(true);
        viucBackend=new Firebase(Config.BACKEND_URL);
    }

}
