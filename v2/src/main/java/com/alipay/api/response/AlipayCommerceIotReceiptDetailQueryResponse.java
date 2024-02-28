package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ReceiptDetailInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.receipt.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 00:26:06
 */
public class AlipayCommerceIotReceiptDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5273459932964653724L;

	/** 
	 * 电子小票详情信息
	 */
	@ApiField("data")
	private ReceiptDetailInfo data;

	/** 
	 * 返回码
	 */
	@ApiField("ret_code")
	private String retCode;

	/** 
	 * 返回子码
	 */
	@ApiField("ret_code_sub")
	private String retCodeSub;

	/** 
	 * 返回消息
	 */
	@ApiField("ret_message")
	private String retMessage;

	/** 
	 * 返回子消息
	 */
	@ApiField("ret_message_sub")
	private String retMessageSub;

	/** 
	 * 调用是否成功(true/false)
	 */
	@ApiField("success")
	private Boolean success;

	public void setData(ReceiptDetailInfo data) {
		this.data = data;
	}
	public ReceiptDetailInfo getData( ) {
		return this.data;
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

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
