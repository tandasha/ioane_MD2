package com.example.ioanetandashvili_midterm_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{



    public Button button_1;

    private String[][] list;
    public Button button_2;
    public Button button_3;
    public Button button_4;



    public Button button_5;
    public Button button_6;
    public Button button_7;
    public Button button_8;
    public Button button_9;
    public Button button_x;

    public boolean hp = false;
    TextView text;

    private int score = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button_1 = findViewById(R.id.button1);
        button_2 = findViewById(R.id.button2);
        button_3 = findViewById(R.id.button3);
        button_4 = findViewById(R.id.button4);
        button_5 = findViewById(R.id.button5);
        button_6 = findViewById(R.id.button6);
        button_7 = findViewById(R.id.button7);
        button_8 = findViewById(R.id.button8);
        button_9 = findViewById(R.id.button9);
        button_x = findViewById(R.id.x);

        button_1.setText("1");
        button_2.setText("2");
        button_3.setText("3");
        button_4.setText("4");
        button_5.setText("5");
        button_6.setText("6");
        button_7.setText("7");
        button_8.setText("8");
        button_9.setText("9");

        button_1.setOnClickListener(this);
        button_2.setOnClickListener(this);
        button_3.setOnClickListener(this);
        button_4.setOnClickListener(this);
        button_5.setOnClickListener(this);
        button_6.setOnClickListener(this);
        button_7.setOnClickListener(this);
        button_8.setOnClickListener(this);
        button_9.setOnClickListener(this);
        button_x.setOnClickListener(this);

        text=findViewById(R.id.score);


    }

    public void onClick(View v) {
        String[][] list = new String[3][3];
            switch (v.getId()) {
                case R.id.button1:

                   list=mogeba();
                    if(list[0][0] == "N"){
                        score=score-1;
                    }else {
                        if (list[0][0] == "W") {
                            score = score + 5;
                            if (list[0][1] == "W") {
                                score = score + 5;
                            } else {
                                if (list[1][0] == "W") {
                                    score = score + 5;
                                }
                            }
                        } else {
                            score = score - 5;
                            if (list[0][1] == "L") {
                                score = score - 5;
                            }
                            if (list[1][0] == "L") {
                                score = score - 5;
                            }


                        }
                    }
                    break;


                case R.id.button2:
                    list=mogeba();
                    if(list[0][1] == "N"){
                        score=score-1;
                    }else {
                        if (list[0][1] == "W") {
                            score = score + 5;
                            if (list[0][2] == "W") {
                                score = score + 5;
                            }
                            if (list[0][1] == "W") {
                                score = score + 5;
                            }
                            if (list[1][0] == "W") {
                                score = score + 5;
                            }


                        } else {
                            if (list[0][1] == "L") {
                                score = score - 5;
                                if (list[0][2] == "L") {
                                    score = score - 5;
                                }
                                if (list[0][1] == "L") {
                                    score = score - 5;
                                }
                                if (list[1][0] == "L") {
                                    score = score - 5;
                                }
                            }
                        }
                    }
                    break;
                case R.id.button3:
                    list=mogeba();
                    if(list[0][2] == "N"){
                        score=score-1;
                    }else {
                        if (list[0][2] == "W") {
                            score = score + 5;
                            if (list[0][1] == "W") {
                                score = score + 5;
                            }
                            if (list[1][1] == "W") {
                                score = score + 5;
                            }


                        } else {
                            if (list[0][2] == "L") {
                                score = score - 5;
                                if (list[0][1] == "L") {
                                    score = score - 5;
                                }
                                if (list[1][1] == "L") {
                                    score = score - 5;
                                }

                            }
                        }
                    }
                    break;
                case R.id.button4:
                    list=mogeba();
                    if(list[1][0] == "N"){
                        score=score-1;
                    }else {
                        if (list[1][0] == "W") {
                            score = score + 5;
                            if (list[0][1] == "W") {
                                score = score + 5;
                            }
                            if (list[1][1] == "W") {
                                score = score + 5;
                            }
                            if (list[2][0] == "W") {
                                score = score + 5;
                            }


                        } else {
                            if (list[1][0] == "L") {
                                score = score - 5;
                                if (list[1][1] == "L") {
                                    score = score - 5;
                                }
                                if (list[2][0] == "L") {
                                    score = score - 5;
                                }

                            }
                        }
                    }
                    break;
                case R.id.button5:
                    list=mogeba();
                    if(list[1][1] == "N"){
                        score=score-1;
                    }else {
                        if (list[1][1] == "W") {
                            score = score + 5;
                            if (list[0][1] == "W") {
                                score = score + 5;
                            }
                            if (list[1][2] == "W") {
                                score = score + 5;
                            }
                            if (list[2][1] == "W") {
                                score = score + 5;
                            }
                            if (list[1][0] == "W") {
                                score = score + 5;
                            }


                        } else {
                            if (list[1][1] == "L") {
                                score = score - 5;
                                if (list[1][2] == "L") {
                                    score = score - 5;
                                }
                                if (list[0][1] == "L") {
                                    score = score - 5;
                                }
                                if (list[2][1] == "L") {
                                    score = score - 5;
                                }
                                if (list[1][0] == "L") {
                                    score = score - 5;
                                }

                            }
                        }
                    }
                    break;
                case R.id.button6:
                    list=mogeba();
                    if(list[1][2] == "N"){
                        score=score-1;
                    }else {
                        if (list[1][2] == "W") {
                            score = score + 5;
                            if (list[1][1] == "W") {
                                score = score + 5;
                            }
                            if (list[0][2] == "W") {
                                score = score + 5;
                            }
                            if (list[2][2] == "W") {
                                score = score + 5;
                            }


                        } else {
                            if (list[1][2] == "L") {
                                score = score - 5;
                                if (list[0][2] == "L") {
                                    score = score - 5;
                                }
                                if (list[1][1] == "L") {
                                    score = score - 5;
                                }
                                if (list[2][2] == "L") {
                                    score = score - 5;
                                }


                            }
                        }
                    }
                    break;
                case R.id.button7:
                    list=mogeba();
                    if(list[2][0] == "N"){
                        score=score-1;
                    }else {
                        if (list[2][0] == "W") {
                            score = score + 5;
                            if (list[1][0] == "W") {
                                score = score + 5;
                            }
                            if (list[2][1] == "W") {
                                score = score + 5;
                            }


                        } else {
                            if (list[2][0] == "L") {
                                score = score - 5;
                                if (list[1][0] == "L") {
                                    score = score - 5;
                                }
                                if (list[2][1] == "L") {
                                    score = score - 5;
                                }


                            }
                        }
                    }
                    break;
                case R.id.button8:
                    list=mogeba();
                    if(list[2][1] == "N"){
                        score=score-1;
                    }else {
                        if (list[2][1] == "W") {
                            score = score + 5;
                            if (list[2][0] == "W") {
                                score = score + 5;
                            }
                            if (list[2][2] == "W") {
                                score = score + 5;
                            }
                            if (list[1][1] == "W") {
                                score = score + 5;
                            }



                        } else {
                            if (list[2][1] == "L") {
                                score = score - 5;
                                if (list[2][0] == "L") {
                                    score = score - 5;
                                }
                                if (list[1][1] == "L") {
                                    score = score - 5;
                                }
                                if (list[2][2] == "L") {
                                    score = score - 5;
                                }


                            }
                        }
                    }
                    break;

                case R.id.button9:
                    list=mogeba();
                    if(list[2][2] == "N"){
                        score=score-1;
                    }else {
                        if (list[2][2] == "W") {
                            score = score + 5;
                            if (list[2][1] == "W") {
                                score = score + 5;
                            }
                            if (list[1][2] == "W") {
                                score = score + 5;
                            }




                        } else {
                            if (list[2][2] == "L") {
                                score = score - 5;
                                if (list[2][1] == "L") {
                                    score = score - 5;
                                }
                                if (list[1][2] == "L") {
                                    score = score - 5;
                                }


                            }
                        }
                    }
                    break;

                case R.id.x:
                    System.exit(1);
                    break;

            }
                text.setText(String.valueOf(score));
        }




    public  String[][]   mogeba() {
        String[] mogeba = {"N","W", "L" };
        Random r = new Random();
         String[][] list = new String[3][3];
        for (int k = 0; k < 3; k++) {
            for (int m = 0; m < 3; m++) {
                list[k][m] = mogeba[r.nextInt(3)];

            }
        }
        buttonMogeba(list);
        return list;
    }


    public void buttonMogeba(String[][] list)
    {
        button_1.setText(list[0][0]);
        button_2.setText(list[0][1]);
        button_3.setText(list[0][2]);
        button_4.setText(list[1][0]);
        button_5.setText(list[1][1]);
        button_6.setText(list[1][2]);
        button_7.setText(list[2][0]);
        button_8.setText(list[2][1]);
        button_9.setText(list[2][2]);
    }

}
