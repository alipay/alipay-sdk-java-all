package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-03-20 19:49:41
 */
public class RoyaltyInfoRequest extends AlipayObject {

	private static final long serialVersionUID = 6442675635156615658L;

	/**
	 * 买断分账金，人明币，单位：元
	 */
	@ApiField("buy_out_royalty")
	private String buyOutRoyalty;

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
