public class Movie{
    //Class vairables and their default values
    private String title = "Jack and Jill";
    private String genre = "Action";
    private int realease_year = 2011;

    //This is a default constructor. Java creates them automatically if need be
    public Movie(){}

    //Constructor-method for setting the movie title and release year 
    public Movie(String name, int year){
        realease_year =year;
        title = name;
    }
    //Constructor method for setting the movie title only
    public Movie(String name){
        title = name;
        realease_year = 2011;
    }

    public static void main(String[] args){
        //Creating a new movie object with the default constructor
        Movie movie1 = new Movie("Jack and Jill 2");
        Movie movie2 = new Movie("Avengers", 2012);
        Movie movie3 = new Movie();
        System.out.println(movie1.title+ "("+ movie1.realease_year+")");
        System.out.println(movie2.title+ "("+ movie2.realease_year+")");
        System.out.println(movie3.title + "(" + movie3.realease_year+")");

       
    }
    //Getters and Setters  
}