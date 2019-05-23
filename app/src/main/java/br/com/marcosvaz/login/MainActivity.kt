package br.com.marcosvaz.login

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_verificar.setOnClickListener {
            if(edt_nome.text.toString() == "marcos" && edt_senha.text.toString() == "12345"){
                val intent = Intent(this, HomeActivity::class.java);
                val nome = edt_nome.editableText.toString();
                intent.putExtra("nome", nome);
                startActivity(intent);
            } else {
                Toast.makeText(
                    this, "Usuário e senha inválidos", Toast.LENGTH_LONG
                ).show();
            }
        }
    }
}
