package com.flyweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Lenovo on 2018/3/10.
 */

public class HttpUtil {
    public static void sendOKHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
