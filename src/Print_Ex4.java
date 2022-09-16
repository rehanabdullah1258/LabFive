public class Print_Ex4 {

    public static void main(String[] args) {
        Ex4_Interest momsSavings = new Ex4_Interest(1000);
        momsSavings.addInterest(10);
        System.out.println("the your account balance: "+momsSavings.getbalans());
    }
}
