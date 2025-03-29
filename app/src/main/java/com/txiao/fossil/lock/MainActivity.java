package com.txiao.fossil.lock;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        NotificationManager mNotificationManager =
                (NotificationManager) this.getSystemService(Context.NOTIFICATION_SERVICE);
        Util.configure(this.getApplicationContext(), mNotificationManager);

        setContentView(R.layout.activity_main);

        super.onCreate(savedInstanceState);

    }
}
