package th.co.tac.api.otp.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.stereotype.Component;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import th.co.tac.api.otp.model.SendOTPRequest;
import th.co.tac.api.otp.model.SendOTPResponse;

@Component
@Path("/api_service/otp")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Api(value = "One Time Password (OTP) API", produces = "application/json")
public class ApiController {

	@POST
	@Path("/send")
	@ApiOperation(				//Swagger Annotation
			value = "Request OTP", 
			response = SendOTPResponse.class)  
	@ApiResponses(value = {		//Swagger Annotation
		@ApiResponse(code = 200, message = "Resource found"),
	    @ApiResponse(code = 404, message = "Resource not found")
	})
	public Response sendOTP(SendOTPRequest request){
		
		SendOTPResponse rsponse = new SendOTPResponse();
		rsponse.setTransaction_id(request.getSubscriber_number());;
		
		return Response.status(Status.OK).entity(rsponse).build();
	}
	
	@POST
	@Path("/verify")
	@ApiOperation(				//Swagger Annotation
			value = "Verify OTP", 
			response = SendOTPResponse.class)  
	@ApiResponses(value = {		//Swagger Annotation
		@ApiResponse(code = 200, message = "Resource found"),
	    @ApiResponse(code = 404, message = "Resource not found")
	})
	public Response verifyOTP(SendOTPRequest request){
		return null;
	}
	
}
