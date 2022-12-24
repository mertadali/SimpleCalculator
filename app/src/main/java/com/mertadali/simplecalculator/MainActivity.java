package com.mertadali.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText number1Text;
    EditText number2Text;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1Text = findViewById(R.id.number1Text);  // burada tanımlama işlemi yapıyoruz.
        number2Text = findViewById(R.id.number2Text);
        resultText = findViewById(R.id.resultText);
    }

    public void sum(View view) {// tanımlanan numberlar çağırılması için global hale getiriyoruz.( toplama)
        if (number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")) {

            resultText.setText("Enter Number!");

        } else {  // bu kısımda eğer kullanıcı ifade girmezse program çökmesin diye matches gibi bir işlem yaptık ve kontroller kullanarak yazdık.
            int number1 = Integer.parseInt(number1Text.getText().toString()); // çağırdığımız ifade string geldi.
            int number2 = Integer.parseInt(number2Text.getText().toString());
            int result = number1 + number2;
            resultText.setText("Result:" + result); // burada set text bir string istiyor integer ifadeye bu şekilde yazdırıyoruz.

        }


    }

    public void deduct(View view) { // (çıkarma)
        if (number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")) {

            resultText.setText("Enter Number!");

        } else {  // bu kısımda eğer kullanıcı ifade girmezse program çökmesin diye matches gibi bir işlem yaptık ve kontroller kullanarak yazdık.
            int number1 = Integer.parseInt(number1Text.getText().toString()); // çağırdığımız ifade string geldi.
            int number2 = Integer.parseInt(number2Text.getText().toString());
            int result = number1 - number2;
            resultText.setText("Result:" + result); // burada set text bir string istiyor integer ifadeye bu şekilde yazdırıyoruz.
        }
    }

    public void divide(View view) { // (bölme)
        if (number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")) {

            resultText.setText("Enter Number!");

        } else {  // bu kısımda eğer kullanıcı ifade girmezse program çökmesin diye matches gibi bir işlem yaptık ve kontroller kullanarak yazdık.
            int number1 = Integer.parseInt(number1Text.getText().toString()); // çağırdığımız ifade string geldi.
            int number2 = Integer.parseInt(number2Text.getText().toString());
            int result = number1 / number2;
            resultText.setText("Result:" + result); // burada set text bir string istiyor integer ifadeye bu şekilde yazdırıyoruz.

        }
    }

    public void multiply(View view) {  // (çarpma)
        if (number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")){

            resultText.setText("Enter Number!");

        } else {  // bu kısımda eğer kullanıcı ifade girmezse program çökmesin diye matches gibi bir işlem yaptık ve kontroller kullanarak yazdık.
            int number1 = Integer.parseInt(number1Text.getText().toString()); // çağırdığımız ifade string geldi.
            int number2 = Integer.parseInt(number2Text.getText().toString());
            int result = number1 * number2;
            resultText.setText("Result:" + result); // burada set text bir string istiyor integer ifadeye bu şekilde yazdırıyoruz.

            // kullanıcı sayı girmek için tıkladığında sadece sayı çıkması için input type ayarladık. Eğer ayarlamasaydık sadece sayılar çıkmayacaktı.

        }


    }
}