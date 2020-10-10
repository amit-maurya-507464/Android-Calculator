package com.tejbhan.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button one,two,three,four,five,six,seven,eight,nine,zero,dot,equal,add,sub,mul,div,clr,del,mod,info;
    TextView text;
    String num = "";
    double num1=0,num2=0;
    char op;
    boolean flag = false;
    double x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one=findViewById(R.id.btn_1);
        two=findViewById(R.id.btn_2);
        three=findViewById(R.id.btn_3);
        four=findViewById(R.id.btn_4);
        five=findViewById(R.id.btn_5);
        six=findViewById(R.id.btn_6);
        seven=findViewById(R.id.btn_7);
        eight=findViewById(R.id.btn_8);
        nine=findViewById(R.id.btn_9);
        zero=findViewById(R.id.btn_0);
        dot=findViewById(R.id.btn_dot);
        equal=findViewById(R.id.btn_eql);
        add=findViewById(R.id.btn_add);
        sub=findViewById(R.id.btn_sub);
        mul=findViewById(R.id.btn_mul);
        div=findViewById(R.id.btn_div);
        mod=findViewById(R.id.btn_mod);
        del=findViewById(R.id.btn_del);
        clr=findViewById(R.id.btn_clr);

        info=findViewById(R.id.btn_info);

        text=findViewById(R.id.txt);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num = text.getText().toString();
                x = Double.parseDouble(num);
                if(x==0 && flag==false)
                {
                    num = "";
                }
                text.setText(num+1);
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num = text.getText().toString();
                x = Double.parseDouble(num);
                if(x==0 && flag==false)
                {
                    num = "";
                }
                text.setText(num+2);
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num = text.getText().toString();
                x = Double.parseDouble(num);
                if(x==0 && flag==false)
                {
                    num = "";
                }
                text.setText(num+3);
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num = text.getText().toString();
                x = Double.parseDouble(num);
                if(x==0 && flag==false)
                {
                    num = "";
                }
                text.setText(num+4);
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num = text.getText().toString();
                x = Double.parseDouble(num);
                if(x==0 && flag==false)
                {
                    num = "";
                }
                text.setText(num+5);
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num = text.getText().toString();
                x = Double.parseDouble(num);
                if(x==0 && flag==false)
                {
                    num = "";
                }
                text.setText(num+6);
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num = text.getText().toString();
                x = Double.parseDouble(num);
                if(x==0 && flag==false)
                {
                    num = "";
                }
                text.setText(num+7);
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num = text.getText().toString();
                x = Double.parseDouble(num);
                if(x==0 && flag==false)
                {
                    num = "";
                }
                text.setText(num+8);
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num = text.getText().toString();
                x = Double.parseDouble(num);
                if(x==0 && flag==false)
                {
                    num = "";
                }
                text.setText(num+9);
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num = text.getText().toString();
                x = Double.parseDouble(num);
                if(x==0 && flag==false)
                {
                    num = "";
                }
                text.setText(num+0);
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num = text.getText().toString();
                String str =".";
                if(flag==false)
                {
                    text.setText(num+str);
                    flag = true;
                }
            }
        });



    }

    public void add(View v)
    {
        num1 = Double.parseDouble(text.getText().toString());
        text.setText("0");
        op = '+';
        flag=false;
    }

    public void sub(View v)
    {
        num1 = Double.parseDouble(text.getText().toString());
        text.setText("0");
        op = '-';
        flag=false;
    }

    public void mul(View v)
    {
        num1 = Double.parseDouble(text.getText().toString());
        text.setText("0");
        op = '*';
        flag=false;
    }

    public void div(View v)
    {
        num1 = Double.parseDouble(text.getText().toString());
        text.setText("0");
        op = '/';
        flag=false;
    }

    public void mod(View v)
    {
        num1 = Double.parseDouble(text.getText().toString());
        text.setText("0");
        op = '%';
        flag=false;
    }

    public void clear(View v)
    {
        text.setText("0");
        num1=0;
        op = 'c';
        flag=false;
    }

    public void del(View v)
    {
        num = text.getText().toString();
        StringBuilder sb = new StringBuilder(num);
        int a = num.length();
        if(sb.charAt(a-1)=='.')
        {
            flag=false;
        }
        sb.deleteCharAt(a-1);
        text.setText(sb.toString());
        if(a==1)
        {
            text.setText("0");
        }
    }

    public void equal(View v)
    {
        num2 = Double.parseDouble(text.getText().toString());

        switch(op)
        {
            case '+':
                text.setText(String.valueOf(num1+num2));
                flag=true;
                break;
            case '-':
                text.setText(String.valueOf(num1-num2));
                flag=true;
                break;
            case '*':
                text.setText(String.valueOf(num1*num2));
                flag=true;
                break;
            case '/':
                text.setText(String.valueOf(num1/num2));
                flag=true;
                break;
            case '%':
                text.setText(String.valueOf(num1%num2));
                flag=true;
                break;
        }
    }

    public void info(View v)
    {
        Intent intent = new Intent(this , info.class);
        startActivity(intent);
    }


}
