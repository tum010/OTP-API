package th.co.tac.api.otp.dto;

public class SendOTPResp implements ServiceResp<SendOTPResp> {

	private String transaction_id;

	public String getTransaction_id() {
		return transaction_id;
	}

	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}

	
	
}
