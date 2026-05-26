package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生活服务兑换码查询
 *
 * @author auto create
 * @since 1.0, 2026-05-21 16:32:45
 */
public class AlipayCommerceLifeserviceRedemptionQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4795517299211739377L;

	/**
	 * 兑换码
	 */
	@ApiField("redemption_code")
	private String redemptionCode;

	public String getRedemptionCode() {
		return this.redemptionCode;
	}
	public void setRedemptionCode(String redemptionCode) {
		this.redemptionCode = redemptionCode;
	}

}
