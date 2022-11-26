package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商业订单退款查询
 *
 * @author auto create
 * @since 1.0, 2019-08-17 17:37:49
 */
public class AlipayBusinessOrderRefundQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8458432178774793582L;

	/**
	 * 支付宝订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 退款请求号，和退款时的退款请求号refund_request_no保持一致。若该参数为空则认为时整单退款查询，返回订单中所有的退款信息
	 */
	@ApiField("refund_request_no")
	private String refundRequestNo;

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getRefundRequestNo() {
		return this.refundRequestNo;
	}
	public void setRefundRequestNo(String refundRequestNo) {
		this.refundRequestNo = refundRequestNo;
	}

}
