/**
 * Created by Ilya on 26.09.2014.
 */
public class Program {
        public static void main(String[] args){
            Button b = new Button();
            b.setL(new OnClickListener() {
                @Override
                public void onClick() {
                    // анонимный класс
                }
            });
            b.onClick();
        }
    }
/*Point p1 = new Point(2,0);
            Point p2 = new Point(4,4);
            Point p3 = new Point(5,6);
            Point3D p1d = new Point3D(2, 2, 1);
            Point3D p2d = new Point3D(2, 3, 4);
            Point3D p3d = new Point3D(2, 1, -2);

            double result = p1.distance(p2);
            System.out.println(result);
            System.out.println(p1.oneLine(p2, p3));
            System.out.println(p1d.oneLine(p2d,  p3d));
            System.out.println(p1d.distance(p2d));
            Stack stack = new Stack();
            stack.push(2);
            stack.push(5);
            stack.push(7);

            */