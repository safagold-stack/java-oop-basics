public class Circle {

    public double radius;

    public double area(){
        double a = Math.PI * radius * radius;
        return a;
    }

    public String toString(){
        return "Area is = " + area();
    }




}
