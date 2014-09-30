/**
 * Created by Ilya on 27.09.2014.
 */
public class Point3D extends Point {
    private int z;

    public Point3D() {

    }

    public Point3D(int x, int y, int z) {
        setX(x);
        setY(y);
        setZ(z);
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public double distance(Point3D p) {
        return Math.sqrt(Math.pow(p.getX() - this.getX(), 2) + Math.pow(p.getY() - this.getY(), 2) + Math.pow(p.getZ() - this.getZ(), 2));
    }

    public boolean oneLine(Point3D p1, Point3D p2) {
        int x1 = this.getX();
        int x2 = p1.getX();
        int x3 = p2.getX();
        int y1 = this.getY();
        int y2 = p1.getY();
        int y3 = p2.getY();
        int z1 = this.getZ();
        int z2 = p1.getZ();
        int z3 = p2.getZ();

        boolean first = (x3 - x1) * (y2 - y1) == (y3 - y1) * (x2 - x1) ? true : false;
        boolean second = (z3 - z1)*(y2 - y1) == (y3 - y1)*(z2 - z1) ? true : false;

        if(first & second)
            return  true;
        else return false;
    }
}
