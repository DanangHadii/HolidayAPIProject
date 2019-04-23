package com.example.holidayapiproject.Presenter;

import android.content.Context;

import com.example.holidayapiproject.Connection.BaseApp;
import com.example.holidayapiproject.Model.HolidayResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public interface HomeInterface {
    private Context context;
    private HomeView homeview;

    public HomeInterface (Context context, HomeView homeView){
        this.context = context;
        this.homeview = homeView;
    }
    public void loadHoliday(String country, String year,  String month) {
        BaseApp.service.getHoliday(country, year, month).enqueue(new Callback<HolidayResponse>() {
            @Override
            public void onResponse(Call<HolidayResponse> call, HolidayResponse holidayResponse) {
                if (holidayResponse.isSuccessful()) {
                    homeview.onSucces(holidayResponse.body().getHolidays());
                } else {
                    homeview.onError(holidayResponse.message());
                }
            }

            @Override
            public void onResponse(Call<HolidayResponse> call, Response<HolidayResponse> response) {

            }

            @Override
            public void onFailure(Call<HolidayResponse> call, Throwable t) {
                homeview.onFailure(t.getMessage());
            }
        });
    }
}
