package com.sample.cssapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class CourseActivity extends ActionBarActivity {

    private Course mCourse;

    private Button button;
    private Button saveCourse;
    private EditText mCourseID,mShort,mLong,mPrereq;
    private String name,sDesc,lDesc,prereq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);

        button = (Button) findViewById(R.id.btnInsturct);
        saveCourse = (Button) findViewById(R.id.btnSaveCourse);

        mCourseID = (EditText)findViewById(R.id.courseID);
        name = mCourseID.getText().toString();
        mShort = (EditText)findViewById(R.id.sDescription);
        sDesc = mCourseID.getText().toString();
        mLong = (EditText)findViewById(R.id.lDescription);
        lDesc = mCourseID.getText().toString();
        mPrereq = (EditText)findViewById(R.id.prereq);
        prereq = mCourseID.getText().toString();

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent myIntent = new Intent(CourseActivity.this, InstructorActivity.class);
                CourseActivity.this.startActivity(myIntent);
            }
        });

        saveCourse.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });

    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);

        outState.putSerializable("course", mCourse);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        mCourse = (Course) savedInstanceState.getSerializable("course");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_course, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
