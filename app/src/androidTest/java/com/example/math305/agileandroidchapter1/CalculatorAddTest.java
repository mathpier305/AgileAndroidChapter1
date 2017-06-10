package com.example.math305.agileandroidchapter1;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.ActivityInstrumentationTestCase2;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by math305 on 6/7/2017.
 */
@RunWith(AndroidJUnit4.class)
public class CalculatorAddTest{
    @Rule
    public ActivityTestRule<CalculatorActivity> mActivity = new ActivityTestRule<CalculatorActivity>(CalculatorActivity.class);


    public static final String THREE = "3";
    public static final String FOUR = "4";
    public static final String RESULT = "7.0";



    @Test
    public void testCalculatorAdd(){
        onView(withId(R.id.operand_one_edit_text)).perform(typeText(THREE));
        onView(withId(R.id.operand_two_edit_text)).perform(typeText(FOUR));
        onView(withId(R.id.operation_add_btn)).perform(click());
        onView(withId(R.id.operation_result_text_view)).check(matches(withText(RESULT)));
    }

}
