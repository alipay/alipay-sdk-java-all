package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券邮费信息
 *
 * @author auto create
 * @since 1.0, 2023-07-21 11:25:47
 */
public class VoucherExpressInfo extends AlipayObject {

	private static final long serialVersionUID = 4391825353477995426L;

	/**
	 * 邮费标识，属于券的服务，用于用户门槛信息展示
	 */
	@ApiField("pay_express")
	private String payExpress;

	public String getPayExpress() {
		return this.payExpress;
	}
	public void setPayExpress(String payExpress) {
		this.payExpress = payExpress;
	}

}
