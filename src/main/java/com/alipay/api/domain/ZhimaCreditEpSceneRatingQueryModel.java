package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻企业信用评估订单查询
 *
 * @author auto create
 * @since 1.0, 2019-04-18 17:14:48
 */
public class ZhimaCreditEpSceneRatingQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5156812331226634141L;

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
