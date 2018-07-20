package com.prashant.questions;

import java.util.TreeSet;

public class User {
	private String userid;
	private String password;
	//Unique + Sorted 
	private TreeSet<Post> postSet = new TreeSet<>();
	public User(String userid, String password){
		this.userid = userid;
		this.password = password;
	}
	@Override
	public String toString(){
		return "Userid "+userid+" Password "+password+" Post Set "+postSet;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public TreeSet<Post> getPostSet() {
		return postSet;
	}
	public void setPostSet(TreeSet<Post> postSet) {
		this.postSet = postSet;
	}
	
}