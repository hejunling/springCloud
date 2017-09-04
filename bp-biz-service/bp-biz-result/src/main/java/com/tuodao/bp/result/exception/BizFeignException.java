package com.tuodao.bp.result.exception;

import feign.FeignException;

public class BizFeignException extends FeignException {

	protected BizFeignException(int status, String message) {
		super(status, message);
	}
	
	public BizFeignException(int code) {
		super(String.valueOf(code));
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
