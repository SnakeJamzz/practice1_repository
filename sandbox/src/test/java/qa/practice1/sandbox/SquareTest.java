package qa.practice1.sandbox;
import org.testng.annotations.Test;

public class SquareTest{

    @Test
    public void testAreas(){
        Square s = new Square(5);
        assert s.areas() == 25;
    }
}
