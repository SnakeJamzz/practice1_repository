package qa.practice1.sandbox;

public class Practice1 {

  public static double distance(Point p1, Point p2) {
    return Math.sqrt(Math.pow(p1.x - p2.x, 2.0) + Math.pow(p1.y - p2.y, 2.0));

  }

  public static void main(String[] args) {
                                                                                                         /*giant("TURTLE");
                                                                                                        giant("ANT");
                                                                                                        giant("HAMSTER");*/
    Point p1 = new Point(0.5, 0.9);
    Point p2 = new Point(3.0, 4.0);

    System.out.println(p1.distance(p2));


  }
}


                                                                                                       /* Square s = new Square(6);
                                                                                                          System.out.println("powierzchnia kwadratu o boku " + s.l + " = " + s.areas());

                                                                                                          Rectangle r = new Rectangle(6,4);
                                                                                                          System.out.println("powierzchnia prostokąta a bokach " + r.a + " i " + r.b + " = " + r.areas());*/





                                                                                                              /*public static void giant(String animal){
                                                                                                                System.out.println("Giant " + animal + "!");*/









