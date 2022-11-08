package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 优惠信息前置咨询
 *
 * @author auto create
 * @since 1.0, 2022-11-04 15:00:14
 */
public class AlipayCommerceTransportPromotionRecommendQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5841955753662318534L;

	/**
	 * 金额，只支持两位小数点的正数
	 */
	@ApiField("amount")
	private String amount;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

}
