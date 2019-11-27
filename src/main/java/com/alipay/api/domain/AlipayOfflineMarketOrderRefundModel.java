package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑到家业务，商户发起订单退款
 *
 * @author auto create
 * @since 1.0, 2015-12-07 10:01:11
 */
public class AlipayOfflineMarketOrderRefundModel extends AlipayObject {

	private static final long serialVersionUID = 7537972486511317912L;

	/**
	 * 外部退款id，用来控制幂等
	 */
	@ApiField("external_refund_id")
	private String externalRefundId;

	/**
	 * 退款描述
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 口碑订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 退款金额，单位为元
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 如果全额退款，可不传，如果部分退款，必须带上明细。退款明细，如：
[{“item_order_no”:11,”refund_amount”:10.0},…]
	 */
	@ApiListField("refund_details")
	@ApiField("refund_detail_request")
	private List<RefundDetailRequest> refundDetails;

	public String getExternalRefundId() {
		return this.externalRefundId;
	}
	public void setExternalRefundId(String externalRefundId) {
		this.externalRefundId = externalRefundId;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public List<RefundDetailRequest> getRefundDetails() {
		return this.refundDetails;
	}
	public void setRefundDetails(List<RefundDetailRequest> refundDetails) {
		this.refundDetails = refundDetails;
	}

}
