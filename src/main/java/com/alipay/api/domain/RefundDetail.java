package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 退款明细信息
 *
 * @author auto create
 * @since 1.0, 2016-11-21 12:06:26
 */
public class RefundDetail extends AlipayObject {

	private static final long serialVersionUID = 1395934683342472425L;

	/**
	 * 交易退款金额
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 退款备注
	 */
	@ApiField("refund_memo")
	private String refundMemo;

	/**
	 * 退分润列表
	 */
	@ApiListField("refund_royaltys")
	@ApiField("refund_royalty_info")
	private List<RefundRoyaltyInfo> refundRoyaltys;

	/**
	 * 退补差金额
	 */
	@ApiField("refund_suppl_amount")
	private String refundSupplAmount;

	/**
	 * 退补差备注
	 */
	@ApiField("refund_suppl_memo")
	private String refundSupplMemo;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRefundMemo() {
		return this.refundMemo;
	}
	public void setRefundMemo(String refundMemo) {
		this.refundMemo = refundMemo;
	}

	public List<RefundRoyaltyInfo> getRefundRoyaltys() {
		return this.refundRoyaltys;
	}
	public void setRefundRoyaltys(List<RefundRoyaltyInfo> refundRoyaltys) {
		this.refundRoyaltys = refundRoyaltys;
	}

	public String getRefundSupplAmount() {
		return this.refundSupplAmount;
	}
	public void setRefundSupplAmount(String refundSupplAmount) {
		this.refundSupplAmount = refundSupplAmount;
	}

	public String getRefundSupplMemo() {
		return this.refundSupplMemo;
	}
	public void setRefundSupplMemo(String refundSupplMemo) {
		this.refundSupplMemo = refundSupplMemo;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
