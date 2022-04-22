import java.util.ArrayList;
import java.util.List;

public class Artist {

    private String name;
    private List<Artwork> artworks;

    public Artist(String name) {
        this.name = name;
        this.artworks = new ArrayList<Artwork>();
    }

    public String getName() {
        return this.name;
    }

    public List<Artwork> getArtworks() {
        return this.artworks;
    }

    public void addArtwork(Artwork artwork) {
        this.artworks.add(artwork);
    }


}
