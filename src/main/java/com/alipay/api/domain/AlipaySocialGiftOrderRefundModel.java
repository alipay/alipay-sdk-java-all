package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户商户发起退款
 *
 * @author auto create
 * @since 1.0, 2018-09-04 16:32:47
 */
public class AlipaySocialGiftOrderRefundModel extends AlipayObject {

	private static final long serialVersionUID = 7271877155223146312L;

	/**
	 * 商户再送礼平台的唯一ID，用于标识具体的调用业务方，需要先在送礼平台进行业务类型的分配之后才看使用。
	 */
	@ApiField("mid")
	private String mid;

	/**
	 * 对应送礼平台的主订单ID，可根据此进行订单查询
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 部分退款金额
	 */
	@ApiField("refund_price")
	private String refundPrice;

	/**
	 * 退款类型：
REFUND_ALL：全额退款， 取订单金额进行全额退款
REFUND_PARTLY：部分退款
	 */
	@ApiField("refund_type")
	private String refundType;

	public String getMid() {
		return this.mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getRefundPrice() {
		return this.refundPrice;
	}
	public void setRefundPrice(String refundPrice) {
		this.refundPrice = refundPrice;
	}

	public String getRefundType() {
		return this.refundType;
	}
	public void setRefundType(String refundType) {
		this.refundType = refundType;
	}

}
