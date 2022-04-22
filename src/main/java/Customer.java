import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private double wallet;
    private List<Artwork> artworks;

    public Customer(String name, double wallet){
        this.name = name;
        this.wallet = wallet;
        this.artworks = new ArrayList<>();
    }

    public double getWallet(){
        return this.wallet;
    }

    public void buyArtwork(Artwork artwork) {
        if (this.wallet >= artwork.getPrice()) {
            this.wallet -= artwork.getPrice();
        }
    }

}
