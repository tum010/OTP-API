package th.co.tac.api.otp.bl;

import th.co.tac.api.otp.dto.ServiceResp;
import th.co.tac.api.otp.dto.ServiceRqst;

public interface BusinessService {
	public abstract ServiceResp<?> doService(ServiceRqst<?> request);
}
