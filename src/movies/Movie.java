package movies;

public class Movie {

    private String name;
    private String category;

    public Movie(String name, String category){
        this.name = name;
        this.category = category;

    }

    public void setMovie(String name, String category){
        this.name = name;
        this.category = category;
    }

    public String[] getMovie(){
        String[] movie = {this.name, this.category};
        return movie;
    }

    public static void main(String[] args){
//        Movie superTroopers = new Movie("Super Troopers", "comedy");
//        System.out.println(superTroopers.getMovie());
//        superTroopers.setMovie("Super Troopers 1", "slapstick comedy");
//        System.out.println(superTroopers.getMovie());

    }
}
