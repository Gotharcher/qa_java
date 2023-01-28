import com.example.AlexLion;
import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.*;

public class AlexLionTest {

    AlexLion alex;

    @Before
    public void setUp() throws Exception{
        Feline feline = Mockito.mock(Feline.class);
        alex = new AlexLion(feline);
    }

    @Test
    public void getFriends() {
        List<String> expected = List.of("Марти", "Глория", "Мелман");
        Assert.assertEquals("Список друзей льва Алекса корректный", expected, alex.getFriends());
    }

    @Test
    public void getPlaceOfLiving() {
        String expected = "Нью-Йоркский зоопарк";
        Assert.assertEquals("Алекс живёт в зоопарке Нью-Йорка", expected, alex.getPlaceOfLiving());
    }
}