package com.example.administrator.androidstatemode;

/**
 * auther：wzy
 * date：2017/1/2 17 :09
 * desc:
 */

public class TVControl implements ITVControl, ITVStateOperate {
    private ITVStateOperate mITVStateOperate;

    @Override
    public void open() {
        mITVStateOperate = new TvOpenStateOperate();
    }

    @Override
    public void close() {
        mITVStateOperate = new TvCloseStateOperate();
    }


    @Override
    public void changeToNext() {
        mITVStateOperate.changeToNext();
    }

    @Override
    public void changeToPre() {
        mITVStateOperate.changeToPre();
    }

    @Override
    public void openOrClose() {
        mITVStateOperate.openOrClose();
    }
}
