package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回收资金明细
 *
 * @author auto create
 * @since 1.0, 2024-08-22 19:12:44
 */
public class RecycleFundsInfo extends AlipayObject {

	private static final long serialVersionUID = 3289985762733689479L;

	/**
	 * 支付宝支付资金流水号(代扣交易不填写)
对应转账接口的出参pay_fund_order_id
	 */
	@ApiField("fund_serial_no")
	private String fundSerialNo;

	/**
	 * 转账类型(prepay-预付款转账, balance-尾款转账, withhold-代扣交易)
	 */
	@ApiField("funds_type")
	private String fundsType;

	/**
	 * 支付宝代扣交易金额，单位为元，不支持千位分隔符，精确到小数点后两位
	 */
	@ApiField("trade_amount")
	private String tradeAmount;

	/**
	 * 支付宝交易订单号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 支付宝交易时间，格式为yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("trade_time")
	private String tradeTime;

	public String getFundSerialNo() {
		return this.fundSerialNo;
	}
	public void setFundSerialNo(String fundSerialNo) {
		this.fundSerialNo = fundSerialNo;
	}

	public String getFundsType() {
		return this.fundsType;
	}
	public void setFundsType(String fundsType) {
		this.fundsType = fundsType;
	}

	public String getTradeAmount() {
		return this.tradeAmount;
	}
	public void setTradeAmount(String tradeAmount) {
		this.tradeAmount = tradeAmount;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getTradeTime() {
		return this.tradeTime;
	}
	public void setTradeTime(String tradeTime) {
		this.tradeTime = tradeTime;
	}

}
