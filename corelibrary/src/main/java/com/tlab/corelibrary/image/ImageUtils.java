package com.tlab.corelibrary.image;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

/**
 * Created by Rio Swarawan on 9/19/18.
 */
public class ImageUtils {

    public void loadImageByUrl(Context context,
                               String url,
                               ImageView into) {
        Glide.with(context)
                .load(url)
                .apply(new RequestOptions()
                        .dontAnimate())
                .into(into);
    }
}
