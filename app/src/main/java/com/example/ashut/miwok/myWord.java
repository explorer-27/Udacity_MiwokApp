package com.example.ashut.miwok;

/**
 * Created by ashut on 04-05-2017.
 */

public class myWord {
    private String mMiwokTranslation,mDefaultTranslation;
    private int mimgSrc;

    public myWord(String MiwokTranslation,String DefaultTranslation,int imgSrc)
    {
        mDefaultTranslation=DefaultTranslation;
        mMiwokTranslation=MiwokTranslation;
        mimgSrc=imgSrc;
    }
    public  String getMiwokTranslation(){
        return mMiwokTranslation;
    }
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }
    public int getImgSrc(){
        return mimgSrc;
    }
}
