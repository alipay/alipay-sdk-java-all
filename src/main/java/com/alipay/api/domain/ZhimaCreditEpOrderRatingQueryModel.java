package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻企业信用评估订单查询接口
 *
 * @author auto create
 * @since 1.0, 2019-03-04 11:32:51
 */
public class ZhimaCreditEpOrderRatingQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4254262875322447624L;

	/**
	 * 芝麻企业信用评估订单号
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
