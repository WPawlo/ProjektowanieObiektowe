import java.util.Objects;

 class RockAlbum extends MusicAlbum {
    private String rockGenre;

    public RockAlbum(String title, String artist, String rockGenre){
        super(title, artist);
        this.rockGenre = rockGenre;
    }

    public String getRockGenre() {
        return rockGenre;
    }
    public void setRockGenre(String rockGenre) {
        this.rockGenre = rockGenre;
    }

    @Override
    public String toString() {
        return "RockAlbum{" +
                "title='" + getTitle() + '\'' +
                ", artist='" + getArtist() +'\'' +
                ", rockGenre='" +getRockGenre() +'\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        RockAlbum rockAlbum = (RockAlbum) o;
        return Objects.equals(rockGenre, rockAlbum.rockGenre);
    }

    @Override
     public int hashCode() {
        return Objects.hash(super.hashCode(), rockGenre);
    }
}
