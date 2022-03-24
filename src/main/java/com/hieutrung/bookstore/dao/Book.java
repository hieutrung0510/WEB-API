/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hieutrung.bookstore.dao;

import java.io.Serializable;

/**
 *
 * @author PC
 */
public class Book implements Serializable{
    //Có bnhieu loại interface:
    //Có vài loại :
    //1.+Marker INterface: không yêu cầu class implements nó phải có code => interface không có hàm
    //	    báo hiệu cho JVM biết phải làm gì
    //	    Serialize nghĩa là TUẦN TỰ
    
    //2.+Functional Interface: chỉ có duy nhất 1 hàm abstract
    //	    Khi xài sử dụng Anonymous => LAMBDA
    //	    Comparable/Comparator
    
    //3+ Interface còn lại: phải implement và viết code cho tất cả các hàm.
    
    
    //Dependency Lombok giúp cho get,set, constructor của JAVA ngắn gọn y C#
    private String isbn;
    private String title;
    private String author;
    private int edition;
    private double publishedYear;

    public Book() {
    }

    public Book(String isbn, String title, String author, int edition, double publishedYear) {
	this.isbn = isbn;
	this.title = title;
	this.author = author;
	this.edition = edition;
	this.publishedYear = publishedYear;
    }

    public String getIsbn() {
	return isbn;
    }

    public void setIsbn(String isbn) {
	this.isbn = isbn;
    }

    public String getTitle() {
	return title;
    }

    public void setTitle(String title) {
	this.title = title;
    }

    public String getAuthor() {
	return author;
    }

    public void setAuthor(String author) {
	this.author = author;
    }

    public int getEdition() {
	return edition;
    }

    public void setEdition(int edition) {
	this.edition = edition;
    }

    public double getPublishedYear() {
	return publishedYear;
    }

    public void setPublishedYear(double publishedYear) {
	this.publishedYear = publishedYear;
    }

    @Override
    public String toString() {
	return "Book{" + "isbn=" + isbn + ", title=" + title + ", author=" + author + ", edition=" + edition + ", publishedYear=" + publishedYear + '}';
    }
    
    
}
