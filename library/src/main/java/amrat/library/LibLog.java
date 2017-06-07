package amrat.library;

import android.util.Log;

public class LibLog {

    private static final String TAG = "LibLog";

    public static void d(String string) {
        Log.d(TAG, string);
    }
}