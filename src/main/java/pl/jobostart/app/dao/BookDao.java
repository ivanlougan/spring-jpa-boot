package pl.jobostart.app.dao;

import pl.jobostart.app.model.Book;

public interface BookDao {

    void save(Book book);
    Book get(Long id);
}
