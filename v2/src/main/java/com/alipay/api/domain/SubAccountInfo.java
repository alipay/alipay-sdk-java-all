package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 子商户信息
 *
 * @author auto create
 * @since 1.0, 2024-12-06 15:16:49
 */
public class SubAccountInfo extends AlipayObject {

	private static final long serialVersionUID = 8341955756873369932L;

	/**
	 * 来源于不同平台的商户号
	 */
	@ApiField("sub_merchant_id")
	private String subMerchantId;

	/**
	 * 子商户号类型
	 */
	@ApiField("sub_merchant_type")
	private String subMerchantType;

	public String getSubMerchantId() {
		return this.subMerchantId;
	}
	public void setSubMerchantId(String subMerchantId) {
		this.subMerchantId = subMerchantId;
	}

	public String getSubMerchantType() {
		return this.subMerchantType;
	}
	public void setSubMerchantType(String subMerchantType) {
		this.subMerchantType = subMerchantType;
	}

}
