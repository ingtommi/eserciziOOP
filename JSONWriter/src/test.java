import org.json.simple.*;

public class test {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		JSONObject obj = new JSONObject();
		obj.put("name","Tommaso");
		obj.put("age",21);
		obj.put("city","Jesi");
		
		JSONArray list = new JSONArray();
		list.add("sports");
		list.add("travels");
		list.add("engineering");
		obj.put("interests",list);
		
		System.out.println(obj);
	}
}