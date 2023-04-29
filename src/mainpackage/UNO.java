package mainpackage;


public final class UNO extends User implements TaxCalculation {

    @Override
    public void calculateTax() {
        System.out.println("hi");
    }
    
}
