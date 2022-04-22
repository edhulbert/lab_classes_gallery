import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {
    Gallery gallery;
    Artwork starryNight;
    Artwork monaLisa;
    Customer customer;

    @BeforeEach
    public void setup() {
        customer = new Customer("Jo", 100);
        starryNight = new Artwork("Starry Night", "Van Gogh", 20, "e74r");
        monaLisa = new Artwork("Mona Lisa", "da Vinvi", 150, "asd2");
        gallery = new Gallery("Tate", 50);

        gallery.addArtwork(starryNight);
        gallery.addArtwork(monaLisa);
    }

    @Test
    public void canGetWalletBalanceBeforeSale() {
        assertThat(customer.getWallet()).isEqualTo(100);
    }

    @Test
    public void canBuyArtwork() {
        customer.buyArtwork(starryNight);
        assertThat(customer.getWallet()).isEqualTo(80);
    }

    @Test
    public void buyMonaLisaNotAllowed() {
        customer.buyArtwork(monaLisa);
        assertThat(customer.getWallet()).isEqualTo(100);
    }
}
