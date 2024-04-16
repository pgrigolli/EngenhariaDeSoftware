package InterfaceSegregation;

public class Project {
    
}


interface TaxService{

    public double taxService(double amount);


}

 class BrasilTaxService implements TaxService{

    public double taxService(double amount) {

        if((amount - 20) * 0.3 < 0) return 0; // Just an example, no real tax services calculations here!

        else return (amount - 20) * 0.3;

    }


 }

 class USATaxService implements TaxService{


    public double taxService(double amount){

        if((amount - 15) * 0.45 < 0) return 0; // Just an example, no real tax services calculations here!

        else return (amount - 15) * 0.45;


    }


 }

 class MexicanTaxService implements TaxService{


    public double taxService(double amount){

        if ((amount - 12) * 0.2 < 0) return 0; // Just an example, no real tax services calculations here!

        else return (amount - 12) * 0.2;
    }
 }