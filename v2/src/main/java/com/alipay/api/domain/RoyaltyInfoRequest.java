package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-04-01 19:52:26
 */
public class RoyaltyInfoRequest extends AlipayObject {

	private static final long serialVersionUID = 3392247813929211536L;

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

	public String getRoyaltyType() {
		return this.royaltyType;
	}
	public void setRoyaltyType(String royaltyType) {
		this.royaltyType = royaltyType;
	}

}
