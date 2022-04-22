import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArtworkTest {

    Artwork artwork;

    @BeforeEach
    public void setup() {
        artwork = new Artwork("Starry Night", "Van Gogh", 20, "e74r");
    }

    @Test
    public void canGetTitle() {
        assertThat(artwork.getTitle()).isEqualTo("Starry Night");
    }

    @Test
    public void canGetArtistName() {
        assertThat(artwork.getArtistName()).isEqualTo("Van Gogh");
    }

    @Test
    public void canGetPrice() {
        assertThat(artwork.getPrice()).isEqualTo(20);
    }

    @Test
    public void canGetNft() {
        assertThat(artwork.getNft()).isEqualTo("e74r");
    }

}
