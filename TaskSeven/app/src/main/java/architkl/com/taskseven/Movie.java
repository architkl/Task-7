package architkl.com.taskseven;

/**
 * Created by archit-pc on 7/1/18.
 */

public class Movie {
    private String title ,genre;

    public Movie (){
    }

    public Movie(String title, String genre){
        this.title = title;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }
}