package Framework;

public abstract class ShopFactory {
    public abstract PrimeAcc geAccoutNewPriment(int accNo, String accNm, float charges, boolean isPrime);

    public abstract NormalAcc getNewNormalAccount(int accNo, String accNm, float charges, float deliveryCharges);
}
