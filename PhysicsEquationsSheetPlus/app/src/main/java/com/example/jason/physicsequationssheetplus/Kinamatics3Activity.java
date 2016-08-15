package com.example.jason.physicsequationssheetplus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class Kinamatics3Activity extends AppCompatActivity {
    double xF, x0, vF, v0, a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kinamatics3);

        final EditText velocityF = (EditText) findViewById(R.id.num1);
        final EditText velocity0 = (EditText) findViewById(R.id.num2);
        final EditText acceleration = (EditText) findViewById(R.id.num3);
        final EditText positionF = (EditText) findViewById(R.id.num4);
        final EditText position0 = (EditText) findViewById(R.id.num5);

        Button findX = (Button) findViewById(R.id.radX);
        Button findX0 = (Button) findViewById(R.id.radX0);
        Button findV0 = (Button) findViewById(R.id.radV0);
        Button findVF = (Button) findViewById(R.id.radV);
        Button findA = (Button) findViewById(R.id.radA);
        final Button solve = (Button) findViewById(R.id.btnCheck);
        final Button reset = (Button) findViewById(R.id.btnReset);

        final TextView position0Num, position0Units,positionNum, positionUnits,accelerationNum,velocity0Num, velocity0Units, accelerationUnits,velocityNum, velocityUnits;
        velocityNum = (TextView) findViewById(R.id.num1);
        velocityUnits = (TextView) findViewById(R.id.units1);
        velocity0Num = (TextView) findViewById(R.id.num2);
        velocity0Units = (TextView) findViewById(R.id.units2);
        accelerationNum = (TextView) findViewById(R.id.num3);
        accelerationUnits = (TextView) findViewById(R.id.units3);
        positionNum = (TextView) findViewById(R.id.num4);
        positionUnits = (TextView) findViewById(R.id.units4);
        position0Num = (TextView) findViewById(R.id.num5);
        position0Units = (TextView) findViewById(R.id.units5);
        final TextView answer = ((TextView) findViewById(R.id.txtAnswer));

        final DecimalFormat hundreths = new DecimalFormat("###,###.##");

        if (findVF != null) {
            findVF.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    velocityNum.setVisibility(View.INVISIBLE);
                    velocityUnits.setVisibility(View.INVISIBLE);
                    velocity0Num.setVisibility(View.VISIBLE);
                    velocity0Units.setVisibility(View.VISIBLE);
                    accelerationNum.setVisibility(View.VISIBLE);
                    accelerationUnits.setVisibility(View.VISIBLE);
                    positionNum.setVisibility(View.VISIBLE);
                    positionUnits.setVisibility(View.VISIBLE);
                    position0Num.setVisibility(View.VISIBLE);
                    position0Units.setVisibility(View.VISIBLE);
                    answer.setVisibility(View.INVISIBLE);

                    solve.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if ((velocity0.getText().toString().equals(""))|| (acceleration.getText().toString().equals(""))||(positionF.getText().toString().equals(""))||(position0.getText().toString().equals(""))){
                                Toast.makeText(Kinamatics3Activity.this,"You must enter a value for all knowns!", Toast.LENGTH_LONG).show();
                            }
                            else {
                                v0 = Double.parseDouble(velocity0.getText().toString());
                                a = Double.parseDouble(acceleration.getText().toString());
                                xF = Double.parseDouble(positionF.getText().toString());
                                x0 = Double.parseDouble(position0.getText().toString());

                                if (((v0 * v0) + 2*a*(xF - x0))>0) {
                                    vF = Math.sqrt((v0 * v0) + 2 * a * (xF - x0));

                                    answer.setVisibility(View.VISIBLE);
                                    answer.setText("v = +/-" + hundreths.format(vF) + " m/s");
                                }
                                else {
                                    answer.setVisibility(View.VISIBLE);
                                    answer.setText("No Real Answers");
                                }
                            }
                        }
                    });


                }
            });
        } // end vF

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
                    positionNum.setVisibility(View.VISIBLE);
                    positionUnits.setVisibility(View.VISIBLE);
                    position0Num.setVisibility(View.VISIBLE);
                    position0Units.setVisibility(View.VISIBLE);
                    answer.setVisibility(View.INVISIBLE);

                    solve.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if ((velocityF.getText().toString().equals(""))|| (acceleration.getText().toString().equals(""))||(positionF.getText().toString().equals(""))||(position0.getText().toString().equals(""))){
                                Toast.makeText(Kinamatics3Activity.this,"You must enter a value for all knowns!", Toast.LENGTH_LONG).show();
                            }
                            else {
                                vF = Double.parseDouble(velocityF.getText().toString());
                                a = Double.parseDouble(acceleration.getText().toString());
                                xF = Double.parseDouble(positionF.getText().toString());
                                x0 = Double.parseDouble(position0.getText().toString());

                                if (((vF * vF) - 2 * a * (xF - x0))>0) {
                                    v0 = Math.sqrt((vF * vF) - 2 * a * (xF - x0));

                                    answer.setVisibility(View.VISIBLE);
                                    answer.setText("v₀ = +/-" + hundreths.format(v0) + " m/s");
                                }
                                else {

                                    answer.setVisibility(View.VISIBLE);
                                    answer.setText("No Real Answers");
                                }
                            }
                        }
                    });


                }
            });
        } // end v0

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
                    positionNum.setVisibility(View.VISIBLE);
                    positionUnits.setVisibility(View.VISIBLE);
                    position0Num.setVisibility(View.VISIBLE);
                    position0Units.setVisibility(View.VISIBLE);
                    answer.setVisibility(View.INVISIBLE);

                    solve.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if ((velocity0.getText().toString().equals(""))|| (velocityF.getText().toString().equals(""))||(positionF.getText().toString().equals(""))||(position0.getText().toString().equals(""))){
                                Toast.makeText(Kinamatics3Activity.this,"You must enter a value for all knowns!", Toast.LENGTH_LONG).show();
                            }
                            else {
                                v0 = Double.parseDouble(velocity0.getText().toString());
                                vF = Double.parseDouble(velocityF.getText().toString());
                                xF = Double.parseDouble(positionF.getText().toString());
                                x0 = Double.parseDouble(position0.getText().toString());

                                a = ((vF * vF) - (v0 * v0))/(2 * (xF - x0));

                                answer.setVisibility(View.VISIBLE);
                                answer.setText("a = " + hundreths.format(a) + " m/s²");

                            }
                        }
                    });


                }
            });
        } // end a

        if (findX != null) {
        findX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                velocityNum.setVisibility(View.VISIBLE);
                velocityUnits.setVisibility(View.VISIBLE);
                velocity0Num.setVisibility(View.VISIBLE);
                velocity0Units.setVisibility(View.VISIBLE);
                accelerationNum.setVisibility(View.VISIBLE);
                accelerationUnits.setVisibility(View.VISIBLE);
                positionNum.setVisibility(View.INVISIBLE);
                positionUnits.setVisibility(View.INVISIBLE);
                position0Num.setVisibility(View.VISIBLE);
                position0Units.setVisibility(View.VISIBLE);
                answer.setVisibility(View.INVISIBLE);

                solve.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if ((velocity0.getText().toString().equals(""))|| (velocityF.getText().toString().equals(""))||(acceleration.getText().toString().equals(""))||(position0.getText().toString().equals(""))){
                            Toast.makeText(Kinamatics3Activity.this,"You must enter a value for all knowns!", Toast.LENGTH_LONG).show();
                        }
                        else {
                            v0 = Double.parseDouble(velocity0.getText().toString());
                            vF = Double.parseDouble(velocityF.getText().toString());
                            a = Double.parseDouble(acceleration.getText().toString());
                            x0 = Double.parseDouble(position0.getText().toString());

                            xF = (((vF * vF) - (v0 * v0))/(2 * a)) + x0;

                            answer.setVisibility(View.VISIBLE);
                            answer.setText("x = " + hundreths.format(xF) + " m");

                        }
                    }
                });


            }
        });
    } // end xF

        if (findX0 != null) {
            findX0.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    velocityNum.setVisibility(View.VISIBLE);
                    velocityUnits.setVisibility(View.VISIBLE);
                    velocity0Num.setVisibility(View.VISIBLE);
                    velocity0Units.setVisibility(View.VISIBLE);
                    accelerationNum.setVisibility(View.VISIBLE);
                    accelerationUnits.setVisibility(View.VISIBLE);
                    positionNum.setVisibility(View.VISIBLE);
                    positionUnits.setVisibility(View.VISIBLE);
                    position0Num.setVisibility(View.INVISIBLE);
                    position0Units.setVisibility(View.INVISIBLE);
                    answer.setVisibility(View.INVISIBLE);

                    solve.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if ((velocity0.getText().toString().equals(""))|| (velocityF.getText().toString().equals(""))||(acceleration.getText().toString().equals(""))||(positionF.getText().toString().equals(""))){
                                Toast.makeText(Kinamatics3Activity.this,"You must enter a value for all knowns!", Toast.LENGTH_LONG).show();
                            }
                            else {
                                v0 = Double.parseDouble(velocity0.getText().toString());
                                vF = Double.parseDouble(velocityF.getText().toString());
                                a = Double.parseDouble(acceleration.getText().toString());
                                xF = Double.parseDouble(positionF.getText().toString());

                                x0 = xF - (((vF * vF) - (v0 * v0))/(2 * a));

                                answer.setVisibility(View.VISIBLE);
                                answer.setText("x₀ = " + hundreths.format(x0) + " m");

                            }
                        }
                    });


                }
            });
        } // end x0

        solve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Kinamatics3Activity.this,"You must select an unknown!", Toast.LENGTH_LONG).show();
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                velocity0.setText("");
                position0.setText("");
                positionF.setText("");
                acceleration.setText("");
                velocityF.setText("");
            }
        });
    }
}
