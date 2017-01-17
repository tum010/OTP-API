package th.co.tac.api.otp.dto;

public class SendOTPRqst implements ServiceRqst<SendOTPRqst> {
	private String subscriber_number;

	public String getSubscriber_number() {
		return subscriber_number;
	}

	public void setSubscriber_number(String subscriber_number) {
		this.subscriber_number = subscriber_number;
	}

}
