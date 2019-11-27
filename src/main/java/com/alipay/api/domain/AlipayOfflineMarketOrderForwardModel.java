package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 第三方调用此接口推进订单状态
 *
 * @author auto create
 * @since 1.0, 2015-12-04 14:07:26
 */
public class AlipayOfflineMarketOrderForwardModel extends AlipayObject {

	private static final long serialVersionUID = 2158262598914959431L;

	/**
	 * 操作备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 操作类型
	 */
	@ApiField("order_action")
	private String orderAction;

	/**
	 * 订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOrderAction() {
		return this.orderAction;
	}
	public void setOrderAction(String orderAction) {
		this.orderAction = orderAction;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

}
