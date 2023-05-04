/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;

import java.io.Serializable;
import java.time.LocalDate;


public class GOVofficials extends User implements Serializable {

    public GOVofficials(String ID, String pass) {
        this.ID = ID;
        this.pass = pass;
    }
    
    public GOVofficials(String Name, String ID, int nid, String email, String mobileNum ){
        this.Name = Name;
        this.ID = ID;
        this.nid_num= nid;
        this.email = email;
        this.phone_number = mobileNum;
                
    }

    public GOVofficials(String Name, int nid_num, String phone_number, String ID, String email, String pass, LocalDate dob) {
        super(Name, nid_num, phone_number, ID, email, pass, dob);
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getNid_num() {
        return nid_num;
    }

    public void setNid_num(int nid_num) {
        this.nid_num = nid_num;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "GOVofficials{" + '}';
    }
    
}
