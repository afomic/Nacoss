package com.afomic.nacoss.services;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import com.afomic.nacoss.data.Constants;
import com.afomic.nacoss.data.TimeTableData;
import com.afomic.nacoss.model.TimeTableClass;

import java.util.ArrayList;
import java.util.Calendar;

/**
 * Created by afomic on 06-Dec-16.
 *
 */

public class BootReceiver extends BroadcastReceiver {

    int[] dates={Calendar.MONDAY,Calendar.TUESDAY,Calendar.WEDNESDAY,Calendar.THURSDAY,Calendar.FRIDAY};
    @Override
    public void onReceive(Context context, Intent intent) {
        NotificationService alarm=new NotificationService(context);
        if (intent.getAction().equals("android.intent.action.BOOT_COMPLETED")) {
            TimeTableData data=new TimeTableData(context);
            ArrayList<TimeTableClass> classes=data.getTimeTable();
            for(TimeTableClass event:classes){
                alarm.setAlarm(event);
            }
        }
    }

}
