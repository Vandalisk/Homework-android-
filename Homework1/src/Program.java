/**
 * Created by Ilya on 26.09.2014.
 */
public class Program {
        public static void main(String[] args){
            Point p1 = new Point(14,29);
            Point p2 = new Point(22,43);
            Point p3 = new Point(22,0);
            double result = p1.distance(p2);
            System.out.println(result);
            System.out.println(p1.oneLine(p2,p3));
        }
    }
