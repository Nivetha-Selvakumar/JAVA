class Overload3 {
    double figure(double l, int b) //two parameters with double type
    {
        return (l*b);
    }
    float figure(int s) //one parameter with float return type
    {
        return (s*s);
    }

    public static void main(String[] args) {
        Overload3 obj = new Overload3();
        System.out.println("Area of Rectangle: " +obj.figure(5.55, 6));
        System.out.println("Area of Square: " +obj.figure(3));
    }
}