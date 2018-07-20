package com.prashant.questions;

import java.util.ArrayList;
import java.util.Date;

public class Comment {
	private int id;
	private String message;
	private String sender;
	private Date date;
	//Replies will be added here
	//ArrayList because infinite replies
	private ArrayList<Replies> repList = new ArrayList<>();
	public Comment(int id , String message, String sender, Date date){
		this.id = id;
		this.message = message;
		this.sender = sender;
		this.date = date;
		 
	}
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getMessage() {
		return message;
	}



	public void setMessage(String message) {
		this.message = message;
	}



	public String getSender() {
		return sender;
	}



	public void setSender(String sender) {
		this.sender = sender;
	}



	public Date getDate() {
		return date;
	}



	public void setDate(Date date) {
		this.date = date;
	}



	public ArrayList<Replies> getRepList() {
		return repList;
	}

	public void setRepList(ArrayList<Replies> repList) {
		this.repList = repList;
	}

	@Override
	public String toString() {
		return "Comment [id=" + id + ", message=" + message + ", sender=" + sender + ", date=" + date + "]";
	}
	
}