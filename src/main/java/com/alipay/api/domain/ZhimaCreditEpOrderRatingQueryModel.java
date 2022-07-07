package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻企业信用评估订单查询接口
 *
 * @author auto create
 * @since 1.0, 2021-10-27 17:14:58
 */
public class ZhimaCreditEpOrderRatingQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8859535718572414133L;

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
