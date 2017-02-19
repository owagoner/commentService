package edu.cmu.odw;

import java.sql.Timestamp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import edu.cmu.odw.model.Comment;
import edu.cmu.odw.service.CommentService;


@Configuration
public class SeedData {

	@Autowired
    private CommentService commentService;
    
    private static final Logger log = LoggerFactory.getLogger(SeedData.class);

    @Bean
    public SeedData getBean() {        

        Comment c1 = new Comment("text",new Long(1),new Timestamp(new Long("1486902720000")),"123.214.242.122");
        
        
        commentService.save(c1);
        
        log.info("Comments found with findAll():");
        log.info("-------------------------------");
        for (Comment c : commentService.findAll()) {
            log.info(c.toString());
        }
        return new SeedData();
    }
}
