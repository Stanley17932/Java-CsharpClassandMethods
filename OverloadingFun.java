public class OverloadingFun {
    //method for returning a middle-initial as a interger

    static int MakeName(int Middle){
        return Middle;
    }

    // Method for combining first and last name
    static String MakeName(String first, String mid, String last){
        return first + mid + last;
    }

    public static void main(String[] args){

        //define an integer using our first method
        int integer_initial = MakeName(52);
        char middle_initial = (char)integer_initial;

        //Convert character type into String
        String mid = String.valueOf(middle_initial);

        String full_name = MakeName("John", mid, "Doe");
   
        System.out.println("Full name:" +full_name);
    }   
}