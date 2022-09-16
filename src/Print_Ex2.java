public class Print_Ex2 {
    public static void main(String[] args) {
        Ex2_limit x= new Ex2_limit();
        x.click();
        x.click();
        x.click();
        x.click();
        x.click();
        x.click();
        System.out.println("less limit 10: "+x.getValue());
        x.click();
        x.click();
        x.click();
        x.click();
        x.click();
        x.click();
        System.out.println("more limit 10: "+x.getValue());
    }
}
