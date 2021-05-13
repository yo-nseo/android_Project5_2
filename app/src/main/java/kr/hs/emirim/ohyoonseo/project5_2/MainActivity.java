package kr.hs.emirim.ohyoonseo.project5_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edit1, edit2;
    TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int[] btnIds = {R.id.btn0, R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4,
                        R.id.btn5, R.id.btn6, R.id.btn7, R.id.btn8, R.id.btn9};
        Button[] btnNums = new Button[btnIds.length];

        for(int i = 0; i < btnNums.length; i++) {
            btnNums[i] = findViewById(btnIds[i]);
        }

        edit1 = findViewById(R.id.edit1);
        edit2 = findViewById(R.id.edit2);

        Button btnPlus = findViewById(R.id.btn_plus);
        Button btnMinus = findViewById(R.id.btn_minus);
        Button btnMulti = findViewById(R.id.btn_multi);
        Button btnDivide = findViewById(R.id.btn_divide);
        textResult = findViewById(R.id.text_result);

        btnPlus.setOnClickListener(btnOperationListener);
        btnMinus.setOnClickListener(btnOperationListener);
        btnMulti.setOnClickListener(btnOperationListener);
        btnDivide.setOnClickListener(btnOperationListener);
    }

    View.OnClickListener btnOperationListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int num1 = Integer.parseInt(edit1.getText().toString());
            int num2 = Integer.parseInt(edit2.getText().toString());
            int result = 0;

            switch (v.getId()) {
                case R.id.btn_plus:
                    result = num1 + num2;
                    break;
                case R.id.btn_minus:
                    result = num1 - num2;
                    break;
                case R.id.btn_multi:
                    result = num1 * num2;
                    break;
                case R.id.btn_divide:
                    result = num1 / num2;
                    break;
            }

            textResult.setTextSize(R.string.text_result);
            textResult.append(" " + result);
        }
    };

}