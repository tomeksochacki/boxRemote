import com.google.gson.Gson;

public class Main {
    public static void main(String[] args){
        Box myBox = new Box(3.2, 3.0,3.0 );
        Box myBox2 = new Box(30.2, 30.0,30.0 );
        myBox.depth = 4;
        Gson gson = new Gson();
        String json = gson.toJson(myBox);
        //System.out.println(json);

        //double volFirstBox = myBox.depth * myBox.height * myBox.width;
        //System.out.println("volume of first box = " + volFirstBox);

        //double volSecondBox = myBox2.depth * myBox2.height * myBox2.width;
        //System.out.println("volume of second box = " + volSecondBox);

        myBox.volume();
        myBox2.volume();
    }

}
