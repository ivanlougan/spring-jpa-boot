package pl.jobostart.app.model;

import java.io.Serializable;

import javax.persistence.*;

import javassist.SerialVersionUID;

@Entity
@Table(name = "books_from_library")
public class Book implements Serializable {

    private static final long SerialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private Long id;
    @Column(nullable = false, length = 13, unique = true)
    private String isbn;
    private String title;
    //    @Transient
    @Column(nullable = false)
    private String author;

    Book() {
    }


    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }


    @Override
    public String toString() {
        return "Book [isbn=" + isbn + ", title=" + title + ", author=" + author + "]";
    }


    //    @Id
//    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    //    @Transient
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}