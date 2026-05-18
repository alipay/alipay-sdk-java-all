package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.user.instcard.get response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-15 20:57:45
 */
public class AlipayFundUserInstcardGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 7856912655326281781L;

	/** 
	 * 支付宝用户id
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 用户支付宝外标卡
	 */
	@ApiField("out_card_no")
	private String outCardNo;

	/** 
	 * 支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setOutCardNo(String outCardNo) {
		this.outCardNo = outCardNo;
	}
	public String getOutCardNo( ) {
		return this.outCardNo;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
