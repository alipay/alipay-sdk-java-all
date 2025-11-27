package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付信息
 *
 * @author auto create
 * @since 1.0, 2025-04-18 15:18:40
 */
public class JAPaymentInfo extends AlipayObject {

	private static final long serialVersionUID = 2267339751734569787L;

	/**
	 * 用户是否可支付
	 */
	@ApiField("status")
	private String status;

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
