package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付券归属商户信息
 *
 * @author auto create
 * @since 1.0, 2023-06-29 12:14:43
 */
public class PaymentVoucherBelongMerchantInfo extends AlipayObject {

	private static final long serialVersionUID = 1833771642285568333L;

	/**
	 * 商户支付宝id，默认品牌名和品牌logo将从该商户信息中获取
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 商户支付宝id类型。
	 */
	@ApiField("merchant_id_type")
	private String merchantIdType;

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getMerchantIdType() {
		return this.merchantIdType;
	}
	public void setMerchantIdType(String merchantIdType) {
		this.merchantIdType = merchantIdType;
	}

}
