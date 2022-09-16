public class PrintEx1 {
    public static void main(String[] args) {
        Ex1_tallyCounter x= new Ex1_tallyCounter();
        x.click();
        x.click();
        System.out.println("click: "+x.getValue());
        x.undo();
        x.undo();
        x.undo();
        System.out.println("click after undo: "+x.getValue());
        x.reset();
        System.out.println("after reset: "+x.getValue());
    }
}
