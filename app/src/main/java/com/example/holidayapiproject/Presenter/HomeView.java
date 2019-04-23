package com.example.holidayapiproject.Presenter;

import com.example.holidayapiproject.Model.HolidaysItem;

import java.util.List;

public class HomeView {
    void onSucces(List<HolidaysItem> holidayItemList);

    void onError(String errorMessage);

    void onFailure (String failureMessage);
}
