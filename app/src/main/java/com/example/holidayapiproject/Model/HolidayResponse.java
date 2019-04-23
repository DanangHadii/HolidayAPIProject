package com.example.holidayapiproject.Model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class HolidayResponse {

	@SerializedName("holidays")
	private List<HolidaysItem> holidays;

	@SerializedName("status")
	private int status;

	public void setHolidays(List<HolidaysItem> holidays){
		this.holidays = holidays;
	}

	public List<HolidaysItem> getHolidays(){
		return holidays;
	}

	public void setStatus(int status){
		this.status = status;
	}

	public int getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"HolidayResponse{" +
			"holidays = '" + holidays + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}