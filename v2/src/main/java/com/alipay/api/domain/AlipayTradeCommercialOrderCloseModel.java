package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商业订单关闭接口
 *
 * @author auto create
 * @since 1.0, 2026-06-08 19:47:57
 */
public class AlipayTradeCommercialOrderCloseModel extends AlipayObject {

	private static final long serialVersionUID = 1468612872864789878L;

	/**
	 * 关闭订单的具体原因
	 */
	@ApiField("close_reason")
	private String closeReason;

	/**
	 * 需要关闭的订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	public String getCloseReason() {
		return this.closeReason;
	}
	public void setCloseReason(String closeReason) {
		this.closeReason = closeReason;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

}
