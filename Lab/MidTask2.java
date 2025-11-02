public class MidTask2 {
    public static void main (String[]args) {

        //1.A system stores customers first and last name separately combine them into single fomatted full name.
       
        String firstName = "Abdur" ;
        String lastName = "Rahaman" ;
        String fullName = firstName + " " + lastName ;
        System.out.println ("Full Name: " + fullName);

        //2.Generate a product code by joining the product name and ID.

        String product = "Acer" ;
        int code = 2025 ;
        String productCode = "Product-Code: " + product + "-" + code ;
        System.out.println (productCode) ;

        //3.Extract the user name (before @) from an email address.

        String email = "abdurrahaman23@gmail.com";
        String substring = email.substring (0,12);
        System.out.println("Username: " +substring);
    }
}