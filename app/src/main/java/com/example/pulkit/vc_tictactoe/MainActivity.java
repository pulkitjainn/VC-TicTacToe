package com.example.pulkit.vc_tictactoe;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Locale;


public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    Button p,str;
    TextView res;
    int b = 0,in=0;
    boolean p1=true;
    boolean p2=false;
    String x=null;
    String y=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);

        p = (Button) findViewById(R.id.p);
        res = (TextView) findViewById(R.id.res);
        p.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                speechInput();

            }
        });
    }

    public void speechInput() {

        Intent i = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        i.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        i.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());
        i.putExtra(RecognizerIntent.EXTRA_PROMPT, "Your Turn");

        try {
            startActivityForResult(i, 6);
        } catch (ActivityNotFoundException e) {
            Toast.makeText(MainActivity.this, "bla bla bla", Toast.LENGTH_SHORT).show();
        }
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==6 && resultCode==RESULT_OK && data!=null)
        {
            ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
            res.setText(result.get(0));
        }
        play();
    }

    void play() {
        x = (String) res.getText();
        if (x != y) {
            switch (x) {
                case "1":
                    if (p1 == true && p2 == false) {
                        b1.setText("X");
                        p1 = false;
                        p2 = true;
                    } else if (p1 == false && p2 == true) {
                        b1.setText("O");
                        p2 = false;
                        p1 = true;
                    }
                    in++;
                    break;
                case "2":
                    if (p1 == true && p2 == false) {
                        b2.setText("X");
                        p1 = false;
                        p2 = true;
                    } else if (p1 == false && p2 == true) {
                        b2.setText("O");
                        p2 = false;
                        p1 = true;
                    }
                    in++;
                    break;
                case "3":
                    if (p1 == true && p2 == false) {
                        b3.setText("X");
                        p1 = false;
                        p2 = true;
                    } else if (p1 == false && p2 == true) {
                        b3.setText("O");
                        p2 = false;
                        p1 = true;
                    }
                    in++;
                    break;
                case "4":
                    if (p1 == true && p2 == false) {
                        b4.setText("X");
                        p1 = false;
                        p2 = true;
                    } else if (p1 == false && p2 == true) {
                        b4.setText("O");
                        p2 = false;
                        p1 = true;
                    }
                    in++;
                    break;
                case "5":
                    if (p1 == true && p2 == false) {
                        b5.setText("X");
                        p1 = false;
                        p2 = true;
                    } else if (p1 == false && p2 == true) {
                        b5.setText("O");
                        p2 = false;
                        p1 = true;
                    }
                    in++;
                    break;
                case "6":
                    if (p1 == true && p2 == false) {
                        b6.setText("X");
                        p1 = false;
                        p2 = true;
                    } else if (p1 == false && p2 == true) {
                        b6.setText("O");
                        p2 = false;
                        p1 = true;
                    }
                    in++;
                    break;
                case "7":
                    if (p1 == true && p2 == false) {
                        b7.setText("X");
                        p1 = false;
                        p2 = true;
                    } else if (p1 == false && p2 == true) {
                        b7.setText("O");
                        p2 = false;
                        p1 = true;
                    }
                    in++;
                    break;
                case "8":
                    if (p1 == true && p2 == false) {
                        b8.setText("X");
                        p1 = false;
                        p2 = true;
                    } else if (p1 == false && p2 == true) {
                        b8.setText("O");
                        p2 = false;
                        p1 = true;
                    }
                    in++;
                    break;
                case "9":
                    if (p1 == true && p2 == false) {
                        b9.setText("X");
                        p1 = false;
                        p2 = true;
                    } else if (p1 == false && p2 == true) {
                        b9.setText("O");
                        p2 = false;
                        p1 = true;
                    }
                    in++;
                    break;
                case "Tu"://Because sometimes it interprets 2 as tu
                    if (p1 == true && p2 == false) {
                        b2.setText("X");
                        p1 = false;
                        p2 = true;
                    } else if (p1 == false && p2 == true) {
                        b2.setText("O");
                        p2 = false;
                        p1 = true;
                    }
                    in++;
                    break;
                case "sex"://Because sometimes it interprets 6 as sex
                    if (p1 == true && p2 == false) {
                        b6.setText("X");
                        p1 = false;
                        p2 = true;
                    } else if (p1 == false && p2 == true) {
                        b6.setText("O");
                        p2 = false;
                        p1 = true;
                    }
                    in++;
                    break;
                case "one"://Because sometimes it interprets 1 as one
                    if (p1 == true && p2 == false) {
                        b1.setText("X");
                        p1 = false;
                        p2 = true;
                    } else if (p1 == false && p2 == true) {
                        b1.setText("O");
                        p2 = false;
                        p1 = true;
                    }
                    in++;
                    break;

                default:
                    Toast.makeText(MainActivity.this, "Invalid Input", Toast.LENGTH_SHORT).show();
                    x = null;
                    break;
            }
            y = x;
            if ((b1.getText().toString() == b2.getText().toString() && b2.getText().toString() == b3.getText().toString() && b1.getText().toString() != "") || (b1.getText().toString() == b5.getText().toString() && b5.getText().toString() == b9.getText().toString() && b1.getText().toString() != "") || (b3.getText().toString() == b5.getText().toString() && b5.getText().toString() == b7.getText().toString() && b3.getText().toString() != "") || (b1.getText().toString() == b4.getText().toString() && b4.getText().toString() == b7.getText().toString() && b1.getText().toString() != "") || (b4.getText().toString() == b5.getText().toString() && b5.getText().toString() == b6.getText().toString() && b4.getText().toString() != "") || (b7.getText() == b8.getText().toString() && b8.getText().toString() == b9.getText().toString() && b7.getText().toString() != "") || (b3.getText().toString() == b6.getText().toString() && b6.getText().toString() == b9.getText().toString() && b3.getText().toString() != "") || (b2.getText().toString() == b5.getText().toString() && b5.getText().toString() == b8.getText().toString() && b2.getText().toString() != "")) {

                if (p1 == true) {
                    Toast.makeText(MainActivity.this, "PLAYER 2 WINS", Toast.LENGTH_SHORT).show();
                    clear();
                } else if (p2 == true) {
                    Toast.makeText(MainActivity.this, "PLAYER 1 WINS", Toast.LENGTH_SHORT).show();
                    clear();
                }
            }
            if (in == 9) {
                Toast.makeText(MainActivity.this, "DRAW", Toast.LENGTH_SHORT).show();
                clear();
            }
        }
    }

    void clear() {
        in = 0;
        p1=true;
        p2=false;
        b1.setText("1");
        b2.setText("2");
        b3.setText("3");
        b4.setText("4");
        b5.setText("5");
        b6.setText("6");
        b7.setText("7");
        b8.setText("8");
        b9.setText("9");
        Toast.makeText(this, "Player 1 start!", Toast.LENGTH_SHORT).show();
    }
}
