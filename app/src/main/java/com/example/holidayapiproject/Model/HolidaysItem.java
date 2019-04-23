package com.example.holidayapiproject.Model;

import com.google.gson.annotations.SerializedName;

public class HolidaysItem{

	@SerializedName("date")
	private String date;

	@SerializedName("country")
	private String country;

	@SerializedName("public")
	private boolean jsonMemberPublic;

	@SerializedName("name")
	private String name;

	public void setDate(String date){
		this.date = date;
	}

	public String getDate(){
		return date;
	}

	public void setCountry(String country){
		this.country = country;
	}

	public String getCountry(){
		return country;
	}

	public void setJsonMemberPublic(boolean jsonMemberPublic){
		this.jsonMemberPublic = jsonMemberPublic;
	}

	public boolean isJsonMemberPublic(){
		return jsonMemberPublic;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	@Override
 	public String toString(){
		return 
			"HolidaysItem{" + 
			"date = '" + date + '\'' + 
			",country = '" + country + '\'' + 
			",public = '" + jsonMemberPublic + '\'' + 
			",name = '" + name + '\'' + 
			"}";
		}
}