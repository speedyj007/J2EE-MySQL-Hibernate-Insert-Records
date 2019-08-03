
package java_design_hibernate_inserting_example_1;

import org.hibernate.annotations.Entity;


@Entity
public class Members {

 private int id;
 private String name, address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
 
 
    
    
}
