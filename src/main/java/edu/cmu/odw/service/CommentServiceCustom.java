package edu.cmu.odw.service;

import edu.cmu.odw.model.Comment;

public interface CommentServiceCustom{
    
	public Iterable<Comment> findByIpAddress(String ipAddress);
	public Iterable<Comment> findByEntityId(Long entityId);
	
}