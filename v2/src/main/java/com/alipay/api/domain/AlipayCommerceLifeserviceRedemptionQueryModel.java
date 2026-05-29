package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生活服务兑换码查询
 *
 * @author auto create
 * @since 1.0, 2026-05-27 13:47:47
 */
public class AlipayCommerceLifeserviceRedemptionQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8497437567598366432L;

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
