package com.sample.cssapp;

import android.media.Image;

import java.util.List;

/**
 * Created by Brandon on 4/13/2015.
 */
public final class Instructor {
    private String mName;
    private String mTitle;
    private Image mImage;
    private String mEmail;
    private String mPhoneNumber;
    private String mOffice;
    private String mShortBio;
    private List<Course> mCourses;

    public Instructor(String name, String title, Image image, String email,
                      String phoneNumber, String office, String shortBio,
                      List<Course> courses) {
        mName = name;
        mTitle = title;
        mImage = image;
        mEmail = email;
        mPhoneNumber = phoneNumber;
        mOffice = office;
        mShortBio = shortBio;
        mCourses = courses;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public Image getImage() {
        return mImage;
    }

    public void setImage(Image image) {
        mImage = image;
    }

    public String getEmail() {
        return mEmail;
    }

    public void setEmail(String email) {
        mEmail = email;
    }

    public String getPhoneNumber() {
        return mPhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        mPhoneNumber = phoneNumber;
    }

    public String getOffice() {
        return mOffice;
    }

    public void setOffice(String office) {
        mOffice = office;
    }

    public String getShortBio() {
        return mShortBio;
    }

    public void setShortBio(String shortBio) {
        mShortBio = shortBio;
    }

    public List<Course> getCourses() {
        return mCourses;
    }

    public void setCourses(List<Course> courses) {
        mCourses = courses;
    }
}
