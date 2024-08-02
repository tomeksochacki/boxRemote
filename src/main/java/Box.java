public class Box {
    double width;
    double height;
    double depth;

    public Box(){
        width = -1;
        height = -1;
        depth = -1;
    }

    public Box(double len){
        width = height = depth = len;
    }

    public Box(double w, double h, double d) {
        this.width = w;
        this.height = h;
        this.depth = d;
    }

    public void volume(){
        System.out.println(width * height * depth);
    }

    public double countVolume(){
        return width * height * depth;
    }

    public void setDim(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
}
