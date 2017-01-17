package th.co.tac.api.otp.log.layout;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.LayoutBase;
import th.co.tac.api.otp.dto.LogInfo;

public class LogAPILayout extends LayoutBase<ILoggingEvent> {

	private static final String END_LINE = "|";
	LogInfo logInfo;

	public void setLogInfo(LogInfo logInfo) {
		this.logInfo = logInfo;
	}

	public String doLayout(ILoggingEvent args) {
		StringBuffer logFormat = new StringBuffer();
		logFormat.append(logInfo.getSubrNumb());
		logFormat.append(END_LINE);
		
		return logFormat.toString();
	}

}
