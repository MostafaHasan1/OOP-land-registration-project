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
    protected String name,Id,Value,Loan;

    public BankMortgage(String name, String Id, String Amount, String Loan) {
        this.name = name;
        this.Id = Id;
        this.Value = Value;
        this.Loan = Loan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getAmount() {
        return Value;
    }

    public void setAmount(String Amount) {
        this.Value = Value;
    }

    public String getLoan() {
        return Loan;
    }

    public void setLoan(String Loan) {
        this.Loan = Loan;
    }

    
    
    
   
}
