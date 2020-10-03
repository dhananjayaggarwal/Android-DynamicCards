package com.example.dynamiccards;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<LuggageCollectModel> mLuggage = new ArrayList<>();
    private LinearLayout llParent;

    private View.OnClickListener myClickListener = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            Log.d("DEBUG", "onClick: "+v.getId()+" :Tag: "+v.getTag());

           // collectButton_2_1 i.e. collectButton_sno_index
            int index1 = v.getTag().toString().indexOf("_");
            TextInputEditText rem ;
            rem =  findViewById(R.id.cardParent).findViewWithTag("remarks"+v.getTag().toString().substring(index1));
            Log.d("DEBUG", "rem.getText(): "+rem.getText());
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i = 0; i < 5; i++) {
            mLuggage.add(new LuggageCollectModel(""+(i+1),"Dhananjay", "19524929", "971603024"+i, "0"+i));
        }

        llParent = (LinearLayout) findViewById(R.id.cardParent);

        TextInputEditText[] employeeName = new TextInputEditText[mLuggage.size()];
        TextInputEditText[] employeeID = new TextInputEditText[mLuggage.size()];
        TextInputEditText[] mobileNumber = new TextInputEditText[mLuggage.size()];
        TextInputEditText[] tokenNumber = new TextInputEditText[mLuggage.size()];
        TextInputEditText[] remarks = new TextInputEditText[mLuggage.size()];
        Button[] collectButton = new Button[mLuggage.size()];

        for (int i = 0; i < mLuggage.size(); i++) {
            View view = getLayoutInflater().inflate(R.layout.luggage_collect_item, llParent, false);

            employeeName[i] = view.findViewById(R.id.employeeName);
            employeeName[i].setText(mLuggage.get(i).getEmployeeName());

            employeeID[i] =view.findViewById(R.id.employeeID);
            employeeID[i].setText(mLuggage.get(i).getEmployeeID());

            mobileNumber[i] = view.findViewById(R.id.mobileNumber);
            mobileNumber[i].setText(mLuggage.get(i).getMobileNumber());

            tokenNumber[i] = view.findViewById(R.id.tokenNumber);
            tokenNumber[i].setText(mLuggage.get(i).getTokenNumber());

            remarks[i] = view.findViewById(R.id.remarks);
            remarks[i].setText(mLuggage.get(i).getRemarks());
            remarks[i].setTag("remarks_"+mLuggage.get(i).getSno()+"_"+i);

            collectButton[i] = view.findViewById(R.id.collectButton);
            collectButton[i].setTag("collectButton_"+mLuggage.get(i).getSno()+"_"+i);
            collectButton[i].setOnClickListener(myClickListener);
            llParent.addView(view);
        }

    }
}