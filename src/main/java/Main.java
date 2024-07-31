import com.google.gson.Gson;

public class Main {
    public static void main(String[] args){
        Box myBox = new Box(3.2, 3.0,3.0 );
        Box myBox2 = new Box(20.0, 23.0, 10.0);
        doble vol;
        Gson gson = new Gson();
        String json = gson.toJson(myBox);
        System.out.println(json);
        System.out.println("");
        System.out.println("");
        vol = myBox.width * myBox.height * myBox.depth;
        System.out.println("Vol is equal" + vol);
    }

}
