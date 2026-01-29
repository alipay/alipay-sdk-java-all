package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 摩斯支付机构营销代金券发放
 *
 * @author auto create
 * @since 1.0, 2025-12-19 11:58:16
 */
public class AnttechMorseMarketingPayinstCouponSendModel extends AlipayObject {

	private static final long serialVersionUID = 4385343667722956839L;

	/**
	 * 发券活动的活动id，对应要发放的权益红包
	 */
	@ApiField("campaign_id")
	private String campaignId;

	/**
	 * 手机号加密类型，输入手机号时必填
	 */
	@ApiField("encrypt_type")
	private String encryptType;

	/**
	 * 用户的唯一支付宝Id。
	 */
	@ApiField("login_id")
	private String loginId;

	/**
	 * 外部请求号，发券唯一标识，用作幂等控制
	 */
	@ApiField("out_request_id")
	private String outRequestId;

	/**
	 * 加密后的手机号，加密类型可通过后续字段确认
	 */
	@ApiField("phone_id")
	private String phoneId;

	/**
	 * 发券类型，支付宝：ALIPAY
	 */
	@ApiField("send_voucher_type")
	private String sendVoucherType;

	/**
	 * wx用户标识appId#openId。send_voucher_type为WEIXIN_COUPON时才有意义
	 */
	@ApiField("weixin_id")
	private String weixinId;

	public String getCampaignId() {
		return this.campaignId;
	}
	public void setCampaignId(String campaignId) {
		this.campaignId = campaignId;
	}

	public String getEncryptType() {
		return this.encryptType;
	}
	public void setEncryptType(String encryptType) {
		this.encryptType = encryptType;
	}

	public String getLoginId() {
		return this.loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getOutRequestId() {
		return this.outRequestId;
	}
	public void setOutRequestId(String outRequestId) {
		this.outRequestId = outRequestId;
	}

	public String getPhoneId() {
		return this.phoneId;
	}
	public void setPhoneId(String phoneId) {
		this.phoneId = phoneId;
	}

	public String getSendVoucherType() {
		return this.sendVoucherType;
	}
	public void setSendVoucherType(String sendVoucherType) {
		this.sendVoucherType = sendVoucherType;
	}

	public String getWeixinId() {
		return this.weixinId;
	}
	public void setWeixinId(String weixinId) {
		this.weixinId = weixinId;
	}

}
