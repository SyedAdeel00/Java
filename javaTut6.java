public class javaTut6 {
    public static void main(String[] args){
        System.out.println("The Methods of String");
        
        // Our Defined String
        String name = " Adeel ";
        System.out.println("This is our String: " + name);

        // Length
        int value = name.length();
        System.out.println("This is the length: "+ value);

        // To Lower Case
        String lstring = name.toLowerCase();
        System.out.println("To Lower Case " + lstring);

        // To Upper Case
        String ustring = name.toUpperCase();
        System.out.println("To Upper Case: " + ustring);

        // Trim the String
        System.out.println("This is trimmed:" + name.trim());



    }
}
