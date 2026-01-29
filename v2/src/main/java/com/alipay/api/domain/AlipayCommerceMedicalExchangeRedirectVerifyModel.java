package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 渠道商家直接开通会员
 *
 * @author auto create
 * @since 1.0, 2026-01-22 16:18:47
 */
public class AlipayCommerceMedicalExchangeRedirectVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 1893219766791979653L;

	/**
	 * 会员卡权益ID
	 */
	@ApiField("benefit_id")
	private String benefitId;

	/**
	 * 用于同一请求的幂等校验
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 荣耀
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 兑换码
	 */
	@ApiField("exchange_code")
	private String exchangeCode;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部开卡开始时间
	 */
	@ApiField("out_service_start_time")
	private String outServiceStartTime;

	/**
	 * 电话号码
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * true 是续费 false是非续费
	 */
	@ApiField("renew")
	private Boolean renew;

	/**
	 * 会员卡结束时间戳
	 */
	@ApiField("service_end_time")
	private String serviceEndTime;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getBenefitId() {
		return this.benefitId;
	}
	public void setBenefitId(String benefitId) {
		this.benefitId = benefitId;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getExchangeCode() {
		return this.exchangeCode;
	}
	public void setExchangeCode(String exchangeCode) {
		this.exchangeCode = exchangeCode;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutServiceStartTime() {
		return this.outServiceStartTime;
	}
	public void setOutServiceStartTime(String outServiceStartTime) {
		this.outServiceStartTime = outServiceStartTime;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Boolean getRenew() {
		return this.renew;
	}
	public void setRenew(Boolean renew) {
		this.renew = renew;
	}

	public String getServiceEndTime() {
		return this.serviceEndTime;
	}
	public void setServiceEndTime(String serviceEndTime) {
		this.serviceEndTime = serviceEndTime;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
