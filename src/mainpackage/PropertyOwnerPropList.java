/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;

/**
 *
 * @author Hasan
 */
public class PropertyOwnerPropList {
        String caseID;// = "1";
        String clintName;// = "hasan";
        //String caseType;// = "OwnerTransfer";
        //String caseDetails;// = "My name is hasan and I want to add a new Owner";

    public PropertyOwnerPropList(String id,String name  ) {
        this.caseID = id;
        this.clintName = name;
       
    }

    public String getCaseID() {
        return caseID;
    }

    public void setCaseID(String caseID) {
        this.caseID = caseID;
    }

    public String getClintName() {
        return clintName;
    }

    public void setClintName(String clintName) {
        this.clintName = clintName;
    }

    

    @Override
    public String toString() {
        return "PropertyOwnerPropList{" + "caseID=" + caseID + ", clintName=" + clintName + ", caseType=";
    }
    
        
}
