public class Runner {
    public static void main(String[] args){
        Car myCar = new Car(2018, "BMW", 0, "i8");
        System.out.println(myCar.toString());
        myCar.drive(1000);
        System.out.println(myCar.toString());
        Rectangle myRectangle = new Rectangle(12, 12);
        System.out.println(myRectangle.getArea());
        System.out.println(myRectangle.getDiagonal());
        System.out.println(myRectangle.isSquare());
    }
}
