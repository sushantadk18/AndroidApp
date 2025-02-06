package com.example.level6;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
    private Context context;
    public int[] Images={R.drawable.img,
            R.drawable.img1,
            R.drawable.img2,
            R.drawable.img3,
            R.drawable.img4


    };
    public ImageAdapter (Context context){
        this.context=context;
    }


    @Override
    public int getCount() {
        return Images.length;
    }

    @Override
    public Object getItem(int i) {
        return Images[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView=new ImageView(context);
        imageView.setScaleType(imageView.getScaleType());
        imageView.setImageResource(Images[i]);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(150,150));
        return imageView;
    }
}
