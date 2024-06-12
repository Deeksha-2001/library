package com.example.library.model;


import javax.persistence.*;

@Entity
@Table(name = "Book_info")
public class Library {
    public Library(Long book_id, String bookname, String author, Long noofcopies) {
        this.book_id = book_id;
        this.bookname = bookname;
        this.author = author;
        this.noofcopies = noofcopies;
    }
    public Library()
    {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long book_id;

    private String bookname;

    private String author;

    private Long noofcopies;

    public Long getBook_id() {
        return book_id;
    }

    public void setBook_id(Long book_id) {
        this.book_id = book_id;
    }

    public String getBookname() {
        return bookname;
    }



    public void setBookname(String bookname) {
        this.bookname = bookname;
    }



    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Long getNoofcopies() {
        return noofcopies;
    }

    public void setNoofcopies(Long noofcopies) {
        this.noofcopies = noofcopies;
    }



}
