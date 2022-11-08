package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 网商银行操作单查询
 *
 * @author auto create
 * @since 1.0, 2022-02-09 11:03:02
 */
public class MybankPaymentTradeBusinessOperateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7246161894832633894L;

	/**
	 * 创建订单时返回的订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 操作的请求流水号
	 */
	@ApiField("request_no")
	private String requestNo;

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getRequestNo() {
		return this.requestNo;
	}
	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

}
