package com.ironManSocial.dto.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import com.ironManSocial.dao.model.Comment;
import com.ironManSocial.dao.model.User;

public class PostDTO implements Serializable{


	private static final long serialVersionUID = -254497870711894572L;

	/* Instance Variable Declaration */

	private long postID;

	private String postSubject; /* In future, remove if not needed */

	private String postDescription;

	private Date postTime;

	private String userstamp;

	private Date createdDate;

	private Date timestamp;

	private Date lastModifiedTimestamp;

	private User user;

	private Collection<Comment> postComments = new ArrayList<Comment>();

	/* Default Constructor */

	public PostDTO() {

	}

	/* Getter & Setter for Instance Variables */

	@Override
	public String toString() {
		return "Post [postID=" + postID + ", postSubject=" + postSubject + ", postDescription=" + postDescription
				+ ", postTime=" + postTime + ", userstamp=" + userstamp + ", createdDate=" + createdDate
				+ ", timestamp=" + timestamp + ", lastModifiedTimestamp=" + lastModifiedTimestamp + ", user=" + user
				+ ", postComments=" + postComments + "]";
	}

	public long getPostID() {
		return postID;
	}

	public void setPostID(long postID) {
		this.postID = postID;
	}

	public String getPostSubject() {
		return postSubject;
	}

	public void setPostSubject(String postSubject) {
		this.postSubject = postSubject;
	}

	public String getPostDescription() {
		return postDescription;
	}

	public void setPostDescription(String postDescription) {
		this.postDescription = postDescription;
	}

	public Date getPostTime() {
		return postTime;
	}

	public void setPostTime(Date postTime) {
		this.postTime = postTime;
	}

	public String getUserStamp() {
		return userstamp;
	}

	public void setUserStamp(String userStamp) {
		this.userstamp = userStamp;
	}

	public Date getTimeStamp() {
		return timestamp;
	}

	public void setTimeStamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public Collection<Comment> getPostComments() {
		return postComments;
	}

	public void setPostComments(Collection<Comment> postComments) {
		this.postComments = postComments;
	}

	public String getUserstamp() {
		return userstamp;
	}

	public void setUserstamp(String userstamp) {
		this.userstamp = userstamp;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public Date getLastModifiedTimestamp() {
		return lastModifiedTimestamp;
	}

	public void setLastModifiedTimestamp(Date lastModifiedTimestamp) {
		this.lastModifiedTimestamp = lastModifiedTimestamp;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
