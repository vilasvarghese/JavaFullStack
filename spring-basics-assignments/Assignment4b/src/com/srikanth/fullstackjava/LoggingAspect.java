package com.vilas.fullstackjava;

import java.util.Date;
import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {

	static Logger logger = Logger.getLogger(LoggingAspect.class.getName());

	@After(value="execution(* com.vilas.fullstackjava.StudentUtil.getAllDetails(..))||execution(* com.vilas.fullstackjava.StudentUtil.getStudentDetails(..))", argNames = "joinPoint")
	public void LoggingAdvice(JoinPoint joinPoint) {
		logger.info("Method Name: " + joinPoint.getSignature().toShortString()+" Time: "+new Date());

	}

	@Around("execution(* com.vilas.fullstackjava.StudentUtil.getAllDetails(..))||execution(* com.vilas.fullstackjava.StudentUtil.getStudentDetails(..))")
	public Object profile(ProceedingJoinPoint pjp) throws Throwable {
		long start = System.currentTimeMillis();
		Object output = pjp.proceed();
		long elapsedTime = System.currentTimeMillis() - start;
		logger.info("Method execution time: " + elapsedTime + " milliseconds.");
		return output;
	}
}
