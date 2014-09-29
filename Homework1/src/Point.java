/**
 * Created by Ilya on 26.09.2014.
 */
public class Point {
    private int x;
    private int y;

    public Point(){

    }

    public Point(int x, int y){
        setX(x);
        setY(y);
    }

    public void setX(int x) {
        if((x>0)&&(x<400)){
            this.x = x;
        }
        else throw new IllegalArgumentException("Диапазон числа [0 - 400]");
    }

    public void setY(int y) {
        if((y>=0)&&(y<=400)){
            this.y = y;
        }
        else throw new IllegalArgumentException("Диапазон числа [0 - 400]");
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean oneLine(Point p1, Point p2){
        return 0.5 * ((this.getX() - p2.getX())*(p1.getY() - p2.getY()) - (p1.getX() - p2.getX())*(this.getY() - p2.getY())) == 0 ? true : false;
    }
    public double distance(Point p){
        return Math.sqrt(Math.pow(p.getX() - this.getX(), 2) + Math.pow(p.getY() - this.getY(), 2));
    }

}
