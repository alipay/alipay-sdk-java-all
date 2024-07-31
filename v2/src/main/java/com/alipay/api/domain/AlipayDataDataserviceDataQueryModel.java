package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * OPENAPI测试
 *
 * @author auto create
 * @since 1.0, 2024-01-31 14:08:50
 */
public class AlipayDataDataserviceDataQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8865717252315787286L;

	/**
	 * helle
	 */
	@ApiField("hello_hq")
	private HelloHq helloHq;

	/**
	 * 3
	 */
	@ApiField("order_no")
	private String orderNo;

	public HelloHq getHelloHq() {
		return this.helloHq;
	}
	public void setHelloHq(HelloHq helloHq) {
		this.helloHq = helloHq;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

}
