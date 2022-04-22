import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//import static org.assertj.core.api.AssertionsForClassTypes.assertArrayEquals;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtistTest {

    Artist artist;
    Artwork starryNight;
    Artwork sunflowers;

    @BeforeEach
    public void setup() {
        artist = new Artist("Van Gogh");
        starryNight = new Artwork("Starry Night", "Van Gogh", 20, "e74r");
        sunflowers = new Artwork("Sunflowers", "Van Gogh", 10, "fn22");
        artist.addArtwork(starryNight);
        artist.addArtwork(sunflowers);
    }

    @Test
    public void artistCanGetName() {
        assertThat(artist.getName()).isEqualTo("Van Gogh");
    }

    @Test
    public void canAddArtworkToArtist() {
        assertThat(artist.getArtworks().size()).isEqualTo(2);
    }

    @Test
    public void canGetArtistArtworks() {
        assertThat(artist.getArtworks().toString()).isEqualTo("[\"Starry Night\", \"Sunflowers\"]");

    }

}
