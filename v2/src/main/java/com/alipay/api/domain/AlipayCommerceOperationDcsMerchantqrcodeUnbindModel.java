package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * UTC提供商户解绑收钱码
 *
 * @author auto create
 * @since 1.0, 2024-01-23 15:21:33
 */
public class AlipayCommerceOperationDcsMerchantqrcodeUnbindModel extends AlipayObject {

	private static final long serialVersionUID = 4588881682848113591L;

	/**
	 * 商户标识
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 联营计划标识
	 */
	@ApiField("plan_id")
	private String planId;

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getPlanId() {
		return this.planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}

}
