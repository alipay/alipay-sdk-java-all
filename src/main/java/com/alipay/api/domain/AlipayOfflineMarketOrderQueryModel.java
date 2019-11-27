package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑到家业务
 *
 * @author auto create
 * @since 1.0, 2015-12-07 10:12:14
 */
public class AlipayOfflineMarketOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6197868436178688764L;

	/**
	 * 口碑订单号
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
