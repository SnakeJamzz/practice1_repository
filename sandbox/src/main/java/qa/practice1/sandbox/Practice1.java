package qa.practice1.sandbox;

public class Practice1 {

    public static void main(String[] args) {

    Point first = new Point(0.0, 0.0);
    Point second = new Point(1.0, 1.0);
    System.out.println(distance(first, second));
    System.out.println(first.distance(second));

  }

  public static double distance( Point p1, Point p2){
    return Math.sqrt(Math.pow(p2.getX() - p1.getX(),2.0) + Math.pow(p2.getX() - p1.getY(),2.0));

  }
}











