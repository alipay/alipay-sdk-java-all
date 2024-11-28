package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 绿色能量发放归属的商户信息
 *
 * @author auto create
 * @since 1.0, 2024-01-11 20:38:33
 */
public class BelongMerchantInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 2486375197949624291L;

	/**
	 * 合作业务类型,默认为ISV_FOR_MERCHANT
枚举值:
ISV_FOR_MERCHANT 服务商代运营模式
	 */
	@ApiField("business_type")
	private String businessType;

	/**
	 * 商户PID;限制:1、服务商代运营模式必传
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 商户PID;限制:1、服务商代运营模式必传
	 */
	@ApiField("merchant_open_id")
	private String merchantOpenId;

	public String getBusinessType() {
		return this.businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getMerchantOpenId() {
		return this.merchantOpenId;
	}
	public void setMerchantOpenId(String merchantOpenId) {
		this.merchantOpenId = merchantOpenId;
	}

}
