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

            if(edt_nome.text.isEmpty()){
                edt_nome.error = "Campo não pode ser vazio!"
                edt_nome.requestFocus()
            } else if(edt_senha.text.isEmpty()){
                edt_senha.error = "Campo não pode ser vazio!"
                edt_senha.requestFocus()
            } else {
                val intent = Intent(this, HomeActivity::class.java);
                val nome = edt_nome.editableText.toString();
                intent.putExtra("nome", nome);
                startActivity(intent);
            }

        }
    }
}
