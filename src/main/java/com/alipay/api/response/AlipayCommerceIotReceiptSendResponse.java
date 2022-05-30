package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.receipt.send response.
 * 
 * @author auto create
 * @since 1.0, 2021-11-18 15:40:20
 */
public class AlipayCommerceIotReceiptSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 3622495186684814341L;

	/** 
	 * 扩展字段，暂时不用
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 小票id
	 */
	@ApiField("receipt_id")
	private String receiptId;

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
	 * 调用成功失败（true/false）
	 */
	@ApiField("success")
	private Boolean success;

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	public String getExtInfo( ) {
		return this.extInfo;
	}

	public void setReceiptId(String receiptId) {
		this.receiptId = receiptId;
	}
	public String getReceiptId( ) {
		return this.receiptId;
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
