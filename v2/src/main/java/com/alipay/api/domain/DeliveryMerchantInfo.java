package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 曝光商户选取列表。
说明：曝光商户选取列表为空时默认使用投放活动的适用范围。
限制：曝光商户号需与投放归属商户号相等或有同品牌关系或有授权关系。
 *
 * @author auto create
 * @since 1.0, 2024-06-26 10:59:20
 */
public class DeliveryMerchantInfo extends AlipayObject {

	private static final long serialVersionUID = 7142366227265866178L;

	/**
	 * 商户id
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 商户id类型。
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
