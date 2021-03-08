package pl.jobostart.app.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

import javassist.SerialVersionUID;

@Entity
public class Book implements Serializable {

    private static final long SerialVersionUID = 1L;


    //    @Id
//    @GeneratedValue
    private Long id;
    private String isbn;
//    @Transient
    private String title;
    private String author;

    Book() { }



    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }



    @Override
    public String toString() {
        return "Book [isbn=" + isbn + ", title=" + title + ", author=" + author + "]";
    }


    @Id
    @GeneratedValue
    public Long getId() {
        System.out.println(">>>>>>>>>>>>>>>>>>get id");
        return id;
    }

    public void setId(Long id) {
        System.out.println(">>>>>>>>>>>>>>>>>>>set id");
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

    @Transient
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }





}