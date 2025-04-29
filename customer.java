package Customer;

import Framework.NormalAcc;
import Framework.PrimeAcc;
import Framework.ShopFactory;

import Application.GSNormalAcc;
import Application.GSPrimeAcc;
import Application.GSShopFactory;

public class customer {
    public static void main(String[] args) {
        ShopFactory sf = new GSShopFactory();

        System.out.println("Prime Account");
        PrimeAcc pa = new GSPrimeAcc(3, "Rutuja", 500, true);
        pa.bookProduct(pa.getCharges());
        pa.toString();
        
        System.out.println("non Prime Account");
        PrimeAcc pa1 = new GSPrimeAcc(4, "Nilam", 350, false);
        pa1.bookProduct(pa1.getCharges());
        pa1.toString();
        

        NormalAcc na = new GSNormalAcc(5, "Zoya", 250, 25);
        na.bookProduct(na.getdeliveryCharges());
        na.toString();

    }
}
