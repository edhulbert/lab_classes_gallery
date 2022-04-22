public class Artwork {

    private String title;
    private String artistName;
    private double price;
    private String nft;

    public Artwork(String title, String artistName, double price, String nft) {
        this.title = title;
        this.artistName = artistName;
        this.price = price;
        this.nft = nft;
    }

    public String getTitle() {
        return this.title;
    }

    public String getArtistName() {
        return this.artistName;
    }

    public double getPrice() {
        return this.price;
    }

    public String getNft() {
        return this.nft;
    }

    @Override
    public String toString() {
        return '"' + title + '"';
    }
}
