import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

public class FelineTest {

    @Test
    public void isFelineFamilyFeline(){
        Feline feline = new Feline();
        String expected = "Кошачьи";
        Assert.assertEquals("Семейство Feline называется Кошачьи", expected, feline.getFamily());
    }

    @Test
    public void countKittensNoArgs(){
        Feline feline = new Feline();
        int expected = 1;
        Assert.assertEquals("Если нет количества котят, то котёнок - один.", expected, feline.getKittens());
    }

    @Test
    public void countKittensWithArgs(){
        Feline feline = new Feline();
        int expected = 3;
        Assert.assertEquals("Если указано количество котят, то оно вернётся.",
                expected, feline.getKittens(expected));

    }


}
