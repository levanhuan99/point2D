package Point2D;

public class TestPoint {
    public static void main(String[] args) {
        Point2D point2D=new Point2D(3,4);
        System.out.println(point2D);
        System.out.println("--------------------");
        point2D.setXY(5,6);
        System.out.println(point2D);

        System.out.println("-------------------");
        Point3D point3D=new Point3D(2,4,6);
        System.out.println(point3D);
        point3D.setXYZ(7,8,9);
        System.out.println(point3D);

    }
}
