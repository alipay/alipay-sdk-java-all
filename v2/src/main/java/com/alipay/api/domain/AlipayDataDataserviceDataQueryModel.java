package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * OPENAPI测试
 *
 * @author auto create
 * @since 1.0, 2025-12-19 15:20:48
 */
public class AlipayDataDataserviceDataQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4486169469612217762L;

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
