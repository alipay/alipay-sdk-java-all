package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 续费下单并支付
 *
 * @author auto create
 * @since 1.0, 2024-05-20 11:31:52
 */
public class AlipayCloudCloudbaseResourcepackageRenewCreateandpayModel extends AlipayObject {

	private static final long serialVersionUID = 7416341836511773219L;

	/**
	 * 小程序id
	 */
	@ApiField("biz_app_id")
	private String bizAppId;

	/**
	 * 环境id
	 */
	@ApiField("biz_env_id")
	private String bizEnvId;

	/**
	 * 优惠券code列表
	 */
	@ApiListField("coupon_codes")
	@ApiField("string")
	private List<String> couponCodes;

	/**
	 * 续费周期数(月)
	 */
	@ApiField("renew_month")
	private Long renewMonth;

	public String getBizAppId() {
		return this.bizAppId;
	}
	public void setBizAppId(String bizAppId) {
		this.bizAppId = bizAppId;
	}

	public String getBizEnvId() {
		return this.bizEnvId;
	}
	public void setBizEnvId(String bizEnvId) {
		this.bizEnvId = bizEnvId;
	}

	public List<String> getCouponCodes() {
		return this.couponCodes;
	}
	public void setCouponCodes(List<String> couponCodes) {
		this.couponCodes = couponCodes;
	}

	public Long getRenewMonth() {
		return this.renewMonth;
	}
	public void setRenewMonth(Long renewMonth) {
		this.renewMonth = renewMonth;
	}

}
