package com.cg.NurseryManagement.exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CommonExceptionalHandler {
	@ExceptionHandler
	public void handlerForNullPointerException(NullPointerException exp)
	{
		// this code executes whenever Null Pointer Exce raised
	}
}