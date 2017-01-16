package com.example.harpreetsingh.geoapplication;

import android.app.IntentService;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by harpreetsingh on 2017-01-16.
 */

public class SendService extends IntentService {
    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     * @param// name Used to name the worker thread, important only for debugging.
     */
    public SendService() {
        super("New Service");
    }

    @Override
    public void onCreate() {

        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

            String msgs = intent.getStringExtra("msg");
        Toast.makeText(this, "sending message "+msgs+"...", Toast.LENGTH_SHORT).show();

        stopSelf();
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        Toast.makeText(this, "Sent!", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onHandleIntent(Intent intent) {



    }

}

