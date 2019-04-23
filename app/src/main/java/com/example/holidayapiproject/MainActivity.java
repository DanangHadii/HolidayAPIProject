package com.example.holidayapiproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.holidayapiproject.Adapter.HolidayAdapter;
import com.example.holidayapiproject.Model.HolidaysItem;
import com.example.holidayapiproject.Presenter.HomeInterface;
import com.example.holidayapiproject.Presenter.HomeView;

public class MainActivity extends AppCompatActivity implements HomeView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        private RecyclerView rc;
        private HolidayAdapter adapter;
        private HomeInterface homeInterface;
        private String country = "US";
        private String year = "2018";
        private String month = "12";

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            rc = findViewById(R.id.rc_holiday);
            homeInterface = new HomeInterface(this, this) {
                @Override
                public void loadHoliday(String country, String year, String month) {

                }
            };
            homeInterface.loadHoliday(country, year, month);
        }

        @Override
        public void onSucces(List< HolidaysItem > holidayItemList) {
            adapter = new HolidayAdapter(getApplicationContext(), holidayItemList);
            rc.setLayoutManager(new LinearLayoutManager(this));
            rc.setAdapter(adapter);
            adapter.notifyDataSetChanged();
        }

        @Override
        public void onError(String errorMessage) {
            Toast.makeText(this, errorMessage, Toast.LENGTH_LONG).show();
        }

        @Override
        public void onFailure(String failureMessage) {
            Toast.makeText(this, failureMessage, Toast.LENGTH_SHORT).show();
        }
    }
}
