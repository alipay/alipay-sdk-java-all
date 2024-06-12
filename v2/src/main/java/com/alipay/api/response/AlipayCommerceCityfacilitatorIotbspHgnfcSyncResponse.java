package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.cityfacilitator.iotbsp.hgnfc.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-27 20:32:02
 */
public class AlipayCommerceCityfacilitatorIotbspHgnfcSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8627928828624583745L;

	/** 
	 * 返回结果信息
	 */
	@ApiField("result")
	private String result;

	/** 
	 * 错误码
	 */
	@ApiField("ret_code")
	private String retCode;

	/** 
	 * 二级错误码
	 */
	@ApiField("ret_code_sub")
	private String retCodeSub;

	/** 
	 * 错误原因
	 */
	@ApiField("ret_message")
	private String retMessage;

	/** 
	 * 二级错误信息
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
