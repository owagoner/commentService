package edu.cmu.odw.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Comment implements Comparable<Comment>{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @Column(columnDefinition="varchar(500)")
    private String text;
    private Long entityId;    
    private Timestamp timestamp;
    private String ipAddress;
    private String username;
    
    public Comment() {}
    
    public Comment(String text, Long entityId, Timestamp timestamp, String ipAddress, String username) {		
		this.text = text;
		this.entityId = entityId;
		this.timestamp = timestamp;
		this.ipAddress = ipAddress;
		this.username = username;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getText() {
		return text;
	}



	public void setText(String text) {
		this.text = text;
	}



	public Long getEntityId() {
		return entityId;
	}



	public void setEntityId(Long entityId) {
		this.entityId = entityId;
	}



	public Timestamp getTimestamp() {
		return timestamp;
	}



	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}



	public String getIpAddress() {
		return ipAddress;
	}



	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	
//	public Comparator<Comment> CommentDataComparator = new Comparator<Comment>(){
//		public int compare(Comment c1, Comment c2){
//			return c1.getTimestamp().compareTo(c2.getTimestamp());
//		}
//	}
	
	

	@Override
    public String toString() {
        return "Comment[id=" + this.id + ", text=" + this.text +", by entity id=" + this.getEntityId() + " at " + this.timestamp.toString() + " from " + this.ipAddress + "]";
    }

	@Override
	public int compareTo(Comment c1) {
		return this.timestamp.compareTo(c1.getTimestamp());
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}




