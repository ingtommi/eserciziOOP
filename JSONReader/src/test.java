import java.util.ArrayList;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;

public class test {
    
	//TODO: capire perchè serve aggungere JSONException
	public static void main(String[] args) throws JSONException {
        
        String jsonText = "{\"city\":\"Jesi\",\"name\":\"Tommaso\",\"interests\":[\"sports\",\"travels\",\"engineering\"],\"age\":21}";
        JSONObject jsonObj = new JSONObject(jsonText);
        
        String name = (String) jsonObj.get("name");
        String city = (String) jsonObj.get("city");
        JSONArray array = jsonObj.getJSONArray("interests"); //metodo che non esiste in json simple
        
        ArrayList<String> interests = new ArrayList<String>(array.length()); //in json simple c'è .size()
        for(int i=0; i<array.length(); i++) {
            String interest = array.getString(i); //metodo che non esiste in json simple
            interests.add(interest);
        }
        System.out.println("Hello " + name + " from " + city + ", yo're interested in " + interests);
    }
}

//USANDO org.json.simple AVEVO PROBLEMI NEL DEFINRIE ARRAY, MA RIPORTO LA SINTASSI INIZIALE PER COMPLETEZZA

/*String jsonText = "{\"name\": \"Tommaso\", \"age\": 21, \"city\": \"Jesi\"}";
Object obj = JSONValue.parse(jsonText);
JSONObject jsonObj = (JSONObject) obj

String name = (String) jsonObj.get("name");
long age = (Long) jsonObj.get("age");
String city = (String) jsonObj.get("city");*/