package com.example.sidra.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button nextbtn;
    TextView tv,number_of_question;
    RadioButton rdbtn1;
    RadioButton rdbtn2;
    RadioButton rdbtn3;
    RadioButton rdbtn4;
    int correct=0;
    int wrong=0;
    int count=0;
    int q_no=1;
    int checkedradiobutton[];
    final ArrayList<Question> questionArrayList=new ArrayList<Question>();

    /*int quiz_array[]={R.string.q1,R.string.q2,R.string.q3,R.string.q4,R.string.q5,R.string.q6};
    int answer_array[][]={{R.string._1a,R.string._1b,R.string._1c,R.string._1d},{R.string._2a,R.string._2b,R.string._2c,R.string._2d},
            {R.string._3a,R.string._3b,R.string._3c,R.string._3d}};
*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nextbtn=(Button)findViewById(R.id.button );
        rdbtn1=(RadioButton)findViewById(R.id.radioButton1);
        rdbtn2=(RadioButton)findViewById(R.id.radioButton2);
        rdbtn3=(RadioButton)findViewById(R.id.radioButton3);
        rdbtn4=(RadioButton)findViewById(R.id.radioButton4);
        tv=(TextView)findViewById(R.id.textView1);
        number_of_question=(TextView)findViewById(R.id.questionnumber);
        questionArrayList.add(new Question(1," What is the meaning of Pakistan?",new Answer(4," Muslim Land ","Land of five rivers "," Desert","Holy Land")));
        questionArrayList.add(new Question(2,"Who is the first Governor General of Pakistan?",new Answer(1,"  Mohammed Ali Jinnah","Liaquat Ali Khan "," Ayub Khan","Iskander Mirza")));
        questionArrayList.add(new Question(3,"What was the major event of 1971?",new Answer(1,"  Bangladesh broke away from Pakistan","Explosion of nuclear bomb ","Tashkent Agreement ","Nawaz Sharif became Prime Minister")));
        questionArrayList.add(new Question(4,"When Musharraf overthrew the government of Nawaz Sharif what designation did he take?",new Answer(2,"Consul ","Chief Executive "," Prime Minister","Dictator")));
        questionArrayList.add(new Question(5,"In which year did Pakistan win the Cricket World Cup?" ,new Answer(3,"1990 "," 1991","1992 ","1993")));
        questionArrayList.add(new Question(6,"Which party was in power in North West Frontier Province at the time of independence?",new Answer(3,"Muslim League "," Justice Party "," Congress"," Communist Party")));
        questionArrayList.add(new Question(7," Who succeeded Zia Ul Haque as President of Pakistan?",new Answer(3,"  Rafiq Tarar","  Farooq Ahmed Khan Leghari"," Ghulam Ishaq Khan "," Benazir Bhutto")));
        questionArrayList.add(new Question(8,"When did Pakistan become a Republic?",new Answer(2," 14/08/1947 "," 23/03/1956 "," 16/12/1971 "," 12/10/1999")));
        //initializing array to the size of arraylist
        checkedradiobutton=new int[questionArrayList.size()];
        //setting initial values to textarea and radio button
        tv.setText(questionArrayList.get(0).getQ_text());
        rdbtn1.setText( questionArrayList.get(count).getAnswer().a1_text);
        rdbtn2.setText( questionArrayList.get(count).getAnswer().a2_text);
        rdbtn3.setText( questionArrayList.get(count).getAnswer().a3_text);
        rdbtn4.setText( questionArrayList.get(count).getAnswer().a4_text);
        number_of_question.setText(" "+ q_no);

        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count==questionArrayList.size()-1)
                {
                    releasingResult();
                }
                else {
                    //uncheckingRadioButton();
                    ++q_no;
                    ++count;
                    String temp = questionArrayList.get(count).getQ_text();
                    tv.setText(temp);
                    number_of_question.setText(" "+q_no);
                    rdbtn1.setText( questionArrayList.get(count).getAnswer().a1_text);
                    rdbtn2.setText( questionArrayList.get(count).getAnswer().a2_text);
                    rdbtn3.setText( questionArrayList.get(count).getAnswer().a3_text);
                    rdbtn4.setText( questionArrayList.get(count).getAnswer().a4_text);
                    checkingWhichRadioButtonIsSelected(count);
                }
            }
        });
    }
    public  void checkingWhichRadioButtonIsSelected(int temp1)
    {

        if(rdbtn1.isSelected())
        {
            checkedradiobutton[temp1]=1;
        }
        else if(rdbtn2.isSelected())
        {
            checkedradiobutton[temp1]=2;
        }
        else if(rdbtn3.isSelected())
        {
            checkedradiobutton[temp1]=3;
        }
        else if(rdbtn4.isSelected())
        {
            checkedradiobutton[temp1]=4;
        }
    }
    public  void releasingResult()
    {

        for(int i=0;i<=questionArrayList.size()-1;i++)
        {
            if(questionArrayList.get(i).getAnswer().correct_ans_id==checkedradiobutton[i])
            {
                correct++;
            }
            else
            {
                wrong++;
            }
        }
        System.out.println("This is correct "+correct);
        Toast.makeText(MainActivity.this,"Your score is: "+correct,Toast.LENGTH_LONG).show();
    }
    public void uncheckingRadioButton()
    {
        rdbtn1.setChecked(false);
        rdbtn2.setChecked(false);
        rdbtn3.setChecked(false);
        rdbtn4.setChecked(false);

    }
}
