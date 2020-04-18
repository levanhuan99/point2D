package Point2D;

public class Point2D {
    private float x;
    private float y;

    public Point2D(){
    }

    public Point2D(float x,float y){
        this.x=x;
        this.y=y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public float[] getXY(){
        float[] arr= {this.x,this.y};
        return arr;
    }
    public void setXY(float x,float y){
        setX(x);
        setY(y);
    }
    @Override
    public String toString(){
        return  "Point 2D is created with x and y are "+"("+getX()+","+getY()+")";
    }

//    public static void main(String[] args) {


}
class Point3D extends Point2D{
    private  float z;

    public Point3D(){
    }
    public Point3D(float x,float y,float z){
        super(x,y);
        this.z=z;
    }

//    public void setX(float x){
//        super.setX(x);
//    }
//
//    public void setY(float y){
//        super.setY(y);
//    }
//
//    public float getX(){
//        return super.getX();
//    }
//
//    public float getY(){
//        return super.getY();
//    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ(){
        float[] arr={getX(),getY(),getZ()};
        return arr;
    }
    public void setXYZ(float x,float y,float z){
       this.setX(x);
       this.setY(y);
       this.setZ(z);
    }
    @Override
    public String toString(){
        return "A Point3D  with x,y,z, are"+"("+getX()+","+getY()+","+getZ()+")";
    }


}
