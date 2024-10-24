package es.jos.calculadora_jos_pmdm04;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TextView resultTv;
    private Button oneBt;
    private Button twoBt;
    private Button threeBt;
    private Button fourBt;
    private Button fiveBt;
    private Button sixBt;
    private Button sevenBt;
    private Button eightBt;
    private Button nineBt;
    private Button zeroBt;
    private Button dotBt;
    private Button equalBt;
    private Button minusBt;
    private Button plusBt;
    private Button multiplyBt;
    private Button divideBt;
    private Button delBt;
    private Button cBt;
    //Declaramos las variables para usar los objetos creados en la interfaz gráfica.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        resultTv = findViewById(R.id.resultTv);
        oneBt = findViewById(R.id.oneBt);
        twoBt = findViewById(R.id.twoBt);
        threeBt = findViewById(R.id.threeBt);
        fourBt = findViewById(R.id.fourBt);
        fiveBt = findViewById(R.id.fiveBt);
        sixBt = findViewById(R.id.sixBt);
        sevenBt = findViewById(R.id.sevenBt);
        eightBt = findViewById(R.id.eightBt);
        nineBt = findViewById(R.id.nineBt);
        zeroBt = findViewById(R.id.zeroBt);
        dotBt = findViewById(R.id.dotBt);
        equalBt = findViewById(R.id.equalBt);
        minusBt = findViewById(R.id.minusBt);
        plusBt = findViewById(R.id.plusBt);
        multiplyBt = findViewById(R.id.multiplyBt);
        divideBt = findViewById(R.id.divideBt);
        delBt = findViewById(R.id.delBt);
        cBt = findViewById(R.id.cBt);
        //Los enlazamos.

        oneBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTv.append("1");
            }
        });
        twoBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTv.append("2");
            }
        });
        threeBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTv.append("3");
            }
        });
        fourBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTv.append("4");
            }
        });
        fiveBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTv.append("5");
            }
        });
        sixBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTv.append("6");
            }
        });
        sevenBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTv.append("7");
            }
        });
        eightBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTv.append("8");
            }
        });
        nineBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTv.append("9");
            }
        });
        zeroBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTv.append("0");
            }
        });
        dotBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTv.append(".");
            }
        });
        plusBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String currentText = resultTv.getText().toString();
                    if (firstOrLastIsAOperator(currentText)){
                        resultTv.setText("");
                        resultTv.setHint("ERROR");
                    } else if (currentText.contains("/")||currentText.contains("*")||currentText.contains("+")||currentText.contains("-")){
                        calculate(resultTv);
                        resultTv.append("+");
                    } else resultTv.append("+");
                } catch (Exception e) {
                    resultTv.setText("");
                    resultTv.setHint("ERROR");
                }

            }
        });
        minusBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String currentText = resultTv.getText().toString();
                    if (firstOrLastIsAOperator(currentText)){
                        resultTv.setText("");
                        resultTv.setHint("ERROR");
                    } else if (currentText.contains("/")||currentText.contains("*")||currentText.contains("+")||currentText.contains("-")){
                        calculate(resultTv);
                        resultTv.append("-");
                    } else resultTv.append("-");
                } catch (Exception e) {
                    resultTv.setText("");
                    resultTv.setHint("ERROR");
                }
            }
        });
        multiplyBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String currentText = resultTv.getText().toString();
                    if (firstOrLastIsAOperator(currentText)){
                        resultTv.setText("");
                        resultTv.setHint("ERROR");
                    } else if (currentText.contains("/")||currentText.contains("*")||currentText.contains("+")||currentText.contains("-")){
                        calculate(resultTv);
                        resultTv.append("*");
                    } else resultTv.append("*");
                } catch (Exception e) {
                    resultTv.setText("");
                    resultTv.setHint("ERROR");
                }
            }
        });
        divideBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String currentText = resultTv.getText().toString();
                    if (firstOrLastIsAOperator(currentText)){
                        resultTv.setText("");
                        resultTv.setHint("ERROR");
                    } else if (currentText.contains("/")||currentText.contains("*")||currentText.contains("+")||currentText.contains("-")){
                        calculate(resultTv);
                        resultTv.append("/");
                    } else resultTv.append("/");
                } catch (Exception e) {
                    resultTv.setText("");
                    resultTv.setHint("ERROR");
                }
            }
        });

        // Limpia el TextView estableciendolo en ""
        cBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTv.setText("");
            }
        });

        // Elimina el último carácter del TextView, es decir lo establece exactamente igual sin incluir el último caracter.
        delBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = resultTv.getText().toString();
                if (!currentText.isEmpty()) {
                    resultTv.setText(currentText.substring(0, currentText.length() - 1));
                }
            }
        });

        equalBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    calculate(resultTv);
                } catch (Exception e){
                    resultTv.setText("");
                    resultTv.setHint("ERROR");
                }
            }
        });

    }

    public static boolean firstOrLastIsAOperator(String s){
        if (!s.isEmpty()&&(s.substring(0).equals('/')||s.substring(0).equals('*')||s.substring(0).equals('+')||s.substring(0).equals('-')||s.substring(0).equals('.')||
        s.charAt(s.length()-1)=='/'||s.charAt(s.length()-1)=='*'||s.charAt(s.length()-1)=='+'||s.charAt(s.length()-1)=='-'||s.charAt(s.length()-1)=='.')) {
            return true;
        } else return false;
    }

    public static boolean moreThanOneDot(String s){
        int counter=0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='.') counter++;
        }
        if (counter>1) return true;
        else return false;
    }

    public static void calculate(TextView tv){
        String currentText = tv.getText().toString();
        double num1=0;
        double num2=0;
        if (currentText.contains("/")) {
            String number1=currentText.substring(0, currentText.indexOf('/'));
            num1=Double.parseDouble(number1);
            String number2=currentText.substring(currentText.indexOf('/')+1);
            num2=Double.parseDouble(number2);
            if (firstOrLastIsAOperator(number1)||firstOrLastIsAOperator(number2)||moreThanOneDot(number1)||moreThanOneDot(number2)){
                tv.setText("");
                tv.setHint("ERROR");
            } else {
                double result=num1/num2;
                tv.setText(String.valueOf(result)); // Muestra el resultado y limpia los operadores
            }
        } else if (currentText.contains("*")) {
            String number1=currentText.substring(0, currentText.indexOf('*'));
            num1=Double.parseDouble(number1);
            String number2=currentText.substring(currentText.indexOf('*')+1);
            num2=Double.parseDouble(number2);
            if (firstOrLastIsAOperator(number1)||firstOrLastIsAOperator(number2)||moreThanOneDot(number1)||moreThanOneDot(number2)){
                tv.setText("");
                tv.setHint("ERROR");
            } else {
                double result=num1*num2;
                tv.setText(String.valueOf(result)); // Muestra el resultado y limpia los operadores
            }
        } else if (currentText.contains("+")) {
            String number1=currentText.substring(0, currentText.indexOf('+'));
            num1=Double.parseDouble(number1);
            String number2=currentText.substring(currentText.indexOf('+')+1);
            num2=Double.parseDouble(number2);
            if (firstOrLastIsAOperator(number1)||firstOrLastIsAOperator(number2)||moreThanOneDot(number1)||moreThanOneDot(number2)){
                tv.setText("");
                tv.setHint("ERROR");
            } else {
                double result=num1+num2;
                tv.setText(String.valueOf(result)); // Muestra el resultado y limpia los operadores
            }
        } else if (currentText.contains("-")) {
            String number1=currentText.substring(0, currentText.indexOf('-'));
            num1=Double.parseDouble(number1);
            String number2=currentText.substring(currentText.indexOf('-')+1);
            num2=Double.parseDouble(number2);
            if (firstOrLastIsAOperator(number1)||firstOrLastIsAOperator(number2)||moreThanOneDot(number1)||moreThanOneDot(number2)){
                tv.setText("");
                tv.setHint("ERROR");
            } else {
                double result=num1-num2;
                tv.setText(String.valueOf(result)); // Muestra el resultado y limpia los operadores
            }
        }
    }
}
