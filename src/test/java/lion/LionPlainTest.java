package lion;

import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class LionPlainTest {

    Feline feline;
    Lion lion;

    @Before
    public void setUp() throws Exception{
        feline = Mockito.mock(Feline.class);
        Mockito.when(feline.getKittens()).thenReturn(1);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        lion = new Lion("Самец", feline);
    }

    @Test
    public void getKittens() {
        int expected = 1;
        Assert.assertEquals("У льва один котенок", expected, lion.getKittens());
    }

    @Test
    public void unknownSexException() {
        String expectedMessage = "Используйте допустимые значения пола животного - самец или самка";
        Exception e = Assert.assertThrows(Exception.class, () -> new Lion("Небинарная персона", feline));
        Assert.assertEquals("Если пол льва не подходит, выдается общая ошибка с указанным текстом.",
                expectedMessage, e.getMessage());
    }

    @Test
    public void getFood() {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        try {
            Assert.assertEquals("У льва диета хищника.", expected, lion.getFood());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}