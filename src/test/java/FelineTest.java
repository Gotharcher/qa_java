import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

public class FelineTest {

    @Test
    public void isFelineFamilyFeline(){
        Feline feline = new Feline();
        String expected = "Кошачьи";
        Assert.assertEquals("Семейство Feline называется Кошачьи", feline.getFamily(), expected);
    }

    @Test
    public void countKittensNoArgs(){
        Feline feline = new Feline();
        int expected = 1;
        Assert.assertEquals("Если нет количества котят, то котёнок - один.", feline.getKittens(), expected);
    }

    @Test
    public void countKittensWithArgs(){
        Feline feline = new Feline();
        int expected = 3;
        Assert.assertEquals("Если есть количество котят, то оно вернётся.", feline.getKittens(expected), expected);

    }


}
