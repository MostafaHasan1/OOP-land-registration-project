/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;


import java.io.Serializable;
import java.time.LocalDate;

public class Surveyor extends User implements Serializable {
    protected String city;
    protected String address;
    protected LocalDate doj;
    
    public Surveyor(String ID, String pass) {
        this.ID = ID;
        this.pass = pass;
    }

    public Surveyor(String city, String address, LocalDate doj) {
        this.city = city;
        this.address = address;
        this.doj = doj;
    }

    public Surveyor(String city, String address, LocalDate doj, String Name, int nid_num, String phone_number, String ID, String email, String pass, LocalDate dob) {
        super(Name, nid_num, phone_number, ID, email, pass, dob);
        this.city = city;
        this.address = address;
        this.doj = doj;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public void setName(String Name) {
        this.Name = Name;
    }

    @Override
    public int getNid_num() {
        return nid_num;
    }

    @Override
    public void setNid_num(int nid_num) {
        this.nid_num = nid_num;
    }

    @Override
    public String getPhone_number() {
        return phone_number;
    }

    @Override
    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }


    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public LocalDate getDob() {
        return dob;
    }

    @Override
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Surveyor =" +super.toString()+ "city=" + city + ", address=" + address + ", doj=" + doj + '}';
    }



    

}


