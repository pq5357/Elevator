package sg.com.elevator;

import android.content.Context;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;

/**
 * 电梯主体结构
 * Created by sg on 2018/4/7.
 */

public class ElevatorRoom extends RelativeLayout {

    private DirectionPanel directionPanel;

    private ElevatorCar elevatorCar;


    public ElevatorRoom(Context context, AttributeSet attrs) {
        super(context, attrs);

        LayoutInflater.from(context).inflate(R.layout.elevator_room,this,true);

    }
}


