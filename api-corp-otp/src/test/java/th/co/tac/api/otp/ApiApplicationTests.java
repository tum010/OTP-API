package th.co.tac.api.otp;

import static org.hamcrest.CoreMatchers.equalTo;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import io.restassured.RestAssured;
import th.co.tac.api.otp.ApiApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT, classes = ApiApplication.class)
public class ApiApplicationTests {

	@LocalServerPort
	private int port;

	@Test
	public void sendOTPTest() {

		Map<String, String> rqMap = new HashMap<>();
		rqMap.put("subscriber_number", "66945609533");

		
		RestAssured.given().port(port).contentType("application/json").body(rqMap).when()
		.post("/api/api_service/otp/send").then().statusCode(200);
		
		
		RestAssured.given().port(port).contentType("application/json").body(rqMap).when()
				.post("/api/api_service/otp/send").then().statusCode(200).body("transaction_id", equalTo("66945609533"));

		
	}
}
