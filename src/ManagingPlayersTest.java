import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagingPlayersTest {

    @Test
    void createPlayer() {
        Players man = new Players(3, "ali", "cam", 23, 345.50);
        assertEquals(23, man.getAge());
    }


    @Test
    void updatePlayer() {
        Players man = new Players(3, "ali", "cam", 23, 345.50);
        assertEquals(3, man.getId());
    }
}