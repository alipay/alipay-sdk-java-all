package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 优惠信息前置咨询
 *
 * @author auto create
 * @since 1.0, 2022-08-01 20:55:13
 */
public class AlipayCommerceTransportPromotionRecommendQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5891482296172544128L;

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
