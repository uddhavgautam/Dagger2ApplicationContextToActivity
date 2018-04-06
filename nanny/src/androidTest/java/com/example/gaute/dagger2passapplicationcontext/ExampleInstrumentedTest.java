package com.example.gaute.dagger2passapplicationcontext;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    @Inject
    MainActivity mainActivity;

    @Test
    public void testOnStartMainActivity() {
        mainActivity.onStart();
    }
}
