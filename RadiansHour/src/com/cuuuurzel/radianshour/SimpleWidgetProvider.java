package com.cuuuurzel.radianshour;

import android.appwidget.AppWidgetProvider;
/*
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.widget.RelativeLayout;
import android.app.PendingIntent;
import android.app.AlarmManager;
import android.content.Intent;
import android.os.SystemClock;
*/

public class SimpleWidgetProvider extends AppWidgetProvider {
	/*
	private PendingIntent service = null;

	@Override
	public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
		final AlarmManager m = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);

		final Intent i = new Intent(context, MyService.class);

		if (service == null) {
			service = PendingIntent.getService( context, 0, i, PendingIntent.FLAG_CANCEL_CURRENT );
		}

		m.setRepeating( AlarmManager.RTC, SystemClock.elapsedRealtime(), 1000, service );
	}
	
	@Override
	public void onDisabled( Context context ) {
		final AlarmManager m = (AlarmManager) context.getSystemService( Context.ALARM_SERVICE );
		m.cancel( service );
	}
	*/
}