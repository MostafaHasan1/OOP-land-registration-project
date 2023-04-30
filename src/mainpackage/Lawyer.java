package mainpackage;

import java.io.Serializable;
import java.time.LocalDate;


public final class Lawyer extends User implements Serializable {
    /* protected String Name;
    protected int nid_num;
    protected String phone_number;
    protected int ID;
    protected String email;
    protected String pass; */
    protected LocalDate doj;
    protected String courtName;

    public Lawyer(LocalDate doj, String courtName) {
        this.doj = doj;
        this.courtName = courtName;
    }
    //lowyer login data
    public Lawyer(String ID, String pass ){
        this.ID = ID;
        this.pass = pass;
    }
    
    public Lawyer(LocalDate doj, String courtName, String Name, int nid_num, String phone_number, String ID, String email, String pass, LocalDate dob) {
        super(Name, nid_num, phone_number, ID, email, pass, dob);
        this.doj = doj;
        this.courtName = courtName;
    }

    public LocalDate getDoj() {
        return doj;
    }

    public void setDoj(LocalDate doj) {
        this.doj = doj;
    }

    public String getCourtName() {
        return courtName;
    }

    public void setCourtName(String courtName) {
        this.courtName = courtName;
    }

    @Override
    public String toString() {
        return "Lawyer{" + "doj=" + doj + ", courtName=" + courtName + '}';
    }
    
    public void display(){
        System.out.println("Id="+ID +", Passowrd="+pass);
    }

    
    
    
}
