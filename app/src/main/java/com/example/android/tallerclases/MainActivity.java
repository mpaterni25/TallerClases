package com.example.android.tallerclases;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private EditText txtResultado;
    private EditText txtCant;
    private Spinner comboMaterial;
    private Spinner comboDije;
    private Spinner comboTipo;
    private RadioButton r1, r2;
    private ArrayAdapter<String> adapter, adapter1, adapter2;
    private String[] opc, opc1, opc2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//-----------        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        //Capturar el Combo
        comboMaterial = (Spinner) findViewById(R.id.cmbMaterial);
        comboDije = (Spinner) findViewById(R.id.cmbDije);
        comboTipo = (Spinner) findViewById(R.id.cmbTipo);

        //Captura de Radios
        r1 = (RadioButton) findViewById(R.id.r1);
        r2 = (RadioButton) findViewById(R.id.r2);


        opc = this.getResources().getStringArray(R.array.materiales);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, opc);
        opc1 = this.getResources().getStringArray(R.array.dijes);
        adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, opc1);
        opc2 = this.getResources().getStringArray(R.array.tipo);
        adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, opc2);


        comboMaterial.setAdapter(adapter);
        comboDije.setAdapter(adapter1);
        comboTipo.setAdapter(adapter2);


        public int calcular(){
            int pres, cant;
            cant = Integer.parseInt(txtCant.getText().toString());
            if (r1.isChecked()){
                if (comboMaterial.getSelectedItem()==0){
                    if (comboDije.getSelectedItem()==0){
                        if (comboTipo.getSelectedItem()==0){

                             pres = cant *100;
                        }else {
                            if (comboTipo.getSelectedItem()==1){
                                pres = cant *100;
                            }else {
                                if (comboTipo.getSelectedItem()==2){
                                    pres = cant * 80;
                                }else {
                                    if (comboTipo.getSelectedItem()==3){
                                        pres = cant * 120;
                                    }
                                }
                            }
                        }
                    }else {
                        if (comboDije.getSelectedItem()==1){
                            pres = cant * 100;
                            if (comboTipo.getSelectedItem()==0){
                                    pres = cant * 70;
                            }else {
                                if (comboTipo.getSelectedItem()==1){
                                    pres = cant * 50;
                                }else {
                                    if (comboTipo.getSelectedItem()==2){
                                        pres =  cant * 110;
                                    }else {
                                        if (comboTipo.getSelectedItem()==3){
                                             pres = cant * 90;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }else {
                    if (comboMaterial.getSelectedItem()==1){
                            pres = cant * 90;
                        if (comboDije.getSelectedItem()==0){
                            if (comboTipo.getSelectedItem()==0){
                                pres = cant * 50;
                            }else {
                                if (comboTipo.getSelectedItem()==1){
                                    pres = cant * 80;
                                }else {
                                    if (comboTipo.getSelectedItem()==2){
                                        pres = cant * 100;
                                    }else {
                                        if (comboTipo.getSelectedItem()==3){
                                            pres = cant * 120;
                                        }
                                    }
                                }
                            }
                        }else {
                            if (comboDije.getSelectedItem()==1) {
                                if (comboTipo.getSelectedItem()==0){
                                    pres = cant * 70;
                                }else {
                                    if (comboTipo.getSelectedItem()==1){
                                        pres = cant * 100;
                                    }else {
                                        if (comboTipo.getSelectedItem()==2){
                                            pres = cant * 120;
                                        }else {
                                            if (comboTipo.getSelectedItem()==3){
                                                pres = cant * 90;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }else {
                if (r2.isChecked()){
                    if (comboMaterial.getSelectedItem()==0){
                        if (comboDije.getSelectedItem()==0){
                            if (comboTipo.getSelectedItem()==0){
                                pres = cant * 3200 * 80;
                            }else {
                                if (comboTipo.getSelectedItem()==1){
                                    pres = cant * 3200 * 70;
                                }else {
                                    if (comboTipo.getSelectedItem()==2){
                                        pres = cant * 3200 * 120;
                                    }else {
                                        if (comboTipo.getSelectedItem()==3){
                                            pres = cant * 3200 * 70;
                                        }
                                    }
                                }
                            }
                        }else {
                            if (comboDije.getSelectedItem()==1){
                                if (comboTipo.getSelectedItem()==0){
                                    pres = cant * 3200 * 100;
                                }else {
                                    if (comboTipo.getSelectedItem()==1){
                                        pres = cant * 3200 * 80;
                                    }else {
                                        if (comboTipo.getSelectedItem()==2){
                                            pres = cant * 3200 * 120;
                                        }else {
                                            if (comboTipo.getSelectedItem()==3){
                                                pres = cant * 3200 * 90;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }else {
                        if (comboMaterial.getSelectedItem()==1){
                            if (comboDije.getSelectedItem()==0){
                                if (comboTipo.getSelectedItem()==0){
                                    pres = cant * 3200 * 100;
                                }else {
                                    if (comboTipo.getSelectedItem()==1){
                                        pres = cant * 3200 * 120;
                                    }else {
                                        if (comboTipo.getSelectedItem()==2){
                                            pres = cant * 3200 * 70;
                                        }else {
                                            if (comboTipo.getSelectedItem()==3){
                                                pres = cant * 3200 * 50;
                                            }
                                        }
                                    }
                                }
                            }else {
                                if (comboDije.getSelectedItem()==1){
                                    if (comboTipo.getSelectedItem()==0){
                                        pres = cant * 3200 * 100;
                                    }else {
                                        if (comboTipo.getSelectedItem()==1){
                                            pres = cant * 3200 * 100;
                                        }else {
                                            if (comboTipo.getSelectedItem()==2){
                                                pres = cant * 3200 * 80;
                                            }else {
                                                if (comboTipo.getSelectedItem()==3){
                                                    pres = cant * 3200 * 70;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

        }


    }
}










