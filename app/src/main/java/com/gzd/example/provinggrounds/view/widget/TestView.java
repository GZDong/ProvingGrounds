package com.gzd.example.provinggrounds.view.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RegionIterator;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by gzd on 2019/6/2 0002
 */
public class TestView extends View {
    public TestView(Context context) {
        super(context);
    }

    public TestView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TestView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.translate(100,100);
        Paint paint = new Paint();
        paint.setColor(Color.GREEN);
        paint.setAlpha(100);
        paint.setStyle(Paint.Style.FILL);
//        paint.setStrokeWidth(50);
//        canvas.drawColor(0xFF00FF00);
        canvas.drawCircle(100, 200, 100, paint);
        paint.setColor(0xABFF0000);
        canvas.drawCircle(100,200,50, paint);
        RectF rectF = new RectF(10f, 10f, 100f, 100f);
        canvas.drawRect(rectF, paint);
        Path path = new Path();
        path.moveTo(155,155);
        path.lineTo(205, 250);
        path.lineTo(300, 267);
        canvas.drawPath(path, paint);

        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5);
        path.moveTo(100, 90);
        RectF rectF1 = new RectF(200, 30, 300, 150);
        path.arcTo(rectF1, 0, 120, true);
        canvas.drawPath(path, paint);
        canvas.drawRect(rectF1, paint);

        Paint paint1 = new Paint();
        paint1.setStyle(Paint.Style.FILL);
        paint1.setColor(Color.GREEN);

        Path ovalPath = new Path();
        RectF rectF2 = new RectF(55, 55, 200, 500);
        ovalPath.addOval(rectF2, Path.Direction.CW);
//        Region region = new Region(new Rect(50, 50, 200, 100));  // 直接构造
        Region region = new Region();
        region.setPath(ovalPath, new Region(50, 50, 200, 200));
        drawRegion(canvas, region, paint1);
    }

    private void drawRegion(Canvas canvas, Region region, Paint paint1) {
        RegionIterator iter = new RegionIterator(region);
        Rect r = new Rect();

        while (iter.next(r)){
            canvas.drawRect(r, paint1);
        }
    }
}
