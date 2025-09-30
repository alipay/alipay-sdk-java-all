package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝商家账号信息
 *
 * @author auto create
 * @since 1.0, 2025-09-08 10:22:26
 */
public class AlipayMerchantInfo extends AlipayObject {

	private static final long serialVersionUID = 1152377767856858152L;

	/**
	 * 直连传支付宝pid
间连传支付宝smid
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 支付宝商户类型
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
