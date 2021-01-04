package com.example.lenovo.doctorapp.Controller;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import android.view.View;

import androidx.test.rule.ActivityTestRule;




import static org.junit.Assert.assertNotNull;

public class DocLoginTest {

    @Rule
    public ActivityTestRule<MainActivity>mActivityTestRule= new ActivityTestRule<MainActivity>(MainActivity.class);
    private MainActivity mActivity=null;


    @Before
    public void setUp() throws Exception {
        mActivity=mActivityTestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View v= mActivity.findViewById(.id.login);
        assertNotNull(v);
    }



    @After
    public void tearDown() throws Exception {
        mActivity=null;
    }
}
