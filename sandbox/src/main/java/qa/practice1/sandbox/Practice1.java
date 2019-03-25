package qa.practice1.sandbox;

public class Practice1 {

	public static void main(String[] args) {
	  giant("TURTLE");
    giant("ANT");
    giant("HAMSTER");

    double l = 6;
    System.out.println("powierzchnia kwadratu o boku " + l + " = " + areas(l));

    double a = 4;
    double b = 6;
    System.out.println("powierzchnia prostokąta a bokach " + a + " i " + b + " = " + areas(a, b));
}

public static void giant(String animal){
	  System.out.println("Giant " + animal + "!");

}
public static double areas(double len){
    return len * len;

}

public static double areas(double a, double b){
	  return a * b;
}

}