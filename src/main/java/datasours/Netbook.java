package datasours;

import java.io.Serializable;

public class Netbook implements Serializable {
    private int id;
    private String company;
    private String model;
    private Double price;

    public Netbook() {
        this.id = -1;
        this.company = "undefined";
        this.model = "undefined";
        this.price = 0.0;
    }

    public Netbook(int id, String company, String model, Double price) {
        this.id = id;
        this.company = company;
        this.model = model;
        this.price = price;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
