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
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;


public class InstructorActivity extends ActionBarActivity {
    // fields
    private Instructor mInstructor;
    private Button mSave;
    private Button mCancel;
    private EditText mName;
    private EditText mTitle;
    private EditText mEmail;
    private EditText mPhone;
    private EditText mOffice;
    private EditText mShortBio;
    private ImageView mImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructor);

        // buttons
        mSave = (Button) findViewById(R.id.btnSaveInstructor);
        mCancel = (Button) findViewById(R.id.btnCourseCancel);

        mImage = (ImageView) findViewById(R.id.image);

        // Text Widgets
        mName = (EditText) findViewById(R.id.name);
        mTitle = (EditText) findViewById(R.id.title);
        mEmail = (EditText) findViewById(R.id.email);
        mPhone = (EditText) findViewById(R.id.phone);
        mOffice = (EditText) findViewById(R.id.office);
        mShortBio = (EditText) findViewById(R.id.sbio);

        mSave.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mInstructor = new Instructor(mName.getText().toString(), mTitle.getText().toString(),
                        mImage.getId(), mEmail.getText().toString(), mPhone.getText().toString(),
                        mOffice.getText().toString(), mShortBio.getText().toString(),
                        new ArrayList<Course>());

                Toast.makeText(InstructorActivity.this, "Instructor saved!", Toast.LENGTH_SHORT).show();
            }
        });

        mCancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(InstructorActivity.this, CourseActivity.class);
                InstructorActivity.this.startActivity(myIntent);
            }
        });

    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        outState.putSerializable("instructor", mInstructor);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        mInstructor = (Instructor) savedInstanceState.getSerializable("instructor");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_instructor, menu);
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
