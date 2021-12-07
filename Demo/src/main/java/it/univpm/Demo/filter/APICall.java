package it.univpm.Demo.filter;

public class APICall {
	
	private String url;
	private String query;
	private int count;
	
	public APICall (String query, int count) {
		this.query = query;
		this.count = count;
		this.url = "https://wd4hfxnxxa.execute-api.us-east-2.amazonaws.com/dev/api/1.1/search/tweets.json?q="
				+ this.query + "&count=" + this.count;
	}
}