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
        Book book = new Book("123456778", "Spring is fun and Java as well", "Robercik");
        dao.save(book);

        Book foundBook = dao.get(1L);
        System.out.println(foundBook);

        Thread.sleep(5000);

    }

}