import com.google.gson.Gson;
import java.io.*;

public class JSON {
    static class result{
        int result;
        public result(int num){
            this.result=num;
        }
    }
    public void create(int num){
        Gson m= new Gson();
        result res= new result(num);
        String json= m.toJson(res);
        System.out.println(json);
        try{
            FileWriter file=new FileWriter("result.json");
            file.write(json);
            file.flush();
        }
        catch (IOException e){
            System.out.println("exception");
        }
    }

}
