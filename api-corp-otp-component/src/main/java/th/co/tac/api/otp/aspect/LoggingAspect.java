package th.co.tac.api.otp.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	@Before("execution(* th.co.tac.api.otp.resource.ApiController.*(..))")
	public void logBefore(JoinPoint joinPoint) throws Throwable {
		System.out.println("========================" + joinPoint.getSignature());
	}
}
