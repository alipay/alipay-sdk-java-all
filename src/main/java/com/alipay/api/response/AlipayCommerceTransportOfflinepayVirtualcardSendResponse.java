package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.offlinepay.virtualcard.send response.
 * 
 * @author auto create
 * @since 1.0, 2022-01-11 10:45:42
 */
public class AlipayCommerceTransportOfflinepayVirtualcardSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 7189795558648166996L;

	/** 
	 * 用户虚拟卡卡号
	 */
	@ApiField("card_no")
	private String cardNo;

	/** 
	 * 卡片跳转地址
	 */
	@ApiField("card_schema")
	private String cardSchema;

	/** 
	 * 虚拟卡卡类型
	 */
	@ApiField("card_type")
	private String cardType;

	/** 
	 * 请求失败时的错误信息
	 */
	@ApiField("error_message")
	private String errorMessage;

	/** 
	 * 请求失败时返回的子错误码信息
	 */
	@ApiField("sub_error_code")
	private String subErrorCode;

	/** 
	 * 支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getCardNo( ) {
		return this.cardNo;
	}

	public void setCardSchema(String cardSchema) {
		this.cardSchema = cardSchema;
	}
	public String getCardSchema( ) {
		return this.cardSchema;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getCardType( ) {
		return this.cardType;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getErrorMessage( ) {
		return this.errorMessage;
	}

	public void setSubErrorCode(String subErrorCode) {
		this.subErrorCode = subErrorCode;
	}
	public String getSubErrorCode( ) {
		return this.subErrorCode;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
