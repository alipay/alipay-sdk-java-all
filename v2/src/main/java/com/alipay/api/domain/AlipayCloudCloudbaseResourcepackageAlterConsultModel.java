package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 变配资源包询价
 *
 * @author auto create
 * @since 1.0, 2024-05-20 11:31:49
 */
public class AlipayCloudCloudbaseResourcepackageAlterConsultModel extends AlipayObject {

	private static final long serialVersionUID = 2236539654834534668L;

	/**
	 * 待变配的规格编码
	 */
	@ApiField("alter_spec_code")
	private String alterSpecCode;

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

	public String getAlterSpecCode() {
		return this.alterSpecCode;
	}
	public void setAlterSpecCode(String alterSpecCode) {
		this.alterSpecCode = alterSpecCode;
	}

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

}
