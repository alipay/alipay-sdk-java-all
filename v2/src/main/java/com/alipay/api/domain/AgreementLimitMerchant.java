package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 授权商户列表信息
 *
 * @author auto create
 * @since 1.0, 2023-01-10 21:15:15
 */
public class AgreementLimitMerchant extends AlipayObject {

	private static final long serialVersionUID = 3381225984544522333L;

	/**
	 * 授权商户id
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * PID - 直联商户
SMID - 间联商户
	 */
	@ApiField("merchant_type")
	private String merchantType;

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getMerchantType() {
		return this.merchantType;
	}
	public void setMerchantType(String merchantType) {
		this.merchantType = merchantType;
	}

}
