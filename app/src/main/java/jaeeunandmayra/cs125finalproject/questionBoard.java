package jaeeunandmayra.cs125finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class questionBoard extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_board);

//        button = (Button) findViewById(R.id.button2);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                openQuestionBoard();
//            }
//        });
    }
//    public void openQuestionBoard() {
//        Intent intent = new Intent(this, QuestionPage.class);
//        startActivity(intent);
//    }
}
