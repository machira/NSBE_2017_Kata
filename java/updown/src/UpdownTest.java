import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class UpdownTest {
    Updown updown = new Updown();

    @Test
    public void shouldReturn1ForOneBracket() {
        assertThat(updown.count(">"), is(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionOnInvalidInput() {
        updown.count("not_a_bracket");
        updown.count("1");
        updown.count("!!!");
        updown.count("<!>");
        updown.count("<000>");
    }

    @Test
    public void shouldReturn_0_forBlankString() {
        assertThat(updown.count(""), is(0));
    }

    @Test
    public void shouldReturn_1_forSingleUpBracket() {
        assertThat(updown.count(">"), is(1));
    }

    @Test
    public void shouldReturn_0_forUpThenDown() {
        assertThat(updown.count("<>"), is(0));
    }

    @Test
    public void shouldReturnNegativeResults() {
        assertThat(updown.count("<"), is(-1));
    }

    @Test
    public void shouldReturn_1_forUpDownThenUp() {
        assertThat(updown.count("<>>"), is(1));
    }

    @Test
    public void shouldReturn_3_forUpUpUp() {
        assertThat(updown.count(">>>"), is(3));
    }
}
