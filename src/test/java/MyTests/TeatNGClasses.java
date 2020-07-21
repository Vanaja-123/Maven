package MyTests;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class TeatNGClasses {
  @Test
  public void getusers() {
  
  
  given() .
  get("https://reqres.in/api/users?page=2").
  then().
  statusCode(200);
  
  }
  
  @Test
  public void createuser() {
	        JSONObject request=new JSONObject();
	        
	        request.put("name", "morpheus");
	        request.put("job", "leader");
	        
	        given().
	        body(request.toJSONString()).
	        when().
	        post("https://reqres.in/api/users").
	        then().
	        statusCode(201);
	
  
  
  
  
  
  
  
  
  
  
  
  } 
}
