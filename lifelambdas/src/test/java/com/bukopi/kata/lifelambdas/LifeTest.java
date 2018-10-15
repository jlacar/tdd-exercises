import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;
import static org.assertj.core.api.Assertions.*;

public class LifeTest {

    @Test
    public void should_be_able_to_set_live_cell() throws Exception {
        Life game = new Life();

        game.setAlive(1, 1);
        assertThat(game.isAlive(1, 1))
                isTrue();
    }
}
