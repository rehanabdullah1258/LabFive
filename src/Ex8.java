public class Ex8 {
    private double balans;
    private double mo;
    public Ex8( double initbalans) {
        balans=initbalans;
    }
        public void debosit ( double x,int month){
            balans = balans + x;
           if ((month>5)&&(month<=12))
               balans=balans-1;
        }
        public void withedraw ( double x,int month) {
            balans = balans - x;
            if ((month > 5 )&& (month<= 12))
                balans = balans-1;

        }
        public double getbalans () {
            return balans;
        }
    }

