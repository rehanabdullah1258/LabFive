public class Ex7_timeDepositAccount {
    private double balanc;
    private double rate;
    public Ex7_timeDepositAccount(double initbalans,double interestRate) {
        balanc = initbalans;
        rate =interestRate;
    }
    public void getRate()
    {
        balanc=(balanc/+rate)+balanc;
    }
    public double getbalans() {
        return balanc;
    }
    public void withedraw() {
        balanc =0;
    }

}
