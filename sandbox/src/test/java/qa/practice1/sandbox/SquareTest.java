package qa.practice1.sandbox;

public class SquareTest {

    public void testArea(){
        Square s = new Square(5);
        assert s.areas() == 25;
    }
}
