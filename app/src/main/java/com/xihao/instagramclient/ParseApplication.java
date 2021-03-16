package com.xihao.instagramclient;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("2I6pFA5g2Azph0IqgSlW5oDfiSLugAavJEThr0Sd")
                .clientKey("gcLsQzhm6NT5Q4oRVO31QgELrGIJH58LkTMpLElE")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
