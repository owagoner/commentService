package edu.cmu.odw.service;

import org.springframework.data.repository.CrudRepository;
import edu.cmu.odw.model.Comment;


public interface CommentService extends CrudRepository<Comment, Long>, CommentServiceCustom {
	
}