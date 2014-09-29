/**
 * Created by Ilya on 27.09.2014.
 */
public class Point3D extends Point {
    private int x3;
    private int y3;

    public int getX3() {
        return x3;
    }

    public int getY3() {
        return y3;
    }

    public void setX3(int x3) {
        this.x3 = x3;
    }

    public void setY3(int y3) {
        this.y3 = y3;
    }
    @Override
    public double distance(Point3D p){
        return 0;
    }
}
