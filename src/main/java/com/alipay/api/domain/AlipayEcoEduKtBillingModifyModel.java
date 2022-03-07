package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 教育缴费账单状态同步接口
 *
 * @author auto create
 * @since 1.0, 2021-08-30 16:49:41
 */
public class AlipayEcoEduKtBillingModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3797783991937645113L;

	/**
	 * 成功Y，失败N
	 */
	@ApiField("bank_success")
	private String bankSuccess;

	/**
	 * 退款时，支付宝返回的用户的登录id
	 */
	@ApiField("buyer_logon_id")
	private String buyerLogonId;

	/**
	 * 支付宝返回的买家支付宝用户id
	 */
	@ApiField("buyer_user_id")
	private String buyerUserId;

	/**
	 * 本次退款是否发生了资金变化
	 */
	@ApiField("fund_change")
	private String fundChange;

	/**
	 * 支付宝返回的退款时间，而不是商户退款申请的时间
	 */
	@ApiField("gmt_refund")
	private String gmtRefund;

	/**
	 * 标识一次退款请求，同一笔交易多次退款需要保证唯一，如需部分退款，则此参数必传。（若退款时填写，则同步退款状态时也必须填写）
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * isv系统的订单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 需要退款的金额，该金额不能大于订单金额,单位为元，支持两位小数
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 支付宝返回的退款资金渠道，json格式字符串
	 */
	@ApiField("refund_detail_item_list")
	private String refundDetailItemList;

	/**
	 * 退款原因，商家根据客户实际退款原因填写（若退款时填写，则同步退款状态时也必须填写）
	 */
	@ApiField("refund_reason")
	private String refundReason;

	/**
	 * 状态：1:缴费成功，2:关闭账单，3、退费
如果为退款状态，需要填写fund_change, 
refund_amount, refund_reason,
out_request_no, buyer_logon_id,
gmt_refund,
buyer_user_id, refund_detail_item_list;
4、同步网商返回的状态,如果是网商银行的账单，bank_success这个字段必填
	 */
	@ApiField("status")
	private String status;

	/**
	 * 支付宝返回的交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getBankSuccess() {
		return this.bankSuccess;
	}
	public void setBankSuccess(String bankSuccess) {
		this.bankSuccess = bankSuccess;
	}

	public String getBuyerLogonId() {
		return this.buyerLogonId;
	}
	public void setBuyerLogonId(String buyerLogonId) {
		this.buyerLogonId = buyerLogonId;
	}

	public String getBuyerUserId() {
		return this.buyerUserId;
	}
	public void setBuyerUserId(String buyerUserId) {
		this.buyerUserId = buyerUserId;
	}

	public String getFundChange() {
		return this.fundChange;
	}
	public void setFundChange(String fundChange) {
		this.fundChange = fundChange;
	}

	public String getGmtRefund() {
		return this.gmtRefund;
	}
	public void setGmtRefund(String gmtRefund) {
		this.gmtRefund = gmtRefund;
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

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
