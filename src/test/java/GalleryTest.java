import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {

    Gallery gallery;
    Artwork starryNight;

    @BeforeEach
    public void setup() {
        gallery = new Gallery("Tate", 50);
        starryNight = new Artwork("Starry Night", "Van Gogh", 20, "e74r");
        gallery.addArtwork(starryNight);
    }

    @Test
    public void balanceIncreasesOnSaleOfStarryNight() {
        gallery.sellArtwork(starryNight);
        assertThat(gallery.tillBalance()).isEqualTo(70);
    }

}
