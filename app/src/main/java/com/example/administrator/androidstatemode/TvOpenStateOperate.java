package com.example.administrator.androidstatemode;

import android.util.Log;

/**
 * auther：wzy
 * date：2017/1/2 17 :02
 * desc:
 */

public class TvOpenStateOperate implements ITVStateOperate {
    private static final String TAG = "TvOpenStateOperate";

    @Override
    public void changeToNext() {
        Log.i(TAG, "changeToNext");
    }

    @Override
    public void changeToPre() {
        Log.i(TAG, "changeToPre");
    }

    @Override
    public void openOrClose() {
        Log.i(TAG, "close");
    }
}
