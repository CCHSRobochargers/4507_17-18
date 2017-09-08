package org.firstinspires.ftc.robotcontroller.internal;

import android.app.Activity;
import android.app.AlertDialog;

/**
 * Created by CAD1 on 8/31/2017.
 */

public class METHODS {

    public enum MethodList {
        MOVE_STRIAGHT,
        MOVE_TURN
    }

    public class MoveStraightParams {
        public void promptParams(Activity activity, double min, double max) {
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setMessage("Distance (Inches)")
                   .setTitle("MoveStraight");
        }
    }

}
