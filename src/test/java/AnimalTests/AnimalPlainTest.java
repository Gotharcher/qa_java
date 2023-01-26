package AnimalTests;

import com.example.Animal;
import org.junit.Assert;
import org.junit.Test;

public class AnimalPlainTest {

    @Test
    public void getFamily() {
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        Animal animal = new Animal();
        Assert.assertEquals("Сравнение строки Семейств", animal.getFamily(), expected);
    }

    @Test
    public void unknownFoodException() {
        String expectedMessage = "Неизвестный вид животного, используйте значение Травоядное или Хищник";
        Animal animal = new Animal();
        Exception e = Assert.assertThrows(Exception.class, () -> animal.getFood("Всеядное"));
        Assert.assertEquals("Если вид диеты животного не подходит, выдается общая ошибка с указанным текстом.",
                e.getMessage(), expectedMessage);
    }
}
