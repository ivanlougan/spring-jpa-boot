package pl.jobostart.app;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import pl.jobostart.app.dao.BookDao;
import pl.jobostart.app.model.Book;

@SpringBootApplication
public class SpringJpaBootApplication {

    public static void main(String[] args) throws InterruptedException{

        ConfigurableApplicationContext ctx = SpringApplication.run(SpringJpaBootApplication.class, args);
        BookDao dao = ctx.getBean(BookDao.class);

        // CREATE
        Book book = new Book("123456778", "Spring is fun and Java as well", "Robercik");
        dao.save(book);

        // UPDATE
        Book book2 = new Book("12345677890", "Spring and Java are even better", "Robi Zdebi");
        book2.setId(1L);
        dao.update(book2);

        // READ
        Book findBook = dao.get(1L);
        System.out.println(findBook);

        // DELETE
        dao.remove(1L);
        Book book3 = dao.get(1L);
        System.out.println(book3);


        Thread.sleep(5000);

    }

}