package android.override;

import android.content.Context;
import android.content.Intent;

public class FunfInstrument {
    public static void sendEvent(Context context, String event) {
        Intent notifyIntent = new Intent("edu.mit.media.funf.bgcollector.MainPipeline");
        notifyIntent.putExtra("PKG_NAME", context.getPackageName());
        notifyIntent.putExtra("CLS_NAME", context.getClass().getName());
        notifyIntent.putExtra("EVENT_NAME", event);
        context.startService(notifyIntent);
    }
}
