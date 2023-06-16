package hu.gde.runnersdemo;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "shoe")
public class ShoeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long shoeId;

    @Column(name = "name")
    private String shoeName;

    public ShoeEntity() {
    }

    public long getShoeId() {
        return shoeId;
    }
    public String getShoeName() {
        return shoeName;
    }
    public void setShoeId(long shoeId) { this.shoeId = shoeId;}
    public void setShoeName(String shoeName) {
        this.shoeName = shoeName;
    }

}
