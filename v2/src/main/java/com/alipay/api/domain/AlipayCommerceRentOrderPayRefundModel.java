package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 租赁订单支付退款
 *
 * @author auto create
 * @since 1.0, 2025-11-06 14:22:41
 */
public class AlipayCommerceRentOrderPayRefundModel extends AlipayObject {

	private static final long serialVersionUID = 1366749777395269665L;

	/**
	 * 交易组件订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 退款请求号。 标识一次退款请求，需要保证在交易号下唯一。 注：针对同一次退款请求，如果调用接口失败或异常了，重试时需要保证退款请求号不能变更，防止该笔交易重复退款。支付宝会保证同样的退款请求号多次请求只会退一次。
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 支付创建时传入的商户外部交易ID
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 退款金额，单位：元，精确到小数点后两位。
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * null
	 */
	@ApiListField("refund_items")
	@ApiField("rent_refund_item_d_t_o")
	private List<RentRefundItemDTO> refundItems;

	/**
	 * 退款原因说明。 商家自定义，将在会在商户和用户的pc退款账单详情中展示
	 */
	@ApiField("refund_reason")
	private String refundReason;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public List<RentRefundItemDTO> getRefundItems() {
		return this.refundItems;
	}
	public void setRefundItems(List<RentRefundItemDTO> refundItems) {
		this.refundItems = refundItems;
	}

	public String getRefundReason() {
		return this.refundReason;
	}
	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
