package com.example.ashut.miwok;

/**
 * Created by ashut on 04-05-2017.
 */

public class myPhrases {
    private String mMiwokTranslation,mDefaultTranslation;

    public myPhrases(String MiwokTranslation,String DefaultTranslation)
    {
        mDefaultTranslation=DefaultTranslation;
        mMiwokTranslation=MiwokTranslation;
    }
    public  String getMiwokTranslation(){
        return mMiwokTranslation;
    }
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }
}
