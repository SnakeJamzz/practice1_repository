package qa.practice1.sandbox;

public class Practice1 {

	public static void main(String[] args) {
	  giant("TURTLE");
    giant("ANT");
    giant("HAMSTER");


    Square s = new Square(6);
    System.out.println("powierzchnia kwadratu o boku " + s.l + " = " + s.areas());

    Rectangle r = new Rectangle(6,4);
    System.out.println("powierzchnia prostokąta a bokach " + r.a + " i " + r.b + " = " + r.areas());
  }

  public static void giant(String animal){
	  System.out.println("Giant " + animal + "!");

  }


}

