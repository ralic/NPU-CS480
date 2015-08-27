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
public class Service {

    private double price;
    private String version;

    public Service() {
    }

    ;
        public Service(double price, String version) {
        this.price = price;
        this.version = version;
    }

    public double getprice() {
        return price;
    }

    public String getversion() {
        return version;
    }

    public void setcode(double price) {
        this.price = price;
    }

    public void setauthor(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return ("Price:" + price + "|Version:" + version);
    }
}
