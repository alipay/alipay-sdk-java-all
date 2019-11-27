package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zoloz.authentication.faceinit.smilepay.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-07-09 20:12:48
 */
public class ZolozAuthenticationFaceinitSmilepayQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3332491168525934711L;

	/** 
	 * result
	 */
	@ApiField("result")
	private String result;

	/** 
	 * retcode
	 */
	@ApiField("retcode")
	private String retcode;

	/** 
	 * retMessage
	 */
	@ApiField("retmessage")
	private String retmessage;

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

	public void setRetmessage(String retmessage) {
		this.retmessage = retmessage;
	}
	public String getRetmessage( ) {
		return this.retmessage;
	}

}
