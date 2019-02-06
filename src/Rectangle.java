public class Rectangle {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getArea(){
        double area = this.length * this.width;
        return "Area: " + area;
    }

    public String getDiagonal(){
        double diagonal = java.lang.Math.sqrt(this.length * this.length + this.width * this.width);
        return "Diagonal: "+ diagonal;
    }

    public String isSquare(){
        if(this.length == this.width){
            return "This is a square.";
        } else {
            return "This is not a square.";
        }
    }
}
