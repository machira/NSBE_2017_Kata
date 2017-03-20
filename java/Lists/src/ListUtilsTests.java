import org.junit.Before;
import org.junit.Test;

import java.util.Collections;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;

public class ListUtilsTests {
    ListUtils listUtils;

    @Before
    public void setup() {
        listUtils = new ListUtils();
    }

    @Test
    public void test_largest() {
        assertThat(listUtils.largest(asList(1, 2, 3)), is(3));
        assertThat(listUtils.largest(Collections.EMPTY_LIST), is(nullValue()));
        assertThat(listUtils.largest(asList(-5, -3, -6)), is(-3));
    }

    @Test
    public void test_reverse() {
        assertThat(listUtils.reverse(asList(1, 2, 3)), is(asList(3, 2, 1)));
    }

    @Test
    public void test_all_odd() {
        assertThat(listUtils.only_odd(Collections.<Integer>emptyList()), is(Collections.<Integer>emptyList()));
        assertThat(listUtils.only_odd(asList(1, 2, 3)), is(asList(1, 3)));
    }

    @Test
    public void test_total() {
        assertThat(listUtils.total(Collections.emptyList()), is(0));
        assertThat(listUtils.total(asList(1, 2, 3)), is(6));
    }


}
