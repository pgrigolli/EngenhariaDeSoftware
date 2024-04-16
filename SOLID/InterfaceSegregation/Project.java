package InterfaceSegregation;

public class Project {
    
}


interface TaxService{

    public double taxService(double amount);


}

 interface BrasilTaxService extends TaxService{

    public double brasilTaxService(double amount);


 }

 interface USATaxService extends TaxService{

    public double usaTaxService(double amount);
 }

interface MexicanTaxService extends TaxService{

   public double mexicanTaxService(double amount);

 }