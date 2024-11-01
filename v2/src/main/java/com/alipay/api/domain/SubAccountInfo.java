package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 子商户信息
 *
 * @author auto create
 * @since 1.0, 2024-10-09 11:27:01
 */
public class SubAccountInfo extends AlipayObject {

	private static final long serialVersionUID = 4721747862115863924L;

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
