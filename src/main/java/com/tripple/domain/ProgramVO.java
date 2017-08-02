package com.tripple.domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class ProgramVO {
	int program_id;
	int user_id;
	String title;
	String city;
	String start_time;
	String end_time;
	float meeting_lng;
	float meeting_lat;
	int participant_max;
	String content;
	String img_url = "http://211.253.24.106/images/title_default.png";
	String languages;
	String themes;
	
	public int getProgram_id() {
		return program_id;
	}
	public void setProgram_id(int program_id) {
		this.program_id = program_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStart_time() {
		return start_time;
	}
	public void setStart_time(String start_time) throws ParseException {
		this.start_time = start_time;
	}
	public String getEnd_time() {
		return end_time;
	}
	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}

	public void setMeeting_lng(float meeting_lng) {
		this.meeting_lng = meeting_lng;
	}
	public float getMeeting_lat() {
		return meeting_lat;
	}
	public void setMeeting_lat(float meeting_lat) {
		this.meeting_lat = meeting_lat;
	}
	public int getParticipant_max() {
		return participant_max;
	}
	public void setParticipant_max(int participant_max) {
		this.participant_max = participant_max;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getImg_url() {
		return img_url;
	}

	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}
	public String getLanguages() {
		return languages;
	}
	public void setLanguages(String languages) {
		this.languages = languages;
	}
	public String getThemes() {
		return themes;
	}
	public void setThemes(String themes) {
		this.themes = themes;
	}
	
	@Override
	public String toString() {
		return "ProgramVO [program_id=" + program_id + ", user_id=" + user_id + ", title=" + title + ", city=" + city
				+ ", start_time=" + start_time + ", end_time=" + end_time + ", meeting_lng=" + meeting_lng
				+ ", meeting_lat=" + meeting_lat + ", participant_max=" + participant_max + ", content=" + content
				+ ", img_url=" + img_url + ", languages=" + languages + ", themes=" + themes + "]";
	}
	
}