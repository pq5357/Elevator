package sg.com.elevator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;

/**
 *
 * 电梯上下控制
 * Created by sg on 2018/4/7.
 */

public class DirectionPanel extends RelativeLayout{


    public DirectionPanel(Context context, AttributeSet attrs) {
        super(context, attrs);

        LayoutInflater.from(context).inflate(R.layout.direction_panel, this, true);

    }
}
