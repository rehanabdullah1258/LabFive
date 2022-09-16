public class Ex4_Interest {
    private double balans;
    public Ex4_Interest(double initbalans) {
        balans = initbalans;
    }
    public void addInterest(double rate)
    {double x;
        x=balans/+rate;
        balans=balans+x;
    }
    public double getbalans() {
        return balans;
    }
}
