package Application;

import Framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc {

    public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
        super(accNo, accNm, charges, isPrime);
    }

    public void bookProduct(float charges) {
        if(isPrime()) {
            System.out.println("Price of Book Product is: " + charges);
            System.out.println("\nDelivery charges of Book Product is: " + getdeliveryCharges());
            System.out.println("\nTotal Amount : "+(charges + getdeliveryCharges()));
        }else{
            System.out.println("\nPrice of Book Product is: " + charges);
            System.out.println("\nDelivery charges of Book Product is: " + 50.0);
            System.out.println("\nTotal Amount : "+(charges + 50.0));
        }
    }

//    @Override 
    public String toString() {
        return "GSPrimeAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
                + hashCode() + "]";
    }
}
