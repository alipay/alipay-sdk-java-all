package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 二手资金信息
 *
 * @author auto create
 * @since 1.0, 2026-07-29 16:24:58
 */
public class ResaleFundInfoVO extends AlipayObject {

	private static final long serialVersionUID = 3159833812784773848L;

	/**
	 * 支付金额（元）
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 外部资金id
	 */
	@ApiField("out_request_id")
	private String outRequestId;

	/**
	 * 支付说明
	 */
	@ApiField("trade_memo")
	private String tradeMemo;

	/**
	 * 关联交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 资金属性
	 */
	@ApiField("trade_prop")
	private String tradeProp;

	/**
	 * 支付状态
	 */
	@ApiField("trade_status")
	private String tradeStatus;

	/**
	 * 资金子类型
	 */
	@ApiField("trade_sub_type")
	private String tradeSubType;

	/**
	 * 交易完成时间
	 */
	@ApiField("trade_time")
	private String tradeTime;

	/**
	 * 付款、分账、结算、退款
	 */
	@ApiField("trade_type")
	private String tradeType;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getOutRequestId() {
		return this.outRequestId;
	}
	public void setOutRequestId(String outRequestId) {
		this.outRequestId = outRequestId;
	}

	public String getTradeMemo() {
		return this.tradeMemo;
	}
	public void setTradeMemo(String tradeMemo) {
		this.tradeMemo = tradeMemo;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getTradeProp() {
		return this.tradeProp;
	}
	public void setTradeProp(String tradeProp) {
		this.tradeProp = tradeProp;
	}

	public String getTradeStatus() {
		return this.tradeStatus;
	}
	public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
	}

	public String getTradeSubType() {
		return this.tradeSubType;
	}
	public void setTradeSubType(String tradeSubType) {
		this.tradeSubType = tradeSubType;
	}

	public String getTradeTime() {
		return this.tradeTime;
	}
	public void setTradeTime(String tradeTime) {
		this.tradeTime = tradeTime;
	}

	public String getTradeType() {
		return this.tradeType;
	}
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

}
