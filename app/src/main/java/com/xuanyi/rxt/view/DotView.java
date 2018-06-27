package com.xuanyi.rxt.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import com.xuanyi.rxt.R;

/**
 */
public class DotView extends View {

    //均匀间隔的直线.

    public static final int DOT_WIDTH = 10;
    //直线横向.
    public static final int HORIZONTAL = 0;
    //直线纵向
    public static final int VERTICAL = 1;
    //默认点数量.
    private static int DEFAULT_DOT_NUM = 10;

    //默认线宽.
    private static int DEFAULT_LINE_WIDTH = 2;

    //默认线色.
    private static int DEFAULT_LINE_COLOR = Color.RED;

    //线色.
    private int lineColor;

    //线宽.
    private int lineWidth;

    //点数.
    private int dotNum;

    //方向.
    private int lineOriental;

    //小线宽度.
    private int dotWidth;

    public DotView(Context context) {
        super(context);
        initAttributeSet(context, null);
    }

    public DotView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initAttributeSet(context, attrs);
    }

    //属性初始化.
    private void initAttributeSet(Context context, AttributeSet attrs) {
        if (null != attrs) {
            TypedArray typedArray = context.getTheme().obtainStyledAttributes(attrs, R.styleable.DotView, 0, 0);
            try {
                lineColor = typedArray.getColor(R.styleable.DotView_lineColor,
                        DEFAULT_LINE_COLOR);
                lineWidth = typedArray.getColor(R.styleable.DotView_lineWidth,
                        DEFAULT_LINE_WIDTH);
                dotNum = typedArray.getColor(R.styleable.DotView_dotNum,
                        DEFAULT_DOT_NUM);
                lineOriental = typedArray.getInt(R.styleable.DotView_lineOriental,
                        HORIZONTAL);
                dotWidth = typedArray.getInt(R.styleable.DotView_dotWidth,
                        DOT_WIDTH);
            } finally {
                typedArray.recycle();
            }
        } else {
            lineColor = DEFAULT_LINE_COLOR;
            lineWidth = DEFAULT_LINE_WIDTH;
            lineOriental = HORIZONTAL;
        }
    }


    public void setDotWidth(int dotWidth) {
        this.dotWidth = dotWidth;
    }

    public void setLineColor(int lineColor) {
        this.lineColor = lineColor;
    }

    public void setLineWidth(int lineWidth) {
        this.lineWidth = lineWidth;
    }

    public void setDotNum(int dotNum) {
        this.dotNum = dotNum;
    }

    public void setLineOriental(int lineOriental) {
        this.lineOriental = lineOriental;
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setAntiAlias(true);//抗锯齿功能
        paint.setStyle(Paint.Style.FILL);//设置填充样式   Style.FILL/Style.FILL_AND_STROKE/Style.STROKE
        paint.setStrokeWidth(lineWidth);//设置画笔宽度
        paint.setShadowLayer(10, 15, 15, Color.GREEN);//设置阴影
        //设置画布背景颜色
        //canvas.drawRGB(255, 255, 255);
        //drawBackground(canvas,paint);
        if (lineOriental == VERTICAL) {
            drawVerticalLine(canvas, paint);
        } else {//Horizontal
            drawHorizontalLine(canvas, paint);
        }

    }

    private void drawHorizontalLine(Canvas canvas, Paint paint) {
        paint.setColor(lineColor);//设置画笔颜色
        int startY = this.getHeight() / 2;
        int stopY = this.getHeight() / 2;
        int maxX = this.getWidth();
        int spacingX = dotWidth;
        int stopX = dotWidth;

        for (int startX = 0; startX < maxX; startX += (spacingX + dotWidth)) {
            Log.i(this.getClass().getName(), "startX:" + startY + "--" + "stopX:" + stopX);
            canvas.drawLine(startX, startY, stopX, stopY, paint);
            stopX += (spacingX + dotWidth);
            if (stopX > maxX) {
                stopX = maxX;
            }
        }
    }

    private void drawVerticalLine(Canvas canvas, Paint paint) {
        paint.setColor(lineColor);//设置画笔颜色
        int startX = this.getWidth() / 2;
        int stopX = this.getWidth() / 2;
        int maxY = this.getHeight();
        int heightY = this.getHeight() / dotNum;
        int spacingY = heightY;
        int stopY = heightY;
        for (int startY = 0; startY < maxY; startY += (spacingY + heightY)) {
            Log.i(this.getClass().getName(), "startY:" + startY + "--" + "stopY:" + stopY);
            canvas.drawLine(startX, startY, stopX, stopY, paint);
            stopY += (spacingY + heightY);
            if (stopY > maxY) {
                stopY = maxY;
            }
        }
    }
}

//初始化控件背景.
//    private void drawBackground(Canvas canvas,Paint paint) {
//        //setBackgroundColor(this.getResources().getColor(R.color.colorAccent));
//        //若是非编辑模式.
//        /*if (!isInEditMode()) {
//            setBackgroundColor(this.getResources().getColor(R.color.colorAccent));
//            如果当前控件背景为null
//            if (getBackground() == null) {
//                //设置背景为透明色.
//                setBackgroundColor(this.getResources().getColor(R.color.colorAccent));
//            }
//        }*/
//        paint.setColor(Color.RED);//设置画笔颜色
//        float left = 0;
//        float top = 0;
//        float right = getWidth();
//        float bottom = getHeight();
//        RectF drawingArea = new RectF(left, top, right, bottom);
//        Path path = new Path();
//        //canvas.drawPath(path, defaultStrokePaint);
//        canvas.drawRect(left, top, right, bottom, paint);
//    }