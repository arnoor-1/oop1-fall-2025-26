public class Task4 {
    public static void main(String[]args){
        int x = 10;
        int y = 15;
        System.out.println("Befor swap x: " + x + " y: " +y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After the sawp value of x: " + x +  " y: " +y);
    }
}
