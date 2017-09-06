package org.firstinspires.ftc.teamcode;

import android.util.Log;

import com.qualcomm.robotcore.hardware.GyroSensor;

/**
 * Created by CAD1 on 8/31/2017.
 */

public class GyroManager implements Runnable {
    private GyroSensor gyro;
    private Thread thread;
    private boolean killThread;

    public GyroManager (GyroSensor gyro) {
        this.gyro = gyro;
        thread = new Thread("GyroManager");
    }

    public void initialize() {
        killThread = false;
        gyro.calibrate();
        thread.start();
    }

    public synchronized int getAngle() {
        return 0;
    }

    @Override
    public void run() {
        while (gyro.isCalibrating()) {
            Log.i("Gyro Status:", "Calibrating");
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                Log.e("Error:", e.toString());
            }
        }

        while (!killThread) {

        }
    }
}
