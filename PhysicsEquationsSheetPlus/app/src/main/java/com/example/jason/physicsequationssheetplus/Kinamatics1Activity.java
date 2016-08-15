package com.example.jason.physicsequationssheetplus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class Kinamatics1Activity extends AppCompatActivity {
    double vF;
    double v0;
    double a;
    double t;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kinamatics1);

        final EditText velocityF = (EditText) findViewById(R.id.num1);
        final EditText velocity0 = (EditText) findViewById(R.id.num2);
        final EditText acceleration = (EditText) findViewById(R.id.num3);
        final EditText time = (EditText) findViewById(R.id.num4);


        Button findV = (Button) findViewById(R.id.radV);
        Button findV0 = (Button) findViewById(R.id.radV0);
        Button findA = (Button) findViewById(R.id.radA);
        Button findT = (Button) findViewById(R.id.radT);
        final Button solve = (Button) findViewById(R.id.btnCheck);
        final Button reset = (Button) findViewById(R.id.btnReset);

        final TextView velocity0Num, velocity0Units,velocityNum, velocityUnits,accelerationNum, accelerationUnits,timeNum, timeUnits;
        velocityNum = (TextView) findViewById(R.id.num1);
        velocityUnits = (TextView) findViewById(R.id.units1);
        velocity0Num = (TextView) findViewById(R.id.num2);
        velocity0Units = (TextView) findViewById(R.id.units2);
        accelerationNum = (TextView) findViewById(R.id.num3);
        accelerationUnits = (TextView) findViewById(R.id.units3);
        timeNum = (TextView) findViewById(R.id.num4);
        timeUnits = (TextView) findViewById(R.id.units4);
        final TextView answer = ((TextView) findViewById(R.id.txtAnswer));

        final DecimalFormat hundreths = new DecimalFormat("###,###.##");

        if (findV != null) {
            findV.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    velocityNum.setVisibility(View.INVISIBLE);
                    velocityUnits.setVisibility(View.INVISIBLE);
                    velocity0Num.setVisibility(View.VISIBLE);
                    velocity0Units.setVisibility(View.VISIBLE);
                    accelerationNum.setVisibility(View.VISIBLE);
                    accelerationUnits.setVisibility(View.VISIBLE);
                    timeNum.setVisibility(View.VISIBLE);
                    timeUnits.setVisibility(View.VISIBLE);
                    answer.setVisibility(View.INVISIBLE);

                    solve.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if ((velocity0.getText().toString().equals(""))||(acceleration.getText().toString().equals(""))||(time.getText().toString().equals(""))){
                                Toast.makeText(Kinamatics1Activity.this,"You must enter a value for all knowns!", Toast.LENGTH_LONG).show();
                            }
                            else {
                                v0 = Double.parseDouble(velocity0.getText().toString());
                                a = Double.parseDouble(acceleration.getText().toString());
                                t = Double.parseDouble(time.getText().toString());

                                vF = v0 + a * t;

                                answer.setVisibility(View.VISIBLE);
                                answer.setText("v = " + hundreths.format(vF) + " m/s");
                            }
                        }
                    });


                }
            });
        }

        if (findV0 != null) {
            findV0.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    velocityNum.setVisibility(View.VISIBLE);
                    velocityUnits.setVisibility(View.VISIBLE);
                    velocity0Num.setVisibility(View.INVISIBLE);
                    velocity0Units.setVisibility(View.INVISIBLE);
                    accelerationNum.setVisibility(View.VISIBLE);
                    accelerationUnits.setVisibility(View.VISIBLE);
                    timeNum.setVisibility(View.VISIBLE);
                    timeUnits.setVisibility(View.VISIBLE);
                    answer.setVisibility(View.INVISIBLE);

                    solve.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if ((velocityF.getText().toString().equals(""))||(acceleration.getText().toString().equals(""))||(time.getText().toString().equals(""))){
                                Toast.makeText(Kinamatics1Activity.this,"You must enter a value for all knowns!", Toast.LENGTH_LONG).show();
                            }
                            else {
                                vF = Double.parseDouble(velocityF.getText().toString());
                                a = Double.parseDouble(acceleration.getText().toString());
                                t = Double.parseDouble(time.getText().toString());

                                v0 = vF - a * t;

                                answer.setVisibility(View.VISIBLE);
                                answer.setText("v₀ = " + hundreths.format(v0) + " m/s");
                            }

                        }
                    });

                }
            });
        }

        if (findA != null) {
            findA.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    velocityNum.setVisibility(View.VISIBLE);
                    velocityUnits.setVisibility(View.VISIBLE);
                    velocity0Num.setVisibility(View.VISIBLE);
                    velocity0Units.setVisibility(View.VISIBLE);
                    accelerationNum.setVisibility(View.INVISIBLE);
                    accelerationUnits.setVisibility(View.INVISIBLE);
                    timeNum.setVisibility(View.VISIBLE);
                    timeUnits.setVisibility(View.VISIBLE);
                    answer.setVisibility(View.INVISIBLE);

                    solve.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if ((velocityF.getText().toString().equals(""))||(velocity0.getText().toString().equals(""))||(time.getText().toString().equals(""))){
                                Toast.makeText(Kinamatics1Activity.this,"You must enter a value for all knowns!", Toast.LENGTH_LONG).show();
                            }
                            else {
                                vF = Double.parseDouble(velocityF.getText().toString());
                                v0 = Double.parseDouble(velocity0.getText().toString());
                                t = Double.parseDouble(time.getText().toString());

                                a = (vF - v0) / t;

                                answer.setVisibility(View.VISIBLE);
                                answer.setText("a = " + hundreths.format(a) + " m/s²");
                            }

                        }
                    });

                }
            });
        }

        if (findT != null) {
            findT.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    velocityNum.setVisibility(View.VISIBLE);
                    velocityUnits.setVisibility(View.VISIBLE);
                    velocity0Num.setVisibility(View.VISIBLE);
                    velocity0Units.setVisibility(View.VISIBLE);
                    accelerationNum.setVisibility(View.VISIBLE);
                    accelerationUnits.setVisibility(View.VISIBLE);
                    timeNum.setVisibility(View.INVISIBLE);
                    timeUnits.setVisibility(View.INVISIBLE);
                    answer.setVisibility(View.INVISIBLE);

                    solve.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if ((velocity0.getText().toString().equals(""))||(acceleration.getText().toString().equals(""))||(velocityF.getText().toString().equals(""))){
                                Toast.makeText(Kinamatics1Activity.this,"You must enter a value for all knowns!", Toast.LENGTH_LONG).show();
                            }
                            else {
                                v0 = Double.parseDouble(velocity0.getText().toString());
                                a = Double.parseDouble(acceleration.getText().toString());
                                vF = Double.parseDouble(velocityF.getText().toString());

                                t = (vF - v0) / a;

                                answer.setVisibility(View.VISIBLE);
                                answer.setText("t = " + hundreths.format(t) + " s");
                            }

                        }
                    });

                }
            });
        }


            solve.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(Kinamatics1Activity.this,"You must select an unknown!", Toast.LENGTH_LONG).show();
                }
            });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                velocity0.setText("");
                velocityF.setText("");
                acceleration.setText("");
                time.setText("");
            }
        });

    }
}
