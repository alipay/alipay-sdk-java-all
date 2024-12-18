package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zoloz.authentication.customer.facemanage.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:35
 */
public class ZolozAuthenticationCustomerFacemanageCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2338525662841227118L;

	/** 
	 * 业务结果
	 */
	@ApiField("result")
	private String result;

	/** 
	 * 返回码
	 */
	@ApiField("retcode")
	private String retcode;

	/** 
	 * 返回详细码
	 */
	@ApiField("retcodesub")
	private String retcodesub;

	/** 
	 * 返回信息
	 */
	@ApiField("retmessage")
	private String retmessage;

	/** 
	 * 返回详细信息
	 */
	@ApiField("retmessagesub")
	private String retmessagesub;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

	public void setRetcode(String retcode) {
		this.retcode = retcode;
	}
	public String getRetcode( ) {
		return this.retcode;
	}

	public void setRetcodesub(String retcodesub) {
		this.retcodesub = retcodesub;
	}
	public String getRetcodesub( ) {
		return this.retcodesub;
	}

	public void setRetmessage(String retmessage) {
		this.retmessage = retmessage;
	}
	public String getRetmessage( ) {
		return this.retmessage;
	}

	public void setRetmessagesub(String retmessagesub) {
		this.retmessagesub = retmessagesub;
	}
	public String getRetmessagesub( ) {
		return this.retmessagesub;
	}

}
