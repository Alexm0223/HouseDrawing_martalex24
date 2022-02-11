import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;

public class HouseView extends SurfaceView {
    Paint housePaint = new Paint();
    Paint roofPaint = new Paint();
    Paint grassPaint = new Paint();
    Paint skyPaint = new Paint();
    Paint sunPaint = new Paint();
    Paint windowPaint = new Paint();

    public static final float houseTop = 300.0f;
    public static final float houseLeft = 100.0f;
    public static final float houseWidth = 1200.0f;
    public static final float houseHeight = 200.0f;
    public static final float roofHeight = 50.0f;
    public static final float roofWidth = 50.0f;
    public static final float grassHeight = 300.0f;
    public static final float grassWidth = 400.0f;
    public static final float windowHeight = 30.0f;
    public static final float windowWidth = 6.0f;
    public static final float skyHeight = 30.0f;
    public static final float skyWidth = 15.0f;
    public static final float sunRadius = 30.0f;



    public HouseView(Context context, AttributeSet attrs) {
        super(context, attrs);

        //This is essential or your onDraw method won't get called
        setWillNotDraw(false);

        //Setup our palette


        setBackgroundColor(Color.WHITE);  //better than black default

    }

    public void drawHouse(Canvas canvas, float left, float bottom) {
        canvas.drawRect(left, bottom - houseHeight, left + houseWidth, bottom, candlePaint);

        //draw the outer flame
        float flameCenterX = left + candleWidth / 2;
        float flameCenterY = bottom - wickHeight - candleHeight - outerFlameRadius / 3;
        canvas.drawCircle(flameCenterX, flameCenterY, outerFlameRadius, outerFlamePaint);

        //draw the inner flame
        flameCenterY += outerFlameRadius / 3;
        canvas.drawCircle(flameCenterX, flameCenterY, innerFlameRadius, innerFlamePaint);

        //draw the wick
        float wickLeft = left + candleWidth / 2 - wickWidth / 2;
        float wickTop = bottom - wickHeight - candleHeight;
        canvas.drawRect(wickLeft, wickTop, wickLeft + wickWidth, wickTop + wickHeight, wickPaint);

    }
}