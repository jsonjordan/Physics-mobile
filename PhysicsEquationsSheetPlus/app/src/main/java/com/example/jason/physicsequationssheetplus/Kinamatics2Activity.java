package com.example.jason.physicsequationssheetplus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class Kinamatics2Activity extends AppCompatActivity {
    double xF, x0, v0, a, t, t1, t2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kinamatics2);

        final EditText positionF = (EditText) findViewById(R.id.num1);
        final EditText position0 = (EditText) findViewById(R.id.num2);
        final EditText velocity0 = (EditText) findViewById(R.id.num3);
        final EditText acceleration = (EditText) findViewById(R.id.num4);
        final EditText time = (EditText) findViewById(R.id.num5);

        Button findX = (Button) findViewById(R.id.radX);
        Button findX0 = (Button) findViewById(R.id.radX0);
        Button findV0 = (Button) findViewById(R.id.radV0);
        Button findA = (Button) findViewById(R.id.radA);
        Button findT = (Button) findViewById(R.id.radT);
        final Button solve = (Button) findViewById(R.id.btnCheck);
        final Button reset = (Button) findViewById(R.id.btnReset);

        final TextView position0Num, position0Units,positionNum, positionUnits,accelerationNum,velocity0Num, velocity0Units, accelerationUnits,timeNum, timeUnits;
        positionNum = (TextView) findViewById(R.id.num1);
        positionUnits = (TextView) findViewById(R.id.units1);
        position0Num = (TextView) findViewById(R.id.num2);
        position0Units = (TextView) findViewById(R.id.units2);
        velocity0Num = (TextView) findViewById(R.id.num3);
        velocity0Units = (TextView) findViewById(R.id.units3);
        accelerationNum = (TextView) findViewById(R.id.num4);
        accelerationUnits = (TextView) findViewById(R.id.units4);
        timeNum = (TextView) findViewById(R.id.num5);
        timeUnits = (TextView) findViewById(R.id.units5);
        final TextView answer = ((TextView) findViewById(R.id.txtAnswer));

        final DecimalFormat hundreths = new DecimalFormat("###,###.##");

        if (findX != null) {
            findX.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    positionNum.setVisibility(View.INVISIBLE);
                    positionUnits.setVisibility(View.INVISIBLE);
                    position0Num.setVisibility(View.VISIBLE);
                    position0Units.setVisibility(View.VISIBLE);
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
                            if ((position0.getText().toString().equals(""))|| (velocity0.getText().toString().equals(""))||(acceleration.getText().toString().equals(""))||(time.getText().toString().equals(""))){
                                Toast.makeText(Kinamatics2Activity.this,"You must enter a value for all knowns!", Toast.LENGTH_LONG).show();
                            }
                            else {
                                x0 = Double.parseDouble(position0.getText().toString());
                                v0 = Double.parseDouble(velocity0.getText().toString());
                                a = Double.parseDouble(acceleration.getText().toString());
                                t = Double.parseDouble(time.getText().toString());

                                xF = (x0 + (v0 * t) + ((.5)*(a * t * t)));

                                answer.setVisibility(View.VISIBLE);
                                answer.setText("x = " + hundreths.format(xF) + " m");
                            }
                        }
                    });


                }
            });
        } // end x

        if (findX0 != null) {
            findX0.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    positionNum.setVisibility(View.VISIBLE);
                    positionUnits.setVisibility(View.VISIBLE);
                    position0Num.setVisibility(View.INVISIBLE);
                    position0Units.setVisibility(View.INVISIBLE);
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
                            if ((positionF.getText().toString().equals(""))|| (velocity0.getText().toString().equals(""))||(acceleration.getText().toString().equals(""))||(time.getText().toString().equals(""))){
                                Toast.makeText(Kinamatics2Activity.this,"You must enter a value for all knowns!", Toast.LENGTH_LONG).show();
                            }
                            else {
                                xF = Double.parseDouble(positionF.getText().toString());
                                v0 = Double.parseDouble(velocity0.getText().toString());
                                a = Double.parseDouble(acceleration.getText().toString());
                                t = Double.parseDouble(time.getText().toString());

                                x0 = xF - (v0 * t) - (.5)*(a * t * t);

                                answer.setVisibility(View.VISIBLE);
                                answer.setText("x₀ = " + hundreths.format(x0) + " m");
                            }
                        }
                    });


                }
            });
        } // end x0

        if (findV0 != null) {
            findV0.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    positionNum.setVisibility(View.VISIBLE);
                    positionUnits.setVisibility(View.VISIBLE);
                    position0Num.setVisibility(View.VISIBLE);
                    position0Units.setVisibility(View.VISIBLE);
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
                            if ((positionF.getText().toString().equals(""))|| (position0.getText().toString().equals(""))||(acceleration.getText().toString().equals(""))||(time.getText().toString().equals(""))){
                                Toast.makeText(Kinamatics2Activity.this,"You must enter a value for all knowns!", Toast.LENGTH_LONG).show();
                            }
                            else {
                                xF = Double.parseDouble(positionF.getText().toString());
                                x0 = Double.parseDouble(position0.getText().toString());
                                a = Double.parseDouble(acceleration.getText().toString());
                                t = Double.parseDouble(time.getText().toString());

                                v0 = ((xF - x0) - (.5)*(a * t * t))/t;

                                answer.setVisibility(View.VISIBLE);
                                answer.setText("v₀ = " + hundreths.format(v0) + " m/s");
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

                    positionNum.setVisibility(View.VISIBLE);
                    positionUnits.setVisibility(View.VISIBLE);
                    position0Num.setVisibility(View.VISIBLE);
                    position0Units.setVisibility(View.VISIBLE);
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
                            if ((position0.getText().toString().equals(""))|| (velocity0.getText().toString().equals(""))||(positionF.getText().toString().equals(""))||(time.getText().toString().equals(""))){
                                Toast.makeText(Kinamatics2Activity.this,"You must enter a value for all knowns!", Toast.LENGTH_LONG).show();
                            }
                            else {
                                x0 = Double.parseDouble(position0.getText().toString());
                                v0 = Double.parseDouble(velocity0.getText().toString());
                                xF = Double.parseDouble(positionF.getText().toString());
                                t = Double.parseDouble(time.getText().toString());

                                a = ((xF - x0) - (v0 * t))/((.5)*(t * t));

                                answer.setVisibility(View.VISIBLE);
                                answer.setText("a = " + hundreths.format(a) + " m/s²");
                            }
                        }
                    });


                }
            });
        } // end a

        if (findT != null) {
            findT.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    positionNum.setVisibility(View.VISIBLE);
                    positionUnits.setVisibility(View.VISIBLE);
                    position0Num.setVisibility(View.VISIBLE);
                    position0Units.setVisibility(View.VISIBLE);
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
                            if ((position0.getText().toString().equals(""))|| (velocity0.getText().toString().equals(""))||(acceleration.getText().toString().equals(""))||(positionF.getText().toString().equals(""))){
                                Toast.makeText(Kinamatics2Activity.this,"You must enter a value for all knowns!", Toast.LENGTH_LONG).show();
                            }
                            else {
                                x0 = Double.parseDouble(position0.getText().toString());
                                xF = Double.parseDouble(positionF.getText().toString());
                                v0 = Double.parseDouble(velocity0.getText().toString());
                                a = Double.parseDouble(acceleration.getText().toString());

                                if(((v0*v0)-4*((.5*a)*(x0-xF))) > 0) {
                                    t1 = (-v0 + Math.sqrt((v0 * v0) - (4 * ((.5*a) * (x0 - xF))))) / (2 * (.5*a));
                                    t2 = (-v0 - Math.sqrt((v0 * v0) - (4 * ((.5*a) * (x0 - xF))))) / (2 * (.5*a));

                                    answer.setVisibility(View.VISIBLE);

                                    if (t1>=0 && t2 < 0) {
                                        answer.setText("t = " + hundreths.format(t1) + " s");
                                    }
                                    if (t2>=0 && t1 < 0) {
                                        answer.setText("t = " + hundreths.format(t2) + " s");
                                    }
                                    if (t1>=0 && t2>=0) {
                                        answer.setText("t = " + hundreths.format(t1) + " s and " + hundreths.format(t2) + " s");
                                    }

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
        } // end t

        solve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Kinamatics2Activity.this,"You must select an unknown!", Toast.LENGTH_LONG).show();
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                velocity0.setText("");
                position0.setText("");
                positionF.setText("");
                acceleration.setText("");
                time.setText("");
            }
        });

    } // end oncreate
}
