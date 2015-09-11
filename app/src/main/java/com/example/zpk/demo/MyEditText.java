package com.example.zpk.demo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * Created by zpk on 2015/9/10.
 */
public class MyEditText extends EditText {

    private String str="";

    public MyEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public MyEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyEditText(Context context) {
        super(context);
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setTextSize(30);
        paint.setColor(Color.BLUE);
        paint.setAntiAlias(true);
        canvas.drawText(str,getWidth(),getHeight(),paint);
    }
}
