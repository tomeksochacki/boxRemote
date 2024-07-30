import com.google.gson.Gson;

public class Main {
    public static void main(String[] args){
        Box myBox = new Box(3.2, 3.0,3.0 );
        Gson gson = new Gson();
        String json = gson.toJson(myBox);
        System.out.println(json);
        System.out.println("");
        System.out.println("");
    }

}
