package com.prashant.questions;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		HashMap<String,User> userMap = new HashMap<>();
		User user = new User("amit","123");
		User user2 = new User("ram","222");
		
		userMap.put(user.getUserid(),user);
		userMap.put(user2.getUserid(),user2);
		
		Calendar c = Calendar.getInstance();
		c.set(Calendar.MONTH, 10);
		c.set(Calendar.YEAR, 2016);
		c.set(Calendar.DATE, 21);
		c.set(Calendar.HOUR,10);
		c.set(Calendar.MINUTE,11);
		c.set(Calendar.SECOND,12);
		Post post = new Post(10, "Sample Post 1", "ram", new Date());
		Comment comment = new Comment(1,"Comment1","shyam",new Date());
		Replies rep1 = new Replies("Rep1", "ram", new Date());
		Replies rep2 = new Replies("Rep2", "sim", new Date());
		Replies rep3 = new Replies("Rep3", "mike", new Date());
		ArrayList<Replies> repList = new ArrayList<>();
		repList.add(rep1);
		repList.add(rep2);
		repList.add(rep3);
		Collections.sort(repList,(first,second)->first.getSender().compareToIgnoreCase(second.getSender()));
		comment.setRepList(repList);
		Comment comment2 = new Comment(2,"Comment2","shyam",new Date());
		LinkedHashSet<Comment> commentSet = new LinkedHashSet<>();
		commentSet.add(comment);
		commentSet.add(comment2);
		post.setCommentSet(commentSet);
		Post post2 = new Post(10, "Sample Post 2", "ram", c.getTime());
		TreeSet<Post> postSet = new TreeSet<>();
		postSet.add(post);
		postSet.add(post2);
		user.setPostSet(postSet);
		
		System.out.println("Enter the UserName to Search");
		Scanner scanner = new Scanner(System.in);
		String userName = scanner.next();
		User currentUser = userMap.get(userName);
		
		if(currentUser==null){
			System.out.println("User Not Found...");
			return ;
		}
		System.out.println("UserName and password is "+currentUser.getUserid()+" "+currentUser.getPassword());
		System.out.println("Post is ");
		//Post will be Traversed here 
		Iterator<Post> postIt = currentUser.getPostSet().iterator();
		while(postIt.hasNext()){
			//currentPost now have the Index or Object value which will moves towards the next 
			Post currentPost = postIt.next();
			//Inside Post there will be Comments 
			LinkedHashSet<Comment> commentSets = currentPost.getCommentSet();
			Iterator<Comment> commentIt = commentSets.iterator();
			while(commentIt.hasNext()){
				//commentIt will have the currentIndex or object and moves towards next
				Comment currentComment = commentIt.next();
				
				System.out.println("Comment is "+currentComment.getMessage()+" "+currentComment.getSender()+" "+currentComment.getDate());
				//Inside comment there would be Replies
				//Replies are traversed here 
				ArrayList<Replies>  repLists = currentComment.getRepList();
				for(Replies rep : repLists){
					System.out.println(rep.getSender()+" "+rep.getMessage()+" "+rep.getDate());
				}
			}
			System.out.println("Post is "+currentPost.getName()+" "+currentPost.getSenderName()+" "+currentPost.getDate());
		}
	}

}