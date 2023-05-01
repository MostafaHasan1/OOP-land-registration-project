package mainpackage;

import java.io.Serializable;
import java.time.LocalDate;

public abstract class User implements Serializable {
    protected String Name;
    protected int nid_num;
    protected String phone_number;
    protected String ID;
    protected String email;
    protected String pass;
    protected LocalDate dob;

    public User() {
    }

    public User(String Name, int nid_num, String phone_number, String ID, String email, String pass, LocalDate dob) {
        this.Name = Name;
        this.nid_num = nid_num;
        this.phone_number = phone_number;
        this.ID = ID;
        this.email = email;
        this.pass = pass;
        this.dob = dob;
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
        return "User{" + "Name=" + Name + ", nid_num=" + nid_num + ", phone_number=" + phone_number + ", ID=" + ID + ", email=" + email + ", pass=" + pass + ", dob=" + dob + '}';
    }

    

    

   
    
    
}
