package com.example.notekeeper1;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

public class CourseInfo  {

    private final String mCourseId;
    private final String mTitle;
    private final List<ModuleInfo> mModules;

    public CourseInfo(String mCourseId, String mTitle, List<ModuleInfo> mModules) {
        this.mCourseId = mCourseId;
        this.mTitle = mTitle;
        this.mModules = mModules;
    }


    public String getCourseId() {
        //added return null from my to remove an error
        return mCourseId;
    }
}
