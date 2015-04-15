package com.sample.cssapp;

import java.io.Serializable;

/**
 * Created by Brandon on 4/13/2015.
 */
public class Course implements Serializable {

    private String mCourseId;
    private String mShortCourseDescription;
    private String mLongCourseDescription;
    private String mPrerequisites;

    public Course(String courseId,String shortCourseDescription,String longCourseDescription,String prerequisites) {

        mCourseId = courseId;
        mShortCourseDescription = shortCourseDescription;
        mLongCourseDescription = longCourseDescription;
        mPrerequisites = prerequisites;
    }

    public String getmCourseId() {
        return mCourseId;
    }

    public void setmCourseId(String mCourseId) {
        this.mCourseId = mCourseId;
    }

    public String getmShortCourseDescription() {
        return mShortCourseDescription;
    }

    public void setmShortCourseDescription(String mShortCourseDescription) {
        this.mShortCourseDescription = mShortCourseDescription;
    }

    public String getmLongCourseDescription() {
        return mLongCourseDescription;
    }

    public void setmLongCourseDescription(String mLongCourseDescription) {
        this.mLongCourseDescription = mLongCourseDescription;
    }

    public String getmPrerequisites() {
        return mPrerequisites;
    }

    public void setmPrerequisites(String mPrerequisites) {
        this.mPrerequisites = mPrerequisites;
    }
}
