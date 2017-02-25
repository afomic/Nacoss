package com.afomic.nacoss.util;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.os.Environment;
import android.util.Log;
import android.widget.Toast;

import com.afomic.nacoss.data.Constants;
import com.afomic.nacoss.data.TimeTableData;
import com.afomic.nacoss.model.TimeTableClass;
import com.afomic.nacoss.services.NotificationService;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.jar.Manifest;

import static com.afomic.nacoss.data.Constants.TAG;

/**
 * Created by afomic on 14-Dec-16.
 * this is the class that convert the time table content into json
 */

public class TimeTableConvert {
    private TimeTableData dbData;
    private NotificationService alarm;
    public TimeTableConvert(Context c){
        dbData=new TimeTableData(c);
        alarm=new NotificationService(c);
    }
    public JSONArray toJsonArray() throws JSONException{
        ArrayList<TimeTableClass> classes=dbData.getTimeTable();
        JSONArray array=new JSONArray();
        for(TimeTableClass item:classes){
            array.put(item.toJson());
        }
        return array;
    }
    public void importTimeTable(JSONArray array)throws JSONException{
        for(int i=0;i<array.length();i++) {
            JSONObject object = array.getJSONObject(i);
            TimeTableClass item = new TimeTableClass(object);
            dbData.addClass(item);
            alarm.setAlarm(item);
        }
    }

    public void  saveData(String data){
        File f = new File(Environment.getExternalStorageDirectory(), "nacoss");
        if (!f.exists()) {
            f.mkdirs();
        }
        File file = new File(f,"TimeTable.txt");
        FileOutputStream os=null;
        try{
            os=new FileOutputStream(file);
            os.write(data.getBytes());
            os.close();
        }catch (Exception e) {
            e.printStackTrace();
        }

    }

}
