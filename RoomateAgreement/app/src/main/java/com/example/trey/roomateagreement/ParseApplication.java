package com.example.trey.roomateagreement;

/**
 * Created by bikram on 22/10/15.
 */

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseUser;

public class ParseApplication extends Application {

    private String YOUR_APPLICATION_ID = "aBIEqBD7KRp4m9Ba3Y3vgtDxx5IH5mwa7bt7neW0";
    private String YOUR_CLIENT_KEY = "TtmbTYwMEwJDfvZhjmmyiFKy9Ow802uWTQQQDpo4";
    @Override
    public void onCreate() {
        super.onCreate();

        // Add your initialization code here
        Parse.initialize(this, YOUR_APPLICATION_ID, YOUR_CLIENT_KEY);

        ParseUser.enableAutomaticUser();
        ParseACL defaultACL = new ParseACL();

        // If you would like all objects to be private by default, remove this
        // line.
        defaultACL.setPublicReadAccess(true);

        ParseACL.setDefaultACL(defaultACL, true);
    }

}
