package com.zxning.library.tool;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.IOException;
import java.io.InputStream;

public class StreamUtils {
    private static final int STROKE_WIDTH = 4;

    //从assets资源中获取图片
    public static Bitmap getBitmap(Context context, String filename) {


        Bitmap image = null;
        AssetManager am = context.getResources().getAssets();
        try {

            InputStream is = am.open(filename);
            image = BitmapFactory.decodeStream(is);
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return image;
    }

}
