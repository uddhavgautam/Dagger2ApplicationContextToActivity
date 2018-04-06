package com.example.gaute.dagger2passapplicationcontext;

import org.junit.Test;

import javax.inject.Inject;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Inject
    private MainActivity mainActivity;

    @Test
    public void testOnStartMainActivity() {
        mainActivity.onStart();
    }
}