package Point2D;

public class Test {
    public static void main(String[] args) {
        Point2D point2D=new Point2D(2,3);
        System.out.println(point2D);
        System.out.println("----------");
        Point3D point3D=new Point3D(4,5,6);
        System.out.println(point3D);

        System.out.println("------------");
        point2D.setXY(10,20);
        System.out.println(point2D);
    }

}
