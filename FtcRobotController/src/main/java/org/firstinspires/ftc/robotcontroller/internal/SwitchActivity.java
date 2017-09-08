package org.firstinspires.ftc.robotcontroller.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.qualcomm.ftcrobotcontroller.R;

public class SwitchActivity extends Activity {
    Button createAutoProgram;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch);

        createAutoProgram = (Button)findViewById(R.id.new_auto);
        createAutoProgram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCreateAuto();
            }
        });
    }

    private void openCreateAuto() {
        Intent intent = new Intent(this, CreateAuto.class);
        startActivity(intent);
    }
}
