import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

public class CatTest {
    Cat cat;

    @Before
    public void setUp() throws Exception{
        Feline feline = Mockito.mock(Feline.class);
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        cat = new Cat(feline);
    }

    @Test
    public void catSaysMeow() {
        String expected = "Мяу";
        Assert.assertEquals("Кошка говорит 'Мяу'", expected, cat.getSound());
    }

    @Test
    public void catDietCheck() throws Exception{
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
            Assert.assertEquals("Кошка ест рацион хищника.", expected, cat.getFood());
    }
}