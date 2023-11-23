package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 充值中心订单详情查询接口
 *
 * @author auto create
 * @since 1.0, 2023-05-25 16:46:08
 */
public class AlipayCommerceAcommunicationOrderDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2633982918838522793L;

	/**
	 * 订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 订单类型
	 */
	@ApiField("order_type")
	private String orderType;

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

}
