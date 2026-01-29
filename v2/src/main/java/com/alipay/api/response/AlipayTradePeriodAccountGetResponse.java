package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.period.account.get response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-21 17:57:42
 */
public class AlipayTradePeriodAccountGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 7116646946852663265L;

	/** 
	 * 表示境内商家结算的卡编号
	 */
	@ApiField("alipay_card_id")
	private String alipayCardId;

	/** 
	 * 表示境内商家结算中的卡号
	 */
	@ApiField("bank_card_no")
	private String bankCardNo;

	/** 
	 * 表示境内商家结算的卡机构
	 */
	@ApiField("inst_name")
	private String instName;

	/** 
	 * 用于垫资打款的外表卡号
	 */
	@ApiField("overdraft_out_card_no")
	private String overdraftOutCardNo;

	/** 
	 * 表示境内商家结算产品的到账时间字段
	 */
	@ApiField("postponed_time")
	private String postponedTime;

	/** 
	 * 表示境内商家结算协议里的结算汇总方式字段
	 */
	@ApiField("settle_way")
	private String settleWay;

	public void setAlipayCardId(String alipayCardId) {
		this.alipayCardId = alipayCardId;
	}
	public String getAlipayCardId( ) {
		return this.alipayCardId;
	}

	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}
	public String getBankCardNo( ) {
		return this.bankCardNo;
	}

	public void setInstName(String instName) {
		this.instName = instName;
	}
	public String getInstName( ) {
		return this.instName;
	}

	public void setOverdraftOutCardNo(String overdraftOutCardNo) {
		this.overdraftOutCardNo = overdraftOutCardNo;
	}
	public String getOverdraftOutCardNo( ) {
		return this.overdraftOutCardNo;
	}

	public void setPostponedTime(String postponedTime) {
		this.postponedTime = postponedTime;
	}
	public String getPostponedTime( ) {
		return this.postponedTime;
	}

	public void setSettleWay(String settleWay) {
		this.settleWay = settleWay;
	}
	public String getSettleWay( ) {
		return this.settleWay;
	}

}
