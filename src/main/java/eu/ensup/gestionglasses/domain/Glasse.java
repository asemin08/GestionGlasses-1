package eu.ensup.gestionglasses.domaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Glasse {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int  reference;
    private String label;
    private Double price;

    public Glasse(int id, int reference, String label, Double price) {
        super();
        this.id = id;
        this.reference = reference;
        this.label = label;
        this.price = price;
    }

    public Glasse() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getReference() {
        return reference;
    }

    public void setReference(int reference) {
        this.reference = reference;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Glasse{" +
                "id=" + id +
                ", reference=" + reference +
                ", label='" + label + '\'' +
                ", price=" + price +
                '}';
    }
}