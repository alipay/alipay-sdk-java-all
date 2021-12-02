package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 聚合支付退款单详情查询
 *
 * @author auto create
 * @since 1.0, 2020-01-03 14:49:19
 */
public class KoubeiTradeOrderRefundQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7298969488669982338L;

	/**
	 * 口碑侧订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 外部退款单号
	 */
	@ApiField("out_refund_no")
	private String outRefundNo;

	/**
	 * 请求唯一ID
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 口碑门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOutRefundNo() {
		return this.outRefundNo;
	}
	public void setOutRefundNo(String outRefundNo) {
		this.outRefundNo = outRefundNo;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
