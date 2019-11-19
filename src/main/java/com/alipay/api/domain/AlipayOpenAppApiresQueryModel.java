package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * isp预发验证专用
 *
 * @author auto create
 * @since 1.0, 2018-12-27 18:02:54
 */
public class AlipayOpenAppApiresQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8841768476696123371L;

	/**
	 * 订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

}
