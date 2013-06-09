package com.cuuuurzel.radianshour;

import android.app.Service;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Intent;
import android.os.IBinder;
import android.widget.RemoteViews;


public class MyService extends Service {
		
	@Override
	public void onCreate() {
		super.onCreate();
	}

	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		buildUpdate();

		return super.onStartCommand(intent, flags, startId);
	}

	private void buildUpdate() {
		RemoteViews view = new RemoteViews( getPackageName(), R.layout.widgetlayout );

		//Push update for this widget to the home screen
		ComponentName thisWidget = new ComponentName( this, SimpleWidgetProvider.class );
		AppWidgetManager manager = AppWidgetManager.getInstance(this);
		manager.updateAppWidget( thisWidget, view );
	}

	@Override
	public IBinder onBind(Intent intent) {
		return null;
	}
}