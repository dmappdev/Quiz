package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    Map<String,String> questions = new HashMap<String, String>();
    int question_nmb = 1;
    TextView question_txt;
    TextView answer1_txt;
    TextView answer2_txt;
    TextView answer3_txt;
    TextView outcome_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        question_txt = findViewById(R.id.question_txt);
        answer1_txt = findViewById(R.id.answer1_txt);
        answer2_txt = findViewById(R.id.answer2_txt);
        answer3_txt = findViewById(R.id.answer3_txt);
        outcome_txt = findViewById(R.id.outcome_txt);


        questions.put("Question1", "What is Kylo Ren's Real Name?");
        questions.put("Right1", "Ben Solo");
        questions.put("WrongA1", "Anakin Skywalker");
        questions.put("WrongB1", "Mr Cuddles");

        questions.put("Question2", "What color is Darth Maul's light saber?");
        questions.put("Right2", "Red");
        questions.put("WrongA2", "Blue");
        questions.put("WrongB2", "Green");

        questions.put("Question3", "What is the subtitle of Star Wars: Episode IV?");
        questions.put("Right3", "A New Hope");
        questions.put("WrongA3", "Return of the Jedi");
        questions.put("WrongB3", "Mr Puddle's Picnic");
        setQuestion();
    }

    private void setQuestion() {
        question_txt.setText(questions.get("Question"+question_nmb).toString());
        answer1_txt.setText(questions.get("Right"+question_nmb).toString());
        answer1_txt.setTag("Correct");
        answer2_txt.setText(questions.get("WrongA"+question_nmb).toString());
        answer3_txt.setText(questions.get("WrongB"+question_nmb).toString());

    }


}