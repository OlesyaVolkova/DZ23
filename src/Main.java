public class Main {
    public static void main(String[] args) {

        int a;                  //Объявление переменной 'a' типа 'int'
        Point A = new Point();  //Объявление переменной 'A' типа 'Point'
        A.setX(2);     //Создание объекта (экземпляра) 'A' класса 'Point'
        A.setY(3);

        Point B = new Point();
        B.setX(5);
        B.setY(7);

        System.out.println("Расстояние до указанной точки = " + A.distance(B) );
        System.out.println("Расстояние между двумя точками = " + Point.distance(A, B) );
    }
}

class Point
{
    private double x;
    private double y;

    public double getX()
    {
        return x;
    }
    public double getY()
    {
        return y;
    }
    public void setX(double x)
    {
        this.x=x;
    }
    public void setY(double y)
    {
        this.y=y;
    }

    public double distance(Point other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public static double distance(Point a, Point b) {
        double dx = a.x - b.x;
        double dy = a.y - b.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}