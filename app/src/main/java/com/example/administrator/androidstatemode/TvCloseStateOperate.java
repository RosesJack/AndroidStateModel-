package com.example.administrator.androidstatemode;

import android.util.Log;

/**
 * auther：wzy
 * date：2017/1/2 17 :04
 * desc:
 */

public class TvCloseStateOperate implements ITVStateOperate {
    private static final String TAG = "TvCloseStateOperate";

    @Override
    public void changeToNext() {
        alreadyClose();
    }

    @Override
    public void changeToPre() {
        alreadyClose();
    }

    @Override
    public void openOrClose() {
        Log.i(TAG, "open TV");
    }

    private void alreadyClose() {
        Log.i(TAG, "The TV is already close ,you can do nothing except open it");
    }
}
