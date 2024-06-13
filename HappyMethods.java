public class HappyMethods{
    private int x=10, y=20;

    //A static method can't use our class variables
    static void myStaticMethod(){
        System.out.println("Static methods can't use class variables");
        // System.out.println("x = " + x);

        //The line above would return an error
    }

    //Public methods can be accessed from anywhere

    public void myPublicMethod(){
        System.out.println("Public methods can be accessed from anywhere");
        System.out.println(x + " + " + y + " = " + (x+y));
    }



    //Our main method
    public static void main(String[] args){
        myStaticMethod();// Call the static method
        HappyMethods myObj = new HappyMethods(); //create an object of the class
        myObj.myPublicMethod(); //call the object's public method
    }
}