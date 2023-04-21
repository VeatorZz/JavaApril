public class asdsd {

    public class Shape {
        public double area() {
            return 0;
        }
        public Shape() {
            super();
        }
    }

}


public class Rect extends Shape {
    private double w;//宽
    private double h;//高
    public Rect() {
        super();
    }
    public Rect(double w, double h) {
        super();
        this.w = w;
        this.h = h;
    }
    public double getW() {
        return w;
    }
    public void setW(double w) {
        this.w = w;
    }
    public double getH() {
        return h;
    }
    public void setH(double h) {
        this.h = h;
    }

    @Override
    public double area() {
        return w * h;
    }
}
public class Triangle extends Shape {

    private double w;//宽
    private double h;//高


    @Override
    public double area() {

        return (w * h) / 2;
    }


    public double getW() {
        return w;
    }


    public void setW(double w) {
        this.w = w;
    }


    public double getH() {
        return h;
    }


    public void setH(double h) {
        this.h = h;
    }


    public Triangle(double w, double h) {
        super();
        this.w = w;
        this.h = h;
    }


    public Triangle() {
        super();
    }
}
public class Triangle extends Shape {

    private double w;
    private double h;


    @Override
    public double area() {

        return (w * h) / 2;
    }


    public double getW() {
        return w;
    }


    public void setW(double w) {
        this.w = w;
    }


    public double getH() {
        return h;
    }


    public void setH(double h) {
        this.h = h;
    }


    public Triangle(double w, double h) {
        super();
        this.w = w;
        this.h = h;
    }


    public Triangle() {
        super();
    }

}
public class Application {

    public static void main(String[] args) {

        Computer com = new Computer();

        Rect r1 = new Rect(3,5);
        Rect r2 = new Rect(3,4);

        double totalArea1 = com.sumArea(r1, r2);
        System.out.println("矩形面积为" + totalArea1);

        //创建两个三角形
        Triangle t1 = new Triangle(3,5);
        Triangle t2 = new Triangle(3,4);

        //计算三角形面积
        double totalArea2 = com.sumArea(t1, t2);
        System.out.println("三角面积为" + totalArea2);

        Circle c1 = new Circle(2);
        Circle c2 = new Circle(1);

    }

}

}
