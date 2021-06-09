package br.com.diastecnologia.componentesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    private EditText campoNome;
    private TextInputEditText campoEmail;
    private TextView textoResultado;

    //Checkbox
    private CheckBox checkVerde;
    private CheckBox checkBranco;
    private CheckBox checkVermelho;

    //RadioButton
    private RadioButton sexoMaculino, sexoFeminino;
    private RadioGroup opcaoSexo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        campoNome = findViewById(R.id.editNome);
        campoEmail = findViewById(R.id.editEmail);
        textoResultado = findViewById(R.id.textResultado);

        //Checkbox
        checkVerde = findViewById(R.id.checkVerde);
        checkBranco = findViewById(R.id.checkBranco);
        checkVermelho = findViewById(R.id.checkVermelho);

        //RadioButton
        sexoFeminino = findViewById(R.id.radioButtonF);
        sexoMaculino = findViewById(R.id.radioButtonM);
        opcaoSexo = findViewById(R.id.radioGroupSexo);

        radiobutton();


    }
    public void checkbox(){
        String texto = "";

        if(checkVerde.isChecked()){
            texto = "Verde selecionado - ";
        }
        if(checkBranco.isChecked()){
            texto = texto + "Branco selecionado - ";
        }
        if(checkVermelho.isChecked()){
            texto = texto + "Vermelho selecionado - ";
        }
        textoResultado.setText(texto);


    }
    public void radiobutton(){
        opcaoSexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radioButtonM){
                    textoResultado.setText("Masculino");
                }else{
                    textoResultado.setText("Feminino");
                }

            }
        });

        /* String text = "";
        if(sexoMaculino.isChecked()){
            text = "Masculino";
        }
        else if(sexoFeminino.isChecked()){
            text = "Feminino";
        }
        textoResultado.setText(text);

         */

    }
    public void enviar(View view){

        radiobutton();

        //checkbox();

        /*
        String nome = campoNome.getText().toString();
        String email = campoEmail.getText().toString();

        textoResultado.setText("Nome: " + nome + " Email: " + email );

         */
    }
    public void limpar(View view){
        campoNome.setText("");
        campoEmail.setText("");
        textoResultado.setText("resultado");

    }

}