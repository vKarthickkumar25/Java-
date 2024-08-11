package com.bestbuy.utils;

import java.net.HttpURLConnection;
import java.net.URL;

public class Utils {
    public static boolean isLinkBroken(String linkUrl) {
        try {
            URL url = new URL(linkUrl);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("HEAD");
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();
            return responseCode >= 400;
        } catch (Exception e) {
            return true;
        }
    }
}
