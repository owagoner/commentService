package edu.cmu.odw.controller;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.cmu.odw.model.Comment;
import edu.cmu.odw.service.CommentService;


@RestController
public class CommentController {

	@Autowired
	private CommentService commentService;

	@RequestMapping(value = "/api/comment/{id}")
	public Comment comment(@PathVariable("id") long id) {
		return commentService.findOne(id);
	}
	
	@RequestMapping(value = "/api/comment/latest/{num}")
	public Iterable<Comment> comment(@PathVariable("num") int num) {
		ArrayList<Comment> comments = (ArrayList<Comment>) commentService.findAll();		
	    Collections.sort(comments);
		return comments.stream().limit(num).collect(Collectors.toList());
	}
	
	@RequestMapping(value = "/api/comment/entity/{num}")	
	public Iterable<Comment> commentEntity(@PathVariable("num") long num) {		
		return commentService.findByEntityId(num);
	}
	
	@RequestMapping(value = "/api/comment", method = RequestMethod.POST)
	public Comment saveComment(@RequestBody Comment comment) {
		System.out.println(comment);		
		
		comment.setTimestamp(new Timestamp(System.currentTimeMillis()));
		return commentService.save(comment);
	}
	
	@RequestMapping(value = "/api/comment/delete/{id}", method = RequestMethod.DELETE)
	public boolean deleteComment(@PathVariable("id") long id) {
		Comment c = commentService.findOne(id);
		if(c == null){
			System.out.println("Comment not found.");
			return false;
		}else{
			System.out.println("Deleting comment: " + c);
			commentService.delete(id);
			return true;
		}
		
	}
	
}