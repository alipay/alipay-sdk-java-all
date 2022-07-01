package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.world.virtualcard.apply response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-13 15:44:07
 */
public class AlipayCommerceTransportWorldVirtualcardApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5575562736243715234L;

	/** 
	 * 用户的卡号
	 */
	@ApiField("card_no")
	private String cardNo;

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
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getCardNo( ) {
		return this.cardNo;
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
