package org.firstinspires.ftc.robotcontroller.internal;

import android.app.Activity;
import android.os.Bundle;

import com.qualcomm.ftcrobotcontroller.R;

public class CreateAuto extends Activity {
    METHODS methods;
    METHODS.MoveStraightParams moveStraightParams;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_auto);

        methods = new METHODS();
        moveStraightParams = methods.new MoveStraightParams();

        moveStraightParams.promptParams(this, -1.0, 1.0);

    }
}
