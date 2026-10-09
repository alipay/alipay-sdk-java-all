package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户查询
 *
 * @author auto create
 * @since 1.0, 2026-10-09 13:37:58
 */
public class AlipayTradeCustomerQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1328962851921338246L;

	/**
	 * 客户id
	 */
	@ApiField("customer_id")
	private String customerId;

	public String getCustomerId() {
		return this.customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

}
