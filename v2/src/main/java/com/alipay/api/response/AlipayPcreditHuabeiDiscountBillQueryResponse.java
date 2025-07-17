package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.discount.bill.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:08
 */
public class AlipayPcreditHuabeiDiscountBillQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5188785658896262773L;

	/** 
	 * 外部交易号
	 */
	@ApiField("charge_no")
	private String chargeNo;

	/** 
	 * 分期服务费
	 */
	@ApiField("discount_amount")
	private String discountAmount;

	/** 
	 * 支付宝交易号
	 */
	@ApiField("pay_trade_no")
	private String payTradeNo;

	/** 
	 * 账单交易金额
	 */
	@ApiField("trade_amount")
	private String tradeAmount;

	/** 
	 * 交易时间
	 */
	@ApiField("trade_time")
	private Date tradeTime;

	public void setChargeNo(String chargeNo) {
		this.chargeNo = chargeNo;
	}
	public String getChargeNo( ) {
		return this.chargeNo;
	}

	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}
	public String getDiscountAmount( ) {
		return this.discountAmount;
	}

	public void setPayTradeNo(String payTradeNo) {
		this.payTradeNo = payTradeNo;
	}
	public String getPayTradeNo( ) {
		return this.payTradeNo;
	}

	public void setTradeAmount(String tradeAmount) {
		this.tradeAmount = tradeAmount;
	}
	public String getTradeAmount( ) {
		return this.tradeAmount;
	}

	public void setTradeTime(Date tradeTime) {
		this.tradeTime = tradeTime;
	}
	public Date getTradeTime( ) {
		return this.tradeTime;
	}

}
