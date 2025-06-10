package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁订单支付取消
 *
 * @author auto create
 * @since 1.0, 2025-06-09 20:10:58
 */
public class AlipayCommerceRentOrderPayCancelModel extends AlipayObject {

	private static final long serialVersionUID = 2185851677843799164L;

	/**
	 * 交易组件业务订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 租金支付外部请求号（跟发起租金支付时传参一致）
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

}
