package sg.com.elevator;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

/**
 * 电梯厢(整个)
 * Created by sg on 2018/4/7.
 */

public class ElevatorCar extends RelativeLayout{


    public ElevatorCar(Context context, AttributeSet attrs) {
        super(context, attrs);

        LayoutInflater.from(context).inflate(R.layout.elevator_car, this, true);

    }
}
