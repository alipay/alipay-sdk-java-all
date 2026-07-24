package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁结算信息
 *
 * @author auto create
 * @since 1.0, 2026-03-12 11:46:45
 */
public class RentOrderSettleInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 7577242664965912878L;

	/**
	 * 租赁订单支付外部请求号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 结算金额
	 */
	@ApiField("settle_amount")
	private String settleAmount;

	/**
	 * 结算账号，仅采购结算有
	 */
	@ApiField("settle_target")
	private RentOrderSettleTargetDTO settleTarget;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getSettleAmount() {
		return this.settleAmount;
	}
	public void setSettleAmount(String settleAmount) {
		this.settleAmount = settleAmount;
	}

	public RentOrderSettleTargetDTO getSettleTarget() {
		return this.settleTarget;
	}
	public void setSettleTarget(RentOrderSettleTargetDTO settleTarget) {
		this.settleTarget = settleTarget;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
