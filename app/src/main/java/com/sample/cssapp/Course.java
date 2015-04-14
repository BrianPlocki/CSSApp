package com.sample.cssapp;

/**
 * Created by Brandon on 4/13/2015.
 */
public class Course {

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

    public String getCourseId() {
        return mCourseId;
    }

    public void setCourseId(String mCourseId) {
        this.mCourseId = mCourseId;
    }

    public String getShortCourseDescription() {
        return mShortCourseDescription;
    }

    public void setShortCourseDescription(String mShortCourseDescription) {
        this.mShortCourseDescription = mShortCourseDescription;
    }

    public String getLongCourseDescription() {
        return mLongCourseDescription;
    }

    public void setLongCourseDescription(String mLongCourseDescription) {
        this.mLongCourseDescription = mLongCourseDescription;
    }

    public String getPrerequisites() {
        return mPrerequisites;
    }

    public void setPrerequisites(String mPrerequisites) {
        this.mPrerequisites = mPrerequisites;
    }
}
