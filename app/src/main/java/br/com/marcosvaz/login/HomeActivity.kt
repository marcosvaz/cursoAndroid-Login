package br.com.marcosvaz.login

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val nome = intent.getStringExtra("nome");

        txv_hello.text = "Olá $nome!";

        btn_logout.setOnClickListener {
            onBackPressed();
        }
    }
}