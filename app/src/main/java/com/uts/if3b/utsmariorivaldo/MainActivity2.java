package com.uts.if3b.utsmariorivaldo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView tv_Nama;
    TextView tv_NoPendaftaran;
    TextView tv_JalurPendaftaran;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv_Nama = findViewById(R.id.tv_nama);
        tv_NoPendaftaran = findViewById(R.id.tv_noPendaftaran);
        tv_JalurPendaftaran = findViewById(R.id.tv_jalurPendaftaran);
        Intent acc = getIntent();
        String aNama = acc.getStringExtra("xnama");
        tv_Nama.setText(aNama);
        String noPendaftar = acc.getStringExtra("noDaftar");
        tv_NoPendaftaran.setText(noPendaftar);
        String spin = acc.getStringExtra("spJP");
        tv_JalurPendaftaran.setText(spin);
    }
}