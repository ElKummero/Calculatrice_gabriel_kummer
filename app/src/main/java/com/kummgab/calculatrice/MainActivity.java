package com.kummgab.calculatrice;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button BT_1;
    private Button BT_2;
    private Button BT_3;
    private Button BT_4;
    private Button BT_5;
    private Button BT_6;
    private Button BT_7;
    private Button BT_8;
    private Button BT_9;
    private Button BT_0;

    private Button BT_Plus;
    private Button BT_Moin;
    private Button BT_Fois;
    private Button BT_Divi;

    private Button BT_Reset;
    private Button BT_Egal;
    private Button BT_Virgule;

    private TextView txt_result;
    private TextView txt_calculTemp;

    private String result = "";

    float mValueOne, mValueTwo;

    boolean crunchifyAddition, mSubtract, crunchifyMultiplication, crunchifyDivision;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BT_1 = findViewById(R.id.bt_un);
        BT_2 = findViewById(R.id.bt_deux);
        BT_3 = findViewById(R.id.bt_trois);
        BT_4 = findViewById(R.id.bt_quatre);
        BT_5 = findViewById(R.id.bt_cinq);
        BT_6 = findViewById(R.id.bt_six);
        BT_7 = findViewById(R.id.bt_sept);
        BT_8 = findViewById(R.id.bt_huit);
        BT_9 = findViewById(R.id.bt_neuf);
        BT_0 = findViewById(R.id.bt_zero);

        BT_Plus = findViewById(R.id.bt_plus);
        BT_Moin = findViewById(R.id.bt_moin);
        BT_Fois = findViewById(R.id.bt_fois);
        BT_Divi = findViewById(R.id.bt_divi);

        BT_Reset = findViewById(R.id.bt_clear);
        BT_Egal = findViewById(R.id.bt_egal);
        BT_Virgule = findViewById(R.id.bt_virgule);

        txt_result = findViewById(R.id.txt_calculResult);
        txt_calculTemp = findViewById(R.id.txt_calculTemp);

        BT_Plus.setEnabled(false);
        BT_Moin.setEnabled(false);
        BT_Fois.setEnabled(false);
        BT_Divi.setEnabled(false);

        txt_result.setFocusedByDefault(true);
    }

    @Override
    protected void onStart() {
        super.onStart();

        txt_result.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void afterTextChanged(Editable editable) {
                buttonState();
            }
        });

        BT_Reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt_result.setText("");
                txt_calculTemp.setText("");
                result = "";
            }
        });

        BT_Egal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mValueTwo = Float.parseFloat(txt_calculTemp.getText() + "");

                if (crunchifyAddition = true) {
                    txt_calculTemp.setText(mValueOne + mValueTwo + "");
                    crunchifyAddition = false;
                }

                if (mSubtract = true) {
                    txt_calculTemp.setText(mValueOne - mValueTwo + "");
                    mSubtract = false;
                }

                if (crunchifyMultiplication = true) {
                    txt_calculTemp.setText(mValueOne * mValueTwo + "");
                    crunchifyMultiplication = false;
                }

                if (crunchifyDivision = true) {
                    txt_calculTemp.setText(mValueOne / mValueTwo + "");
                    crunchifyDivision = false;
                }
            }
        });


        BT_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcul("1");
            }
        });

        BT_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcul("2");
            }
        });

        BT_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcul("3");
            }
        });

        BT_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcul("4");
            }
        });

        BT_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcul("5");
            }
        });

        BT_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcul("5");
            }
        });

        BT_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcul("6");
            }
        });

        BT_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcul("7");
            }
        });

        BT_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcul("8");
            }
        });

        BT_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcul("9");
            }
        });

        BT_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcul("0");
            }
        });

        BT_Plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcul("+");
                tempResult();
            }
        });

        BT_Moin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcul("-");
                tempResult();
            }
        });

        BT_Fois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcul("*"); //0215
                tempResult();
            }
        });

        BT_Divi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcul("/"); //0247
                tempResult();
            }
        });

        BT_Virgule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcul(",");
            }
        });
    }

    // Appelé après chaques fois que un bouton est pressé
    // Permet de concaténer les chiffres
    private String calcul(String value) {
        result += value;
        txt_result.setText(result);
        return result;
    }

    // Affiche le calcul actuel dans une TextView temporaire
    private void tempResult() {
        txt_calculTemp.setText(calcul(""));
        txt_result.setText("");
        result = "";
    }

    private void buttonState() {
        if (txt_result.getText().length() > 0) {
            BT_Plus.setEnabled(true);
            BT_Moin.setEnabled(true);
            BT_Fois.setEnabled(true);
            BT_Divi.setEnabled(true);
            BT_Egal.setEnabled(true);
            BT_Virgule.setEnabled(true);
        } else {
            BT_Plus.setEnabled(false);
            BT_Moin.setEnabled(false);
            BT_Fois.setEnabled(false);
            BT_Divi.setEnabled(false);
            BT_Egal.setEnabled(false);
            BT_Virgule.setEnabled(false);
        };
    }
}