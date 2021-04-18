package com.example.calculator102;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView calcdis;
    String v1, v2, sign;
    Double num1, num2, result;
    Character op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //////////////////////////////////////////////////////
        calcdis = (TextView) findViewById(R.id.calcdis);
    }

    private void SetNumber(View v) {

        Button btn = (Button) v;
        calcdis.setText(calcdis.getText() + btn.getText().toString());
    }

    /////////////////////////////////////////////////////
    public void btn1(View n1) {

        SetNumber(n1);
    }

    public void btn2(View n2) {

        SetNumber(n2);
    }

    public void btn3(View n3) {

        SetNumber(n3);
    }

    public void btn4(View n4) {

        SetNumber(n4);
    }

    public void btn5(View n5) {

        SetNumber(n5);
    }

    public void btn6(View n6) {

        SetNumber(n6);
    }

    public void btn7(View n7) {

        SetNumber(n7);
    }

    public void btn8(View n8) {

        SetNumber(n8);
    }

    public void btn9(View n9) {

        SetNumber(n9);
    }

    public void btnDot(View dot) {

        SetNumber(dot);
    }

    public void btn0(View n0) {

        SetNumber(n0);
    }

    /////////////////////////////////////////////////////////////
    public void btnAdd(View add) {

        try {
            num1 = Double.valueOf(calcdis.getText().toString());
            calcdis.setText("");
            op = '+';
        }catch (Exception e) {
            Toast.makeText(getApplicationContext(), "There is No Input!!!", Toast.LENGTH_SHORT).show();
        }
    }

    public void btnSub(View sub) {

try {


        num1 = Double.valueOf(calcdis.getText().toString());
        calcdis.setText("");
        op = '-';
}
       catch (Exception e) {
    Toast.makeText(getApplicationContext(), "There is No Input!!!", Toast.LENGTH_SHORT).show();
}
    }

    public void btnMuli(View muli) {


        try {
            num1 = Double.valueOf(calcdis.getText().toString());
            calcdis.setText("");
            op = '*';
        }catch (Exception e) {
            Toast.makeText(getApplicationContext(), "There is No Input!!!", Toast.LENGTH_SHORT).show();
        }
    }

    public void btnDev(View dev) {
        try {
        num1 = Double.valueOf(calcdis.getText().toString());
        calcdis.setText("");
        op = '/';
        }catch (Exception e) {
            Toast.makeText(getApplicationContext(), "There is No Input!!!", Toast.LENGTH_SHORT).show();
        }
    }

    public void xn(View view) {
        try {
            op = 'p';
            v1 = calcdis.getText().toString();
            calcdis.setText("");
        } catch (Exception e) {
        e.getStackTrace();
        }
    }

    ////////////////////////////////////////////////////////////
    @SuppressLint("SetTextI18n")
    public void btnEq(View equal) {

        try {
            num2 = Double.valueOf(calcdis.getText().toString());

            switch (op) {
                case '+':
                    result = num1 + num2;
                    break;

                case '-':
                    result = num1 - num2;
                    break;

                case '*':
                    result = num1 * num2;
                    break;

                case '/':
                    result = num1 / num2;
                    break;
                case 'p':
                    num1 = Double.parseDouble((v1));
                    v2 = calcdis.getText().toString();
                    num2 = Double.parseDouble(v2);
                    result = Math.pow(num1, num2);
                    break;
            }
            calcdis.setText(result.toString());
        }catch (Exception e) {
            Toast.makeText(getApplicationContext(), "There is No Input!!!", Toast.LENGTH_SHORT).show();
        }
    }

    public void pb(View view) {
        try {
            num1 = (Double.valueOf(calcdis.getText().toString())) / 100;
            calcdis.setText(num1 + "");
        } catch (Exception e) {
            Toast.makeText(getApplicationContext(), "There is No Input!!!", Toast.LENGTH_SHORT).show();
        }

//        num1 = (Double.valueOf(calcdis.getText().toString())) / 100;
//        calcdis.setText(num1 + "");

    }

    public void minb(View view) {
        try {
        Double nn;
        nn = (Double.valueOf(calcdis.getText().toString())) / -1;
        calcdis.setText(nn + "");
    }catch (Exception e) {
            Toast.makeText(getApplicationContext(), "There is No Input!!!", Toast.LENGTH_SHORT).show();
        }
    }

    public void btnClr(View clr) {

        calcdis.setText("");
    }
//////////////////////////////
public void btnClick_delete(View view) {
    if (calcdis.getText().equals("")) {
        calcdis.setText(null);
    } else {
        int len = calcdis.getText().length();
        String s = calcdis.getText().toString();
        if (s.charAt(len - 1) == '.') {

            calcdis.setText(calcdis.getText().subSequence(0, calcdis.getText().length() - 1));

        } else {
            calcdis.setText(calcdis.getText().subSequence(0, calcdis.getText().length() - 1));
        }
    }
}
/////////////////////////////////////////////////
    public void sinn(View view) {
        try {
        Double sin;
        sin = Math.sin(Double.valueOf(calcdis.getText().toString()));
        calcdis.setText(sin + "");
    }catch (Exception e) {
            Toast.makeText(getApplicationContext(), "There is No Input!!!", Toast.LENGTH_SHORT).show();
        }
    }

    public void coss(View view) {

        try {
        Double cos;
        cos = Math.cos(Double.valueOf(calcdis.getText().toString()));
        calcdis.setText(cos + "");
    }catch (Exception e) {
            Toast.makeText(getApplicationContext(), "There is No Input!!!", Toast.LENGTH_SHORT).show();
        }
    }

    public void tann(View view) {
        try {
        Double tan;
        tan = Math.tan(Double.valueOf(calcdis.getText().toString()));
        calcdis.setText(tan + "");
    }catch (Exception e) {
            Toast.makeText(getApplicationContext(), "There is No Input!!!", Toast.LENGTH_SHORT).show();
        }
    }

    public void sinh(View view) {

        try {
        Double sinh;
        sinh = Math.sinh(Double.valueOf(calcdis.getText().toString()));
        calcdis.setText(sinh + "");
    }catch (Exception e) {
            Toast.makeText(getApplicationContext(), "There is No Input!!!", Toast.LENGTH_SHORT).show();
        }
    }

    public void cosh(View view) {
        try {
        Double cosh;
        cosh = Math.cosh(Double.valueOf(calcdis.getText().toString()));
        calcdis.setText(cosh + "");

    }catch (Exception e) {
            Toast.makeText(getApplicationContext(), "There is No Input!!!", Toast.LENGTH_SHORT).show();
        }
    }


    public void tanh(View view) {
        try {
        Double tanh;
        tanh = Math.tanh(Double.valueOf(calcdis.getText().toString()));
        calcdis.setText(tanh + "");
    }catch (Exception e) {
            Toast.makeText(getApplicationContext(), "There is No Input!!!", Toast.LENGTH_SHORT).show();
        }
    }

    public void squaree(View view) {
        try {
        Double input;
        input = (Double.valueOf(calcdis.getText().toString())) * (Double.valueOf(calcdis.getText().toString()));
        calcdis.setText(input + "");
    }catch (Exception e) {
            Toast.makeText(getApplicationContext(), "There is No Input!!!", Toast.LENGTH_SHORT).show();
        }
    }

    public void roott(View view) {
        try {
        Double input;
        input = Math.sqrt(Double.valueOf(calcdis.getText().toString()));
        calcdis.setText(input + "");
    }catch (Exception e) {
            Toast.makeText(getApplicationContext(), "There is No Input!!!", Toast.LENGTH_SHORT).show();
        }
    }

    public void logg(View view) {
        try {
        Double input;
        input = Math.log10(Double.valueOf(calcdis.getText().toString()));
        calcdis.setText(input + "");
    }catch (Exception e) {
            Toast.makeText(getApplicationContext(), "There is No Input!!!", Toast.LENGTH_SHORT).show();
        }
    }

    public void pi(View view) {
        calcdis.setText("3.14");
    }

    public void lnn(View view) {
        try {
        Double input;
        input = Math.log(Double.valueOf(calcdis.getText().toString()));
        calcdis.setText(input + "");
    }catch (Exception e) {
            Toast.makeText(getApplicationContext(), "There is No Input!!!", Toast.LENGTH_SHORT).show();
        }
    }

    public void ep(View view) {
        try {
        Double input;
        input = (Double.valueOf(calcdis.getText().toString())) * (2.718281828459045);
        calcdis.setText(input + "");
    }catch (Exception e) {
            Toast.makeText(getApplicationContext(), "There is No Input!!!", Toast.LENGTH_SHORT).show();
        }
    }

    public void fac(View view) {
        try {
        int input = Integer.parseInt(calcdis.getText().toString());
        int k = 1;
        for (int i = 1; i <= input; i++) {
            k = k * i;
        }
        calcdis.setText(Integer.toString(k));
    }catch (Exception e) {
            Toast.makeText(getApplicationContext(), "There is No Input!!!", Toast.LENGTH_SHORT).show();
        }
    }
    public void ex(View view) {
        try {
        Double input;
        input = Math.exp(Double.valueOf(calcdis.getText().toString()));
        calcdis.setText(input + "");
    }catch (Exception e) {
            Toast.makeText(getApplicationContext(), "There is No Input!!!", Toast.LENGTH_SHORT).show();
        }
    }
}




//    public void xy1(View view) {
//        v1 = calcdis.getText().toString();
//        num1 = Double.parseDouble(v1);
//        v2 = calcdis.getText().toString();
//        num2=Double.parseDouble(v2);
//        calcdis.setText(Math.pow(num1,num2) +"");
//    }











//    public void btnEq(View view) {
//
//    try {
//    num2 = Double.valueOf(calcdis.getText().toString());
//    switch (op) {
//
//        case '+':
//            result = num1 + num2;
//            break;
//
//        case '-':
//            result = num1 - num2;
//            break;
//
//        case '*':
//            result = num1 * num2;
//            break;
//
//        case '/':
//            result = num1 / num2;
//            break;
//    }
//    calcdis.setText(result.toString());
//      } catch (Exception EX) {
//            Toast.makeText(this, EX.getMessage(), Toast.LENGTH_SHORT).show();
//        }
//}