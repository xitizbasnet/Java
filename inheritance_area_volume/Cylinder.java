package inheritance_area_volume;
public class Cylinder extends Circle {
    private double height=1.0;
    public Cylinder(){
    }
    public Cylinder(double height){
        this.height=height;
    }
    public Cylinder(double radius,double height){
        super(radius);
        this.height=height;
    }
    public Cylinder(double radius,double height,String color){
        super(radius,color);
        this.height=height;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height= height;
    }
    public double getVolume(){
        double volume=3.14*super.getRadius()*super.getRadius()*height;
        return volume;
    }
}