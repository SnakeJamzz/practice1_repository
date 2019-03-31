package qa.practice1.sandbox;

    public class Point {

      public double x;
      public double y;

      public Point(double x, double y) {
        this.x = x;
        this.y = y;
      }
      public double getX(){
        return x;
      }
      public double getY(){
        return y;
      }
      public void setX(double x){
        this.x = x;
      }
      public void setY(double y){
        this.y = y;
      }

      public double distance(Point p2) {

        return Math.sqrt(Math.pow(p2.getX() - this.getX(), 2.0) + Math.pow(p2.getY() - this.getY(), 2.0));
      }


        }