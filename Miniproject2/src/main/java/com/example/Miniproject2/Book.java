package com.example.Miniproject2;

public class Book {
    private int bookId;
    private String name;
    private String imageUrl;
    public Book(int bookId,String name,String imageUrl){
        this.bookId=bookId;
        this.imageUrl=imageUrl;
        this.name=name;
    }
    public int getBookId(){
        return bookId;
    }
    public void setBookId(int bookId){
        this.bookId=bookId;
    }
    public String getBookName(){
        return name;
    }
    public void setBookName(String bookName){
        this.name=bookName;
    }
    public String getImageUrl(){
        return imageUrl;
    }
    public void setImageUrl(String imageUrl){
        this.imageUrl=imageUrl;
    }
}
