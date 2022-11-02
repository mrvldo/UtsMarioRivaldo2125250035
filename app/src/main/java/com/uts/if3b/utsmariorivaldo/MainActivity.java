package com.uts.if3b.utsmariorivaldo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btnDaftar;
    EditText etNamaLengkap;
    EditText etNoPendaftaran;
    CheckBox cbConfirm;
    Spinner spJalurPendaftaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnDaftar = findViewById(R.id.btn_daftar);
        etNamaLengkap = findViewById(R.id.et_namaLengkap);
        etNoPendaftaran = findViewById(R.id.et_noPendaftaran);
        cbConfirm = findViewById(R.id.cb_konfirm);
        spJalurPendaftaran = findViewById(R.id.sp_jalurPendaftaran);

        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String namaLengkap  = etNamaLengkap.getText().toString();
                String noPendaftaran = etNoPendaftaran.getText().toString();
                String cbKonfir = cbConfirm.getText().toString();
                String sp = String.valueOf(spJalurPendaftaran.getSelectedItem());

                if (namaLengkap.trim().equals("")){
                    etNamaLengkap.setError("Nama Harus Di Isi!!!");
                }
                else if(noPendaftaran.trim().equals("")){
                    etNoPendaftaran.setError("Nomor Harus Di isi!!!");
                }
                else if(!cbConfirm.isChecked()){
                    Toast.makeText(MainActivity.this, "Check Box Belom Di Centang", Toast.LENGTH_SHORT).show();
                }
                else if (sp.equalsIgnoreCase("Jalur Pendaftaran")){
                    Toast.makeText(MainActivity.this, "Jalur Pendaftaran Belum dipilih", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent geser = new Intent(MainActivity.this, MainActivity2.class);
                    geser.putExtra("xnama", namaLengkap);
                    geser.putExtra("noDaftar", noPendaftaran);
                    geser.putExtra("confirm", cbKonfir);
                    geser.putExtra("spJP", sp);
                    startActivity(geser);
                }
            }
        });
    }
}