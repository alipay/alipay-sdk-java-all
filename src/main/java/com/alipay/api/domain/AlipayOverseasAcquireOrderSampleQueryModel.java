package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 境外收单开放平台第一个测试接口
 *
 * @author auto create
 * @since 1.0, 2017-06-22 20:28:38
 */
public class AlipayOverseasAcquireOrderSampleQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4765124329331178997L;

	/**
	 * 查询账号
	 */
	@ApiField("merchant_id")
	private String merchantId;

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

}
