package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.ai.cv.ua.async.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-07-04 15:16:49
 */
public class AnttechAiCvUaAsyncQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3184238824296969382L;

	/** 
	 * 结果访问机器域名
	 */
	@ApiField("host")
	private String host;

	/** 
	 * 返回码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 返回结果msg
	 */
	@ApiField("result_msg")
	private String resultMsg;

	/** 
	 * 本次调用是否成功
	 */
	@ApiField("result_success")
	private String resultSuccess;

	/** 
	 * 返回结果url
	 */
	@ApiField("result_url")
	private String resultUrl;

	/** 
	 * running succ fail timeout
	 */
	@ApiField("status")
	private String status;

	public void setHost(String host) {
		this.host = host;
	}
	public String getHost( ) {
		return this.host;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public String getResultMsg( ) {
		return this.resultMsg;
	}

	public void setResultSuccess(String resultSuccess) {
		this.resultSuccess = resultSuccess;
	}
	public String getResultSuccess( ) {
		return this.resultSuccess;
	}

	public void setResultUrl(String resultUrl) {
		this.resultUrl = resultUrl;
	}
	public String getResultUrl( ) {
		return this.resultUrl;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
