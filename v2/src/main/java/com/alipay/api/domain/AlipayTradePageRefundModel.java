package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 统一收单退款页面接口
 *
 * @author auto create
 * @since 1.0, 2023-12-21 15:24:12
 */
public class AlipayTradePageRefundModel extends AlipayObject {

	private static final long serialVersionUID = 4526655335653747223L;

	/**
	 * 退款场景。
信用退款传CREDIT_REFUND；
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 业务扩展参数
	 */
	@ApiField("extend_params")
	private RefundExtendParams extendParams;

	/**
	 * 商户的操作员编号
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 标识一次退款请求，同一笔交易多次退款需要保证唯一。
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 订单支付时传入的商户订单号,不能和 trade_no同时为空。
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 需要退款的金额，该金额不能大于订单金额,单位为元，支持两位小数。
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 退款的原因说明
	 */
	@ApiField("refund_reason")
	private String refundReason;

	/**
	 * 商户的门店编号
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * 商户的终端编号
	 */
	@ApiField("terminal_id")
	private String terminalId;

	/**
	 * 支付宝交易号，和商户订单号不能同时为空
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public RefundExtendParams getExtendParams() {
		return this.extendParams;
	}
	public void setExtendParams(RefundExtendParams extendParams) {
		this.extendParams = extendParams;
	}

	public String getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
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

	public String getRefundReason() {
		return this.refundReason;
	}
	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getTerminalId() {
		return this.terminalId;
	}
	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
