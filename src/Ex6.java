public class Ex6 {
    private double balanc;
    private double rate;
    public Ex6(double initbalans,double interestRate) {
        balanc = initbalans;
        rate =interestRate;
    }
    public void addinerest()
    {
       balanc=(balanc/+rate)+balanc;
    }
    public void debosit(double x) {
        balanc = balanc + x;
    }
    public double getbalans() {
        return balanc;
    }

}
