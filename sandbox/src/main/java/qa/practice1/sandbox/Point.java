package qa.practice1.sandbox;

    public class Point {

      public double x;
      public double y;

      public Point(double x, double y)
      {
        this.x = x;
        this.y = y;
      }
      public double distance(Point p1, Point p2)
      {
      double d = Math.sqrt(Math.pow(p1.x - p2.x, 2.0) + Math.pow(p1.y - p2.y, 2.0));
      return d;
      }
      
        }
        public void main(String[] args)
        {

        Point d = new Point(3.0, 4.0);
        System.out.println("Distance between points "  + d.x + "and " + d.y + "=" + d.distance());

        }
        }