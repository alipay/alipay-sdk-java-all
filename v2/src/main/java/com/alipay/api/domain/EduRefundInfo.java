package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 退款信息
 *
 * @author auto create
 * @since 1.0, 2021-08-27 17:11:39
 */
public class EduRefundInfo extends AlipayObject {

	private static final long serialVersionUID = 3467979762246949371L;

	/**
	 * 本次退款是否发生了资金变化。
Y-是
N-否
	 */
	@ApiField("fund_change")
	private String fundChange;

	/**
	 * isv系统的订单号
	 */
	@ApiField("isv_order_no")
	private String isvOrderNo;

	/**
	 * 标识一次退款请求，同一笔交易多次退款需要保证唯一，如部分退款，则此参数必传
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 退款金额
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 支付宝返回的退款资金渠道，json格式字符串
	 */
	@ApiField("refund_detail_item_list")
	private String refundDetailItemList;

	/**
	 * 退款原因
	 */
	@ApiField("refund_reason")
	private String refundReason;

	public String getFundChange() {
		return this.fundChange;
	}
	public void setFundChange(String fundChange) {
		this.fundChange = fundChange;
	}

	public String getIsvOrderNo() {
		return this.isvOrderNo;
	}
	public void setIsvOrderNo(String isvOrderNo) {
		this.isvOrderNo = isvOrderNo;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRefundDetailItemList() {
		return this.refundDetailItemList;
	}
	public void setRefundDetailItemList(String refundDetailItemList) {
		this.refundDetailItemList = refundDetailItemList;
	}

	public String getRefundReason() {
		return this.refundReason;
	}
	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}

}
