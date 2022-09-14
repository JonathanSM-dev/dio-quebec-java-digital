package java_sobrecarga;

public class CalculoArea {
    public static int area(int x){
        return x * x;
    }
    public static int area(int x, int y){
        return x*y;
    }
    public static int area(int x, int y, int z){
        return ((x+y)*z)/2;
    }
}
