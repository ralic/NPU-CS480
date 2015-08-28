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
public class Product {

    private int code;
    private String description;

    public Product() {
    }

    public Product(int code, String descrption) {
        this.code = code;
        this.description = descrption;
    }

    public int getcode() {
        return code;
    }

    public String getdesc() {
        return description;
    }

    public void setcode(int code) {
        this.code = code;
    }

    public void setdesc(String descrption) {
        this.description = description;
    }

    @Override
    public String toString() {
        return ("Code:" + code + "|Description:" + description);
    }

}
