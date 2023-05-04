/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author akash
 */
public class BankReprensentative extends User implements Serializable {
    protected LocalDate doj;
    
    public BankReprensentative(String ID, String pass ){
    this.ID = ID;
    this.pass = pass;
    }

    public BankReprensentative(LocalDate doj) {
        this.doj = doj;
    }

    public BankReprensentative(LocalDate doj, String Name, int nid_num, String phone_number, String ID, String email, String pass, LocalDate dob) {
        super(Name, nid_num, phone_number, ID, email, pass, dob);
        this.doj = doj;
    }

    public LocalDate getDoj() {
        return doj;
    }

    public void setDoj(LocalDate doj) {
        this.doj = doj;
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

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

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
        return "BankReprensentative{" + "doj=" + doj + '}';
    }

}
