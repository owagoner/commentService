package edu.cmu.odw.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import edu.cmu.odw.model.Comment;

public class CommentServiceImpl implements CommentServiceCustom{

	@Autowired
	CommentService commentService;
	
	@Override
	public Iterable<Comment> findByIpAddress(String ipAddress) {
        ArrayList<Comment> result = new ArrayList<Comment>();
		
	    Iterable<Comment> comments = commentService.findAll();	
		
		for(Comment c: comments){
			if(c.getIpAddress() == ipAddress){
				result.add(c);
			}
		}
		return result;
	}

	@Override
	public Iterable<Comment> findByEntityId(Long entityId) {
        ArrayList<Comment> result = new ArrayList<Comment>();
		
	    Iterable<Comment> comments = commentService.findAll();		
	    
		for(Comment c: comments){
			if(c.getEntityId() == entityId){
				result.add(c);
			}
		}
		
		return result;
	}

}