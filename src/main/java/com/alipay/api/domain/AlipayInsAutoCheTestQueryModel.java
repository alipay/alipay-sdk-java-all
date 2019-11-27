package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询车险
 *
 * @author auto create
 * @since 1.0, 2019-05-23 17:08:37
 */
public class AlipayInsAutoCheTestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7672811574475772978L;

	/**
	 * fdsjkfjkdsj
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
