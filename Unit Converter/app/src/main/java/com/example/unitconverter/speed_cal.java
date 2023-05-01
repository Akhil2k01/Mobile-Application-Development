package com.example.unitconverter;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Arrays;

public class speed_cal extends AppCompatActivity {
    CardView cv_fromUnit, cv_toUnit, cv_convert;
    RelativeLayout mCLayout;
    String fromUnit = "meter/second";
    String toUnit = "meter/second";
    TextView tv_fromUnit, tv_toUnit;
    EditText et_fromUnit, et_toUnit;
    final String[] values = new String[]{
            "meter/second",
            "meter/hour",
            "meter/minute",
            "kilometer/hour",
            "kilometer/minute", 
            "kilometer/second"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speed_cal);

        cv_fromUnit = findViewById(R.id.fromUnit);
        cv_toUnit = findViewById(R.id.toUnit);
        cv_convert = findViewById(R.id.cv_convert);

        mCLayout = findViewById(R.id.temp_relativeLayout);

        tv_fromUnit = findViewById(R.id.tv_fromUnit);
        tv_toUnit = findViewById(R.id.tv_toUnit);

        tv_fromUnit.setText(values[0]);
        tv_toUnit.setText(values[0]);

        et_fromUnit = findViewById(R.id.et_fromUnit);
        et_toUnit = findViewById(R.id.et_toUnit);

        cv_convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tempInput = et_fromUnit.getText().toString();
                if (tempInput.equals("") || tempInput == null) {
                    et_fromUnit.setError("Please enter some value");
                } else {
                    if (tv_fromUnit.getText().toString().equals(values[0])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(tempInput);
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(msTomh(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(msTomm(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(msTokh(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(msTokm(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(msToks(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[1])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(mhToms(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(tempInput);
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(mhTomm(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(mhTokh(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(mhTokm(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(mhToks(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[2])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(mmToms(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(mmTomh(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(tempInput);
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(mmTokh(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(mmTokm(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(mmToks(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[3])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(khToms(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(khTomh(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(khTomm(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(tempInput);
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(khTokm(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(khToks(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[4])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(kmToms(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(kmTomh(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(kmTomm(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(kmTokh(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(tempInput);
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(kmToks(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[5])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(ksToms(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(ksTomh(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(ksTomm(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(ksTokh(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(ksTokm(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(tempInput);
                        }
                    }
                }
            }
        });

        cv_toUnit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final AlertDialog.Builder builder = new AlertDialog.Builder(speed_cal.this);
                builder.setTitle("Choose Unit");

                final String[] flowers = new String[]{
                        "meter/second",
                        "meter/hour",
                        "meter/minute",
                        "kilometer/hour",
                        "kilometer/minute", 
                        "kilometer/second"
                };

                builder.setSingleChoiceItems(
                        flowers,
                        -1,
                        new DialogInterface.OnClickListener()
                        {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                String selectedItem = Arrays.asList(flowers).get(i);
                                toUnit = selectedItem;
                                tv_toUnit.setText(toUnit);
                            }
                        });

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });

                AlertDialog dialog = builder.create();
                dialog.show();

            }
        });

        cv_fromUnit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final AlertDialog.Builder builder = new AlertDialog.Builder(speed_cal.this);
                builder.setTitle("Choose Unit");

                final String[] flowers = new String[]{
                        "meter/second",
                        "meter/hour",
                        "meter/minute",
                        "kilometer/hour",
                        "kilometer/minute", 
                        "kilometer/second"
                };

                builder.setSingleChoiceItems(
                        flowers,
                        -1,
                        new DialogInterface.OnClickListener()
                        {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                String selectedItem = Arrays.asList(flowers).get(i);
                                fromUnit = selectedItem;
                                tv_fromUnit.setText(fromUnit);
                            }
                        });

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });

                AlertDialog dialog = builder.create();
                dialog.show();

            }
        });

    }

    //meter/second
    private String msTomm(double ms) {
        double mm = ms *3600;
        return String.valueOf(mm);
    }

    private String msTokh(double ms) {
        double kh = ms *60;
        return String.valueOf(kh);
    }

    private String msTokm(double ms) {
        double km = ms * 3.6;
        return String.valueOf(km);
    }

    private String msToks(double ms) {
        double ks = ms / 16.667;
        return String.valueOf(ks);
    }

    private String msTomh(double ms) {
        double mh = ms/1000;
        return String.valueOf(mh);
    }

    //meter/hour
    private String mhTomm(double mh) {
        double mm = mh/60;
        return String.valueOf(mm);
    }

    private String mhTokh(double mh) {
        double kh = mh /1000;
        return String.valueOf(kh);
    }

    private String mhTokm(double mh) {
        double km = mh/60000;
        return String.valueOf(km);
    }

    private String mhToks(double mh) {
        double ks = mh/3.6e+6;
        return String.valueOf(ks);
    }

    private String mhToms(double mh) {
        double ms = mh/3600;
        return String.valueOf(ms);
    }

    //meter/minute
    private String mmTokh(double mm) {
        double kh = mm /16.667;
        return String.valueOf(kh);
    }

    private String mmTokm(double mm) {
        double km = mm/1000;
        return String.valueOf(km);
    }

    private String mmToks(double mm) {
        double ks = mm/60000;
        return String.valueOf(ks);
    }

    private String mmToms(double mm) {
        double ms = mm /60;
        return String.valueOf(ms);
    }

    private String mmTomh(double mm) {
        double mh = mm*60;
        return String.valueOf(mh);
    }

    //kilometer/hour
    private String khTokm(double kh) {
        double km = kh/60;
        return String.valueOf(km);
    }

    private String khToks(double kh) {
        double ks = kh/3600;
        return String.valueOf(ks);
    }

    private String khToms(double kh) {
        double ms = kh/3.6;
        return String.valueOf(ms);
    }

    private String khTomh(double kh) {
        double mh = kh *1000;
        return String.valueOf(mh);
    }

    private String khTomm(double kh) {
        double mm = kh * 16.667;
        return String.valueOf(mm);
    }

    //kilometer/minute
    private String kmToks(double km) {
        double ks = km/60;
        return String.valueOf(ks);
    }

    private String kmToms(double km) {
        double ms = km*16.667;
        return String.valueOf(ms);
    }

    private String kmTomh(double km) {
        double mh = km*60000;
        return String.valueOf(mh);
    }

    private String kmTomm(double km) {
        double mm = km * 1000;
        return String.valueOf(mm);
    }

    private String kmTokh(double km) {
        double kh = km * 60 ;
        return String.valueOf(kh);
    }

    //kilometer/second
    private String ksToms(double ks) {
        double ms = ks*1000;
        return String.valueOf(ms);
    }

    private String ksTomh(double ks) {
        double mh = ks*3.6e+6;
        return String.valueOf(mh);
    }

    private String ksTomm(double ks) {
        double mm = ks*60000;
        return String.valueOf(mm);
    }

    private String ksTokh(double ks) {
        double kh = ks*3600;
        return String.valueOf(kh);
    }

    private String ksTokm(double ks) {
        double km = ks*60;
        return String.valueOf(km);
    }

}