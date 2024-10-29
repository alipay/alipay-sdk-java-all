package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合作伙伴模型，用户传入二级商户信息等
 *
 * @author auto create
 * @since 1.0, 2024-07-30 10:38:20
 */
public class PartnerDTO extends AlipayObject {

	private static final long serialVersionUID = 2813672618222449283L;

	/**
	 * 二级商户id
	 */
	@ApiField("secondary_merchant_id")
	private String secondaryMerchantId;

	public String getSecondaryMerchantId() {
		return this.secondaryMerchantId;
	}
	public void setSecondaryMerchantId(String secondaryMerchantId) {
		this.secondaryMerchantId = secondaryMerchantId;
	}

}
