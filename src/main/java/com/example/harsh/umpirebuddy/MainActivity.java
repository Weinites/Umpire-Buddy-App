package com.example.harsh.umpirebuddy;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

      Button strikebtn;
      Button ballbtn;
      TextView striketv;
     TextView  balltv;
     int ballCnt;
     int strikeCnt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        strikebtn=(Button)findViewById(R.id.btnStrike);
        ballbtn=(Button)findViewById(R.id.btnBall);
        balltv=(TextView)findViewById(R.id.tvBallCnt);
        striketv=(TextView)findViewById(R.id.tvStrikeCnt);
        balltv.setText("0");
        striketv.setText("0");
        ballbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               ballCnt= Integer.parseInt(balltv.getText().toString());
                ballCnt=ballCnt+1;
               balltv.setText(String.valueOf(ballCnt));
                strikeCnt= Integer.parseInt(striketv.getText().toString());


                if(ballCnt==4 && strikeCnt<4){
                    AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
                    alert.setTitle("Message");
                    alert.setMessage("Walk!!");
                    alert.setPositiveButton("OK",null);
                    alert.setCancelable(false);
                    alert.show();
                }
            }
        });
        strikebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strikeCnt= Integer.parseInt(striketv.getText().toString());
                strikeCnt=strikeCnt+1;
                striketv.setText(String.valueOf(strikeCnt));
                ballCnt= Integer.parseInt(balltv.getText().toString());
                if(strikeCnt==3 && ballCnt<3)
                {
                    AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
                    alert.setTitle("Message");
                    alert.setMessage("Out!!");
                    alert.setPositiveButton("OK",null);
                    alert.setCancelable(false);
                    alert.show();
                }
            }
        });


    }
}
