package com.prashant.questions;

import java.util.Date;
import java.util.LinkedHashSet;

public class Post implements Comparable<Post> {
	private int id;
	private String name;
	private String senderName;
	private Date date;
	
	//The Post is being added here..as some posts will have comments 
	//So LinkedHashSet is used here with comments 
	//LinkedHashSet is used here so that post will be displayed as in the form of Unique + Insertion and Ordered Form
	private LinkedHashSet<Comment> commentSet = new LinkedHashSet<>();
	
	public Post(int id, String name, String senderName, Date date){
		this.id = id;
		this.name = name;
		this.senderName = senderName;
		this.date = date;
		
	}
	
	
	
	public LinkedHashSet<Comment> getCommentSet() {
		return commentSet;
	}



	public void setCommentSet(LinkedHashSet<Comment> commentSet) {
		this.commentSet = commentSet;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getSenderName() {
		return senderName;
	}



	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}



	public Date getDate() {
		return date;
	}



	public void setDate(Date date) {
		this.date = date;
	}



	@Override
	public int compareTo(Post post){
		return this.date.compareTo(post.date);
	}
	@Override
	public String toString() {
		return "Post [id=" + id + ", name=" + name + ", senderName=" + senderName + ", date=" + date + ", commentSet="
				+ commentSet + "]";
	}
	
	
	
}