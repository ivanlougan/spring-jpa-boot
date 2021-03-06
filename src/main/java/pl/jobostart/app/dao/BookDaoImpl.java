package pl.jobostart.app.dao;

import org.springframework.stereotype.Repository;
import pl.jobostart.app.model.Book;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class BookDaoImpl implements BookDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void save(Book book) {
        entityManager.persist(book);
    }

    @Override
    public Book get(Long id) {
        Book book = entityManager.find(Book.class, id);
        return book;
    }

    @Override
    public void update(Book book) {
        entityManager.merge(book);
    }

    @Override
    public void remove(Long bookId) {
        Book bookToRemove = entityManager.find(Book.class, bookId);
        entityManager.remove(bookToRemove);
    }
}
