package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻企业信用评估订单查询
 *
 * @author auto create
 * @since 1.0, 2019-01-10 16:48:34
 */
public class ZhimaCreditEpSceneRatingQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8466886823163153747L;

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
