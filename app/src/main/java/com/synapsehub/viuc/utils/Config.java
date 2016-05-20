package com.synapsehub.viuc.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import com.synapsehub.viuc.BuildConfig;

/**
 * Created by Mich3lo on 5/11/16.
 */
public class Config {


    public static final String BACKEND_URL = "https://viuc.firebaseio.com";
    public static final String BACKEND_IMAGES_PATH="http://www.viucapp.com";
    public final static String FIREBASE_URL= BuildConfig.UNIQUE_FIREBASE_ROOT_URL;
    public static String USER_CHILD = "USER";
    public static String USSD_CHILD = "USSD";
    public static String USER_STRING = "User";
    public static final String BACKEND_VENUE_PATH="venue";
    public static final String BACKEND_COMMANDE_PATH="commande";
    public static final String FIREBASE_PROPERTY_LIST_NAME = "listName";

    public static Boolean isConnected(Context context){
        ConnectivityManager connectivityManager = (ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        if(networkInfo!=null)
            return true;
        return false;
    }



}
