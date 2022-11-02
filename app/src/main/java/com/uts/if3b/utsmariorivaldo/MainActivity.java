package com.uts.if3b.utsmariorivaldo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etNomorPendaftaran, etNama;
    Button btnDaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNama = findViewById(R.id.et_nama_lengkap);
        etNomorPendaftaran = findViewById(R.id.et_nomor_pendaftaran);
        btnDaftar = findViewById(R.id.btn_daftar);
        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = etNama.getText().toString();
                if (nama.trim().equals("")){
                    etNama.setError("Isi Dengan Nama Lengkap Anda");
                }else{
                    Intent pindah = new Intent(MainActivity.this,MainActivity2.class);
                    pindah.putExtra( "Xnama", nama);
                    startActivity(pindah);
                }
            }
        });
    }
}