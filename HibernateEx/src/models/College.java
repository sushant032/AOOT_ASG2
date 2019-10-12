package models;




import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sushant Sinha
 */

@Entity
public class College {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String name;
    String Address;
    int student_count;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return Address;
    }

    public int getStudent_count() {
        return student_count;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setStudent_count(int student_count) {
        this.student_count = student_count;
    }
    
}
