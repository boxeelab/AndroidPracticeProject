package com.example.dmondal.notification;


import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnSimpleNotication = (Button) findViewById(R.id.btn_simple_notification);
        btnSimpleNotication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, MainActivity.this.getResources().getText(R.string.simple_notification), Toast.LENGTH_LONG).show();
                step1SimpleNotification();
            }
        });


        Button btnExpandedLayoutNotification = (Button) findViewById(R.id.btn_expanded_layout_notification);
        btnExpandedLayoutNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, MainActivity.this.getResources().getText(R.string.expanded_layout_notification), Toast.LENGTH_LONG).show();
                step2ExpandedLayoutNotification();
            }
        });

        Button btnTaskStackBackNotification = (Button) findViewById(R.id.btn_task_stackback_notification);
        btnTaskStackBackNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, MainActivity.this.getResources().getText(R.string.task_stackback_notification), Toast.LENGTH_LONG).show();
                step3TaskStackBackNotification();
            }
        });

        Button btnFourCustomLayoutNotification = (Button) findViewById(R.id.btn_custom_layout_notification);
        btnFourCustomLayoutNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, MainActivity.this.getResources().getText(R.string.custom_layout_notification), Toast.LENGTH_LONG).show();
                step4CustomLayoutNotification();
            }
        });

        Button btnBuildMultiPageWearNotification = (Button) findViewById(R.id.btn_multi_page_wear_notification);
        btnBuildMultiPageWearNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, MainActivity.this.getResources().getText(R.string.multi_page_wear_notification), Toast.LENGTH_LONG).show();
                step5BuildMultiPageWearNotification();
            }
        });


    }


    protected void step1SimpleNotification() {
        NotificationManager notificationManager = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
        NotificationCompat.Builder notificationBuilder  = new NotificationCompat.Builder(this);
        notificationBuilder.setSmallIcon(R.mipmap.ic_launcher);
        notificationBuilder.setContentTitle("Simple Notification");
        notificationBuilder.setContentText("Test file content");
        notificationBuilder.setAutoCancel(true);
        // Launch mainactivity when notification is cliked
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 1,new Intent(this,MainActivity.class) ,PendingIntent.FLAG_UPDATE_CURRENT);
        notificationBuilder.setContentIntent(pendingIntent);
        notificationManager.notify(1,notificationBuilder.build());
    }

    protected void step2ExpandedLayoutNotification() {

    }

    protected void step3TaskStackBackNotification() {

    }

    protected void step4CustomLayoutNotification() {

    }


    protected void step5BuildMultiPageWearNotification() {

    }
}
