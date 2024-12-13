package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 二级商户信息
 *
 * @author auto create
 * @since 1.0, 2024-09-24 20:45:52
 */
public class SubMerchantModifyDTO extends AlipayObject {

	private static final long serialVersionUID = 6735842332349179252L;

	/**
	 * 平台商模式，派单后真实的二级商户id
	 */
	@ApiField("real_merchant_id")
	private String realMerchantId;

	public String getRealMerchantId() {
		return this.realMerchantId;
	}
	public void setRealMerchantId(String realMerchantId) {
		this.realMerchantId = realMerchantId;
	}

}
