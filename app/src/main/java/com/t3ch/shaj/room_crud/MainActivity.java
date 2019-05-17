package com.t3ch.shaj.room_crud;

import android.arch.persistence.room.Room;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.t3ch.shaj.room_crud.database.AppDatabase;
import com.t3ch.shaj.room_crud.database.MobileEntity;

public class MainActivity extends AppCompatActivity {

    //db
    public static AppDatabase mDatabase;

    //ui
    EditText nameEditText;
    EditText priceEditText;
    Button saveButton;
    Button viewButton;
    TextView mobileTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEditText = findViewById(R.id.m_name);
        priceEditText = findViewById(R.id.m_price);
        saveButton = findViewById(R.id.btn_Save);
        viewButton = findViewById(R.id.btn_view);
        mobileTextView = findViewById(R.id.tv_view_data);


        mDatabase = Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "mobiledb").allowMainThreadQueries().build();

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MobileEntity mobile = new MobileEntity(nameEditText.getText().toString(), priceEditText.getText().toString());

                mDatabase.mDatabaseDao().insertMobileData(mobile);

            }
        });

        viewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mobileTextView.setText(mDatabase.mDatabaseDao().getData().toString());

            }
        });


    }
}
