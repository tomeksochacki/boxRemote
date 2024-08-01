import com.google.gson.Gson;

public class Main {
    public static void main(String[] args){
        Box myBox = new Box(3.2, 3.0,3.0 );
        //Box myBox3 = myBox;
        Box myBox2 = new Box(30.2, 30.0,30.0 );
        myBox.depth = 4;
        Gson gson = new Gson();
        String json = gson.toJson(myBox);
        //System.out.println(json);

        //double volFirstBox = myBox.depth * myBox.height * myBox.width;
        //System.out.println("volume of first box = " + volFirstBox);

        //double volSecondBox = myBox2.depth * myBox2.height * myBox2.width;
        //System.out.println("volume of second box = " + volSecondBox);


        myBox.setDim(10, 20, 10);
        myBox2.setDim(300,1,1);
        double vol1 = myBox.countVolume();
        double vol2 = myBox2.countVolume();
        System.out.println(vol1);
        System.out.println(vol2);
        /*System.out.println(myBox.hashCode());
        System.out.println(myBox2.hashCode());
        System.out.println(myBox3.hashCode());*/
    }

}
