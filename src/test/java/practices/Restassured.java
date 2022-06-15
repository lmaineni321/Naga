package practices;

import org.json.simple.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

import static io.restassured.RestAssured.*;

public class Restassured {

	public static void main(String[] args) {
		JSONObject jobj=new JSONObject();
		jobj.put("projectName", "sathi02");
		jobj.put("createdBy", "sathi");
		jobj.put("projectType", "crm");
		jobj.put("status", "onprogress");
		jobj.put("teamSize", 12);
		
		Response resp = given()
		.body(jobj)
		.contentType(ContentType.JSON)
		.when()
		.post("http://localhost:8084/addProject");
		 ResponseBody body = resp.getBody();
		System.out.println(body);
		String ct = resp.getContentType();
		System.out.println(ct);
		
		resp.then().log().all();
		resp.prettyPrint();
	
		
		

	}

}
