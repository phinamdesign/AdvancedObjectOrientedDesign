public class Square implements Colorable {
    private double height;
    private double weight;

    public Square(){

    }

    public Square(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void   getAre(){
        System.out.println("Diện tích HCN = "+getHeight()*getWeight());
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
