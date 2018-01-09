package com.passerbywhu.wechatautorecord;

import android.accessibilityservice.AccessibilityService;
import android.app.Notification;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.view.accessibility.AccessibilityEvent;

/**
 * Created by hzwuwenchao on 2018/1/9.
 */

public class DetectService extends AccessibilityService {
    private static final int DETECT_ID = 0x0001;
    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
        builder.setContentTitle("title").setSmallIcon(R.drawable.ic_launcher_foreground);
        Notification notification = builder.build();
        startForeground(DETECT_ID, notification);
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onAccessibilityEvent(AccessibilityEvent event) {

    }

    @Override
    public void onInterrupt() {

    }
}
