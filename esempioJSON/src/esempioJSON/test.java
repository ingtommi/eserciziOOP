package esempioJSON;

import org.json.simple.*;

public class test {

	public static void main(String[] args) {
		
		JSONObject obj = new JSONObject();
		obj.put("nome","tommaso");
		obj.put("nick","ingtommi");
		System.out.println(obj);
	}
}