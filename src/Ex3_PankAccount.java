public class Ex3_PankAccount {
    private double balans;
    public  Ex3_PankAccount() {
        balans = 0;
    }
    public Ex3_PankAccount(double initbalans) {
        balans = initbalans;
    }
    public void debosit(double x) {
        balans = balans + x;
    }
    public void withedraw(double x) {
        balans = balans - x;
    }

    public double getbalans() {
        return balans;
    }
}
