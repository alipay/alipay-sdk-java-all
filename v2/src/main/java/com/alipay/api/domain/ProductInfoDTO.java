package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景产品信息
 *
 * @author auto create
 * @since 1.0, 2026-04-22 16:20:35
 */
public class ProductInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 8848297916696564824L;

	/**
	 * 预估价格，单位:元
	 */
	@ApiField("estimate_premium")
	private String estimatePremium;

	public String getEstimatePremium() {
		return this.estimatePremium;
	}
	public void setEstimatePremium(String estimatePremium) {
		this.estimatePremium = estimatePremium;
	}

}
