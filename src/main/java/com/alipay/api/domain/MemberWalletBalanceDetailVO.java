package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员钱包账户余额明细
 *
 * @author auto create
 * @since 1.0, 2022-05-10 10:31:23
 */
public class MemberWalletBalanceDetailVO extends AlipayObject {

	private static final long serialVersionUID = 8134713261755985453L;

	/**
	 * 权益金变更金额（单位：元）
	 */
	@ApiField("benefit_amount")
	private String benefitAmount;

	/**
	 * 本金变更金额（单位：元）
	 */
	@ApiField("principal_amount")
	private String principalAmount;

	/**
	 * 订单金额（单位：元）
	 */
	@ApiField("trade_amount")
	private String tradeAmount;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 交易时间
	 */
	@ApiField("trade_time")
	private Date tradeTime;

	/**
	 * 余额变更类型
<br>recharge 充值
<br>refund 退款
	 */
	@ApiField("trade_type")
	private String tradeType;

	public String getBenefitAmount() {
		return this.benefitAmount;
	}
	public void setBenefitAmount(String benefitAmount) {
		this.benefitAmount = benefitAmount;
	}

	public String getPrincipalAmount() {
		return this.principalAmount;
	}
	public void setPrincipalAmount(String principalAmount) {
		this.principalAmount = principalAmount;
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

	public Date getTradeTime() {
		return this.tradeTime;
	}
	public void setTradeTime(Date tradeTime) {
		this.tradeTime = tradeTime;
	}

	public String getTradeType() {
		return this.tradeType;
	}
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

}
