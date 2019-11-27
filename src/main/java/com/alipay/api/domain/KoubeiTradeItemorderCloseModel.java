package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单关闭接口
 *
 * @author auto create
 * @since 1.0, 2018-03-14 13:58:06
 */
public class KoubeiTradeItemorderCloseModel extends AlipayObject {

	private static final long serialVersionUID = 2349956223654688278L;

	/**
	 * 口碑订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 关闭订单原因
	 */
	@ApiField("reason")
	private String reason;

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

}
