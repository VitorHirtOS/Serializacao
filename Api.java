import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class Api implements Serializable {

    public StringBuilder json(String cepBR){

        StringBuilder response = new StringBuilder();

        try{
            URL url = new URL("https://viacep.com.br/ws/" + cepBR + "/json");

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;

            while(((inputLine = reader.readLine()) != null)){
                response.append(inputLine + "\n");
            }

            reader.close();

            System.out.println(response.toString());

            conn.disconnect();

            return response;

        }catch (Exception ex){
            System.out.println("Error: " + ex);
        };

        return  response;

    }

}
