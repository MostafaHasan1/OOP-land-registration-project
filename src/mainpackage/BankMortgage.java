package mainpackage;


import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author akash
 */
public class BankMortgage implements Serializable{
    protected String name,ID,Value,Loan;

    public BankMortgage(String name, String ID, String Value, String Loan) {
        this.name = name;
        this.ID = ID;
        this.Value = Value;
        this.Loan = Loan;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getValue() {
        return Value;
    }

    public void setValue(String Value) {
        this.Value = Value;
    }

    public String getLoan() {
        return Loan;
    }

    public void setLoan(String Loan) {
        this.Loan = Loan;
    }

    @Override
    public String toString() {
        return "BankMortgage{" + "name=" + name + ", ID=" + ID + ", Value=" + Value + ", Loan=" + Loan + '}';
    }
    
}
