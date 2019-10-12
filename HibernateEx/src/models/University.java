/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Sushant Sinha
 */
@Entity
public class University {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    int univ_id;
    String name;
    String city;
    String state;
    @OneToMany
    Collection<College> colleges = new ArrayList<>();

    public void setColleges(Collection<College> colleges) {
        this.colleges = colleges;
    }

    public Collection<College> getColleges() {
        return colleges;
    }

    public int getUniv_id() {
        return univ_id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public void setUniv_id(int univ_id) {
        this.univ_id = univ_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }
    
}
