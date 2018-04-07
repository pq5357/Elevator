package sg.com.elevator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;

/**
 * 电梯控件
 * Created by sg on 2018/4/7.
 */

public class ElevatorView extends RelativeLayout {

    private NoticeView noticeView;

    private ControlPanel controlPanel;

    private ElevatorRoom elevatorRoom;

    public ElevatorView(Context context, AttributeSet attrs) {
        super(context, attrs);

        LayoutInflater.from(context).inflate(R.layout.elevator_view, this,true);
    }



}
