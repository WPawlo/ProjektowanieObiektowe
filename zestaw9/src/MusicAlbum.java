import java.util.ArrayList;
import java.util.Objects;

public class MusicAlbum {
    private String title;
    private String artist;
    private ArrayList<Double> ratings;

    public MusicAlbum(String title, String artist){
        this.title = title;
        this. artist = artist;
        this.ratings = new ArrayList<>();
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist){
        this.artist = artist;
    }
    public ArrayList<Double> getRatings() {
        return new ArrayList<>(ratings);
    }
    public void addRatings(double rating){
        ratings.add(rating);
    }
    public void removeRatings(double rating){
        ratings.remove(rating);
    }

    @Override
    public String toString(){
        return "MusicAlbum{" +
                "title='" + title + '\'' +
                ", artist =" + artist + '\'' +
                ", ratings=" + ratings + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MusicAlbum that = (MusicAlbum) o;
        return Objects.equals(title, that.title) &&
                Objects.equals(artist, that.artist) &&
                Objects.equals(ratings, that.ratings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, artist, ratings);
    }
}
