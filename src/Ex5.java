public class Ex5 {
   private double balans;
   public Ex5()
   {balans=0;}
    public Ex5(double initbalans) {
        balans = initbalans;
    }
    public void debosit(double x) {
        balans = balans + x;
    }
    public void withedraw(double x) {
        balans = balans - x;
    }
    public void mystery(Ex5 that ,double amount)
    {
        this.balans=this.balans-amount;
        that.balans=that.balans+amount;
    }
    public double getbalans() {
        return balans;
    }
}
