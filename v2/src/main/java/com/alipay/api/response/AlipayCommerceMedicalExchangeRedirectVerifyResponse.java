package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.exchange.redirect.verify response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-04 10:07:40
 */
public class AlipayCommerceMedicalExchangeRedirectVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1311951218282376563L;

	/** 
	 * 会员卡流水号
	 */
	@ApiField("card_no")
	private String cardNo;

	/** 
	 * 返回给外部，所开卡的到期时间
	 */
	@ApiField("expire_time")
	private String expireTime;

	/** 
	 * 可以开通 true 、不能开通 false
	 */
	@ApiField("open")
	private Boolean open;

	/** 
	 * 电话号
	 */
	@ApiField("phone")
	private String phone;

	/** 
	 * 开通成功后的跳转链接
	 */
	@ApiField("redirect_url")
	private String redirectUrl;

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getCardNo( ) {
		return this.cardNo;
	}

	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}
	public String getExpireTime( ) {
		return this.expireTime;
	}

	public void setOpen(Boolean open) {
		this.open = open;
	}
	public Boolean getOpen( ) {
		return this.open;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone( ) {
		return this.phone;
	}

	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}
	public String getRedirectUrl( ) {
		return this.redirectUrl;
	}

}
