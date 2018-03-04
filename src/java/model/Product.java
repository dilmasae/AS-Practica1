/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

public class Product {
    
    private String img;
    private String title;
    private String text;
    private int price;

    public Product(String img, String title, String text, int price) {
        this.img = img;
        this.title = title;
        this.text = text;
        this.price = price;
    }

    public String getImg() {
        return img;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public int getPrice() {
        return price;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}
