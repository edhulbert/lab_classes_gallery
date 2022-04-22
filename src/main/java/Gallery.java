import java.util.ArrayList;
import java.util.List;

public class Gallery {

    private String name;
    private double till;
    private List<Artwork> artworks;

    public Gallery(String name, double till) {
        this.name = name;
        this.till = till;
        this.artworks = new ArrayList<Artwork>();
    }

    public String getName() {
        return this.name;
    }

    public double tillBalance() {
        return this.till;
    }

    public void addArtwork(Artwork artwork) {
        this.artworks.add(artwork);
    }

    public void sellArtwork(Artwork artwork) {
        this.till += artwork.getPrice();
    }
}
