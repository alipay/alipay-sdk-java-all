package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分账计划明细模型
 *
 * @author auto create
 * @since 1.0, 2025-05-09 19:49:19
 */
public class RoyaltyInfoRequest extends AlipayObject {

	private static final long serialVersionUID = 4565416168785877777L;

	/**
	 * 买断分账金，人明币，单位：元
	 */
	@ApiField("buy_out_royalty")
	private String buyOutRoyalty;

	/**
	 * 预期分账时间
	 */
	@ApiField("expect_royalty_time")
	private Date expectRoyaltyTime;

	/**
	 * 应还日（资方）
	 */
	@ApiField("repay_time")
	private Date repayTime;

	/**
	 * 分账利息，币种：人民币。
	 */
	@ApiField("royalty_interest_price")
	private String royaltyInterestPrice;

	/**
	 * 分账期数
	 */
	@ApiField("royalty_period")
	private String royaltyPeriod;

	/**
	 * 分账金额，单位为元；
	 */
	@ApiField("royalty_price")
	private String royaltyPrice;

	/**
	 * 分账本金，币种:人民币
	 */
	@ApiField("royalty_principal_price")
	private String royaltyPrincipalPrice;

	/**
	 * 分账类型
	 */
	@ApiField("royalty_type")
	private String royaltyType;

	public String getBuyOutRoyalty() {
		return this.buyOutRoyalty;
	}
	public void setBuyOutRoyalty(String buyOutRoyalty) {
		this.buyOutRoyalty = buyOutRoyalty;
	}

	public Date getExpectRoyaltyTime() {
		return this.expectRoyaltyTime;
	}
	public void setExpectRoyaltyTime(Date expectRoyaltyTime) {
		this.expectRoyaltyTime = expectRoyaltyTime;
	}

	public Date getRepayTime() {
		return this.repayTime;
	}
	public void setRepayTime(Date repayTime) {
		this.repayTime = repayTime;
	}

	public String getRoyaltyInterestPrice() {
		return this.royaltyInterestPrice;
	}
	public void setRoyaltyInterestPrice(String royaltyInterestPrice) {
		this.royaltyInterestPrice = royaltyInterestPrice;
	}

	public String getRoyaltyPeriod() {
		return this.royaltyPeriod;
	}
	public void setRoyaltyPeriod(String royaltyPeriod) {
		this.royaltyPeriod = royaltyPeriod;
	}

	public String getRoyaltyPrice() {
		return this.royaltyPrice;
	}
	public void setRoyaltyPrice(String royaltyPrice) {
		this.royaltyPrice = royaltyPrice;
	}

	public String getRoyaltyPrincipalPrice() {
		return this.royaltyPrincipalPrice;
	}
	public void setRoyaltyPrincipalPrice(String royaltyPrincipalPrice) {
		this.royaltyPrincipalPrice = royaltyPrincipalPrice;
	}

	public String getRoyaltyType() {
		return this.royaltyType;
	}
	public void setRoyaltyType(String royaltyType) {
		this.royaltyType = royaltyType;
	}

}
