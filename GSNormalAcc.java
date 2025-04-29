package Application;

import Framework.NormalAcc;

public class GSNormalAcc extends NormalAcc {
    public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
        super(accNo, accNm, charges, deliveryCharges);
    }

    public void bookProduct(float deliveryCharges) {
        System.out.println("Price of Book Product is: " + getCharges());
        System.out.println("Delivery charges of Book Product is: " + deliveryCharges);
        System.out.println("Total Amount : "+ (getCharges() + deliveryCharges));
    }

    @Override
    //it provide more details reprensentation of object including inherites nd newly behaviour
    public String toString() {
        return "GSNormalAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
                + hashCode() + "]";
    }

}
