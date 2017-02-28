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

        Comment c1 = new Comment("Aenean fermentum. Donec ut mauris eget massa tempor convallis. Nulla neque libero, convallis eget, eleifend luctus, ultricies eu, nibh.",new Long(1)
        		,new Timestamp(new Long("1486902720000")),"123.214.242.122","sallytravel");
        Comment c2 = new Comment("Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Proin risus. Praesent lectus. Vestibulum quam sapien, varius ut, blandit non, interdum in, ante. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Duis faucibus accumsan odio.",new Long(1)
        		,new Timestamp(new Long("1491491601000")),"211.169.248.159","clipreview");
        Comment c3 = new Comment("Curabitur in libero ut massa volutpat convallis. Morbi odio odio, elementum eu, interdum eu, tincidunt in, leo. Maecenas pulvinar lobortis est. Phasellus sit amet erat.",new Long(1)
        		,new Timestamp(new Long("1487002503000")),"218.40.141.100","jsmith");
        Comment c4 = new Comment("Sed vel enim sit amet nunc viverra dapibus. Nulla suscipit ligula in lacus. Curabitur at ipsum ac tellus semper interdum. Mauris ullamcorper purus sit amet nulla. Quisque arcu libero, rutrum ac, lobortis vel, dapibus at, diam.",new Long(1)
        		,new Timestamp(new Long("1488713309000")),"211.25.189.42","fredsmith");
        Comment c5 = new Comment("Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.",new Long(2)
        		,new Timestamp(new Long("1489897172000")),"218.40.141.100","jsmith");
        Comment c6 = new Comment("Morbi vestibulum, velit id pretium iaculis, diam erat fermentum justo, nec condimentum neque sapien placerat ante. Nulla justo. Aliquam quis turpis eget elit sodales scelerisque. Mauris sit amet eros.",new Long(2)
        		,new Timestamp(new Long("1493157436000")),"211.25.189.42","fredsmith");
        Comment c7 = new Comment("Maecenas tristique, est et tempus semper, est quam pharetra magna, ac consequat metus sapien ut nunc. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Mauris viverra diam vitae quam.",new Long(2)
        		,new Timestamp(new Long("1487909165000")),"218.40.141.100","jsmith");
        Comment c8 = new Comment("Vestibulum quam sapien, varius ut, blandit non, interdum in, ante. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Duis faucibus accumsan odio. Curabitur convallis. Duis consequat dui nec nisi volutpat eleifend. Donec ut dolor.",new Long(2)
        		,new Timestamp(new Long("1490487323000")),"108.43.182.211","useruser");
        Comment c9 = new Comment("Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.",new Long(3)
        		,new Timestamp(new Long("1491804374000")),"102.141.148.237","livepitt");
        Comment c10 = new Comment("Morbi vestibulum, velit id pretium iaculis, diam erat fermentum justo, nec condimentum neque sapien placerat ante. Nulla justo. Aliquam quis turpis eget elit sodales scelerisque. Mauris sit amet eros.",new Long(3)
        		,new Timestamp(new Long("1487373586000")),"140.251.245.73","finediner");
        Comment c11 = new Comment("Maecenas tristique, est et tempus semper, est quam pharetra magna, ac consequat metus sapien ut nunc. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Mauris viverra diam vitae quam.",new Long(3)
        		,new Timestamp(new Long("1486654011000")),"140.251.245.73","finediner");
        Comment c12 = new Comment("Fusce lacus purus, aliquet at, feugiat non, pretium quis, lectus. Suspendisse potenti.",new Long(3)
        		,new Timestamp(new Long("1484536047000")),"35.111.167.21","speterson");
        Comment c13 = new Comment("Vestibulum quam sapien, varius ut, blandit non, interdum in, ante. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Duis faucibus accumsan odio. Curabitur convallis. Duis consequat dui nec nisi volutpat eleifend. Donec ut dolor.",new Long(3)
        		,new Timestamp(new Long("1492904055000")),"149.36.240.218","sallytravel");
        Comment c14 = new Comment("Morbi vestibulum, velit id pretium iaculis, diam erat fermentum justo, nec condimentum neque sapien placerat ante. Nulla justo. Aliquam quis turpis eget elit sodales scelerisque. Mauris sit amet eros.",new Long(4)
        		,new Timestamp(new Long("1488881121000")),"149.36.240.218","sallytravel");
        Comment c15 = new Comment("Maecenas tristique, est et tempus semper, est quam pharetra magna, ac consequat metus sapien ut nunc. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Mauris viverra diam vitae quam.",new Long(4)
        		,new Timestamp(new Long("1489434147000")),"109.120.19.198","mmjackson");
        Comment c16 = new Comment("Vestibulum quam sapien, varius ut, blandit non, interdum in, ante. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Duis faucibus accumsan odio. Curabitur convallis. Duis consequat dui nec nisi volutpat eleifend. Donec ut dolor.",new Long(5)
        		,new Timestamp(new Long("1491523121000")),"207.231.251.35","santa1");
        
        commentService.save(c1);
        commentService.save(c2);
        commentService.save(c3);
        commentService.save(c4);
        commentService.save(c5);
        commentService.save(c6);
        commentService.save(c7);
        commentService.save(c8);
        commentService.save(c9);
        commentService.save(c10);
        commentService.save(c11);
        commentService.save(c12);
        commentService.save(c13);
        commentService.save(c14);
        commentService.save(c15);
        commentService.save(c16);
        
        log.info("Comments found with findAll():");
        log.info("-------------------------------");
        for (Comment c : commentService.findAll()) {
            log.info(c.toString());
        }
        return new SeedData();
    }
}
