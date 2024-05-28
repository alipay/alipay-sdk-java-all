package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.ai.cv.ocr.businesslicense.identify response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 19:46:09
 */
public class AnttechAiCvOcrBusinesslicenseIdentifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1585936964348877985L;

	/** 
	 * 算法错误信息
	 */
	@ApiField("algo_msg")
	private String algoMsg;

	/** 
	 * 算法异常错误码
	 */
	@ApiField("algo_ret")
	private Long algoRet;

	/** 
	 * 框架错误信息
	 */
	@ApiField("message")
	private String message;

	/** 
	 * 算法结果,JSON String
	 */
	@ApiField("result")
	private String result;

	/** 
	 * 框架inference服务错误码，0为正常
	 */
	@ApiField("ret")
	private Long ret;

	public void setAlgoMsg(String algoMsg) {
		this.algoMsg = algoMsg;
	}
	public String getAlgoMsg( ) {
		return this.algoMsg;
	}

	public void setAlgoRet(Long algoRet) {
		this.algoRet = algoRet;
	}
	public Long getAlgoRet( ) {
		return this.algoRet;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage( ) {
		return this.message;
	}

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

	public void setRet(Long ret) {
		this.ret = ret;
	}
	public Long getRet( ) {
		return this.ret;
	}

}
