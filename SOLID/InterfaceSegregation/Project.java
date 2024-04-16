package InterfaceSegregation;

public class Project {
    
}


interface TaxService{

    public double taxService(double amount);
    public double brazilTaxService(double amount); // Only for brazilian people
    public double usaTaxService(double amount); // Only for american people
    public double mexicanTaxService(double amount); // Only for mexican people


}

