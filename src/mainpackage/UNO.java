package mainpackage;

import java.io.Serializable;
import java.time.LocalDate;


public final class UNO extends User implements TaxCalculation, Serializable {
    /* protected String Name;
    protected int nid_num;
    protected String phone_number;
    protected int ID;
    protected String email;
    protected String pass; */
    protected String upazila;
    protected LocalDate doj;

    public UNO(String upazila, LocalDate doj) {
        this.upazila = upazila;
        this.doj = doj;
    }
    // UNO parameter to use for loginData
    public UNO(String ID, String pass){
        this.ID = ID;
        this.pass = pass;
        
    }

    public UNO(String upazila, LocalDate doj, String Name, int nid_num, String phone_number, String ID, String email, String pass, LocalDate dob) {
        super(Name, nid_num, phone_number, ID, email, pass, dob);
        this.upazila = upazila;
        this.doj = doj;
    }

    public String getUpazila() {
        return upazila;
    }

    public void setUpazila(String upazila) {
        this.upazila = upazila;
    }

    public LocalDate getDoj() {
        return doj;
    }

    public void setDoj(LocalDate doj) {
        this.doj = doj;
    }

    @Override
    public String toString() {
        return "UNO{" + "upazila=" + upazila + ", doj=" + doj + '}';
    }
    
    
    
    
    @Override
    public void calculateTax() {
        System.out.println("hi");
    }
    
}
