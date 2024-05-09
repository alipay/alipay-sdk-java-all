package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.cityfacilitator.iotbsp.hgnfc.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-29 19:42:00
 */
public class AlipayCommerceCityfacilitatorIotbspHgnfcSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 7377188639983963627L;

	/** 
	 * result
	 */
	@ApiField("result")
	private String result;

	/** 
	 * retCode
	 */
	@ApiField("ret_code")
	private String retCode;

	/** 
	 * ret_code_sub
	 */
	@ApiField("ret_code_sub")
	private String retCodeSub;

	/** 
	 * retMessage
	 */
	@ApiField("ret_message")
	private String retMessage;

	/** 
	 * retMessageSub
	 */
	@ApiField("ret_message_sub")
	private String retMessageSub;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

	public void setRetCode(String retCode) {
		this.retCode = retCode;
	}
	public String getRetCode( ) {
		return this.retCode;
	}

	public void setRetCodeSub(String retCodeSub) {
		this.retCodeSub = retCodeSub;
	}
	public String getRetCodeSub( ) {
		return this.retCodeSub;
	}

	public void setRetMessage(String retMessage) {
		this.retMessage = retMessage;
	}
	public String getRetMessage( ) {
		return this.retMessage;
	}

	public void setRetMessageSub(String retMessageSub) {
		this.retMessageSub = retMessageSub;
	}
	public String getRetMessageSub( ) {
		return this.retMessageSub;
	}

}
