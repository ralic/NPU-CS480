/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs480l_lab.g1;

/**
 *
 * @author raliclo
 */
public class Book {

    private double price;
    private String author;

    public Book() {
    }

    ;
        public Book(double price, String author) {
        this.price = price;
        this.author = author;
    }

    public double getprice() {
        return price;
    }

    public String getauthor() {
        return author;
    }

    public void setcode(double price) {
        this.price = price;
    }

    public void setauthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return ("Price:" + price + "|Author:" + author);
    }
}
