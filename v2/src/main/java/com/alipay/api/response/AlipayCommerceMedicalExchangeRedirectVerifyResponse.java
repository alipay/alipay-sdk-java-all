package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.exchange.redirect.verify response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-22 16:27:42
 */
public class AlipayCommerceMedicalExchangeRedirectVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5875964321319287795L;

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
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

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

	/** 
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

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

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
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

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
