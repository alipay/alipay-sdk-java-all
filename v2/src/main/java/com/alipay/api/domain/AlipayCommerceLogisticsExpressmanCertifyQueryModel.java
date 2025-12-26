package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 快递员身份认证查询
 *
 * @author auto create
 * @since 1.0, 2025-07-14 16:37:06
 */
public class AlipayCommerceLogisticsExpressmanCertifyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1231279884699289998L;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("expressman_open_id")
	private String expressmanOpenId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("expressman_user_id")
	private String expressmanUserId;

	/**
	 * 1、startApp（商户是支付宝内小程序，打开小程序）
2、backApp（商户是支付宝内小程序，返回小程序）
3、startThirdApp（商户是其他应用，返回其他应用）
	 */
	@ApiField("jump_type")
	private String jumpType;

	/**
	 * 由支付宝分配
	 */
	@ApiField("logistics_code")
	private String logisticsCode;

	/**
	 * 商户回跳地址
	 */
	@ApiField("merchant_jump_address")
	private String merchantJumpAddress;

	public String getExpressmanOpenId() {
		return this.expressmanOpenId;
	}
	public void setExpressmanOpenId(String expressmanOpenId) {
		this.expressmanOpenId = expressmanOpenId;
	}

	public String getExpressmanUserId() {
		return this.expressmanUserId;
	}
	public void setExpressmanUserId(String expressmanUserId) {
		this.expressmanUserId = expressmanUserId;
	}

	public String getJumpType() {
		return this.jumpType;
	}
	public void setJumpType(String jumpType) {
		this.jumpType = jumpType;
	}

	public String getLogisticsCode() {
		return this.logisticsCode;
	}
	public void setLogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}

	public String getMerchantJumpAddress() {
		return this.merchantJumpAddress;
	}
	public void setMerchantJumpAddress(String merchantJumpAddress) {
		this.merchantJumpAddress = merchantJumpAddress;
	}

}
