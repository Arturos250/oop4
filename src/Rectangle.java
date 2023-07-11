public class Rectangle implements GeometricShape{
    private int height;
    private int weight;

    public Rectangle(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void calculateArea() {
        System.out.println(weight * height);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println(2 * (getWeight() + getHeight()));
    }
}
