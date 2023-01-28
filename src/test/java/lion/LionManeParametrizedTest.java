package lion;

import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

@RunWith(Parameterized.class)
public class LionManeParametrizedTest {

    private final String sex;
    private final Boolean expected;

    public LionManeParametrizedTest(String sex, Boolean expected) {
        this.sex = sex;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] shouldHaveMane() {
        return new Object[][]{{"Самец", Boolean.TRUE}, {"Самка", Boolean.FALSE},};
    }

    @Test
    public void doesHaveMane() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        Lion lion = new Lion(sex, feline);
        Assert.assertEquals("У самца есть грива, у самки - нет.", expected, lion.doesHaveMane());
    }
}
