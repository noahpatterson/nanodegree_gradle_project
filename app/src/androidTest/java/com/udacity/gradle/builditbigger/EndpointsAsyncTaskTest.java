package com.udacity.gradle.builditbigger;

import android.os.AsyncTask;
import android.test.AndroidTestCase;

import com.udacity.gradle.builditbigger.services.EndpointsAsyncTask;

import java.util.concurrent.CountDownLatch;

/**
 * Created by noahpatterson on 12/23/15.
 */
public class EndpointsAsyncTaskTest extends AndroidTestCase implements EndpointsAsyncTask.OnTaskCompleted{
    CountDownLatch signal = null;
    String response;

    @Override
    protected void setUp() throws Exception {
        signal = new CountDownLatch(1);
    }

    @Override
    protected void tearDown() throws Exception {
        signal.countDown();
    }

    public void testAsyncTaskReturnsAJoke() throws InterruptedException {
        new EndpointsAsyncTask(this).execute(getContext());
        signal.await();

        assertTrue(response != null && !response.isEmpty());

    }

    @Override
    public void onTaskCompleted(String response) {
        this.response = response;
        signal.countDown();
    }
}
