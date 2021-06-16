public class Rectangle  implements Resizeable{
    double width;
    double length;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double Area(){
        return getLength()*getWidth();
    }

    @Override
    public void resize() {
        this.setWidth(100*Math.random()+getWidth());
        this.setLength(100*Math.random()+getLength());
    }

    @Override
    public void resize(double percent) {
        this.setWidth(percent*getWidth()/100+ getWidth());
        this.setLength(percent*getLength()/100 + getLength());
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", AreA= " + Area() +
                '}';
    }
}
