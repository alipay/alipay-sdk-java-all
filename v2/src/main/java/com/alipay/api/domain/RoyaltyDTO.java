package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分账信息
 *
 * @author auto create
 * @since 1.0, 2025-03-31 19:26:53
 */
public class RoyaltyDTO extends AlipayObject {

	private static final long serialVersionUID = 5641732867491265687L;

	/**
	 * 对应这一期买断分账金，不能超过当期买断金，单位：元，精确到小数点后两位；
	 */
	@ApiField("buy_out_price")
	private String buyOutPrice;

	/**
	 * 预期分账时间
	 */
	@ApiField("expect_royalty_time")
	private Date expectRoyaltyTime;

	/**
	 * 租金分账期数，举例1、2、3.....
	 */
	@ApiField("royalty_period")
	private Long royaltyPeriod;

	/**
	 * 分账金额，举例50.00  单位：元，精确到小数点后两位
	 */
	@ApiField("royalty_price")
	private String royaltyPrice;

	/**
	 * 分账金类型，目前仅支持：
RENT(租金分账)、BUYOUT(买断分账)
	 */
	@ApiField("royalty_type")
	private String royaltyType;

	public String getBuyOutPrice() {
		return this.buyOutPrice;
	}
	public void setBuyOutPrice(String buyOutPrice) {
		this.buyOutPrice = buyOutPrice;
	}

	public Date getExpectRoyaltyTime() {
		return this.expectRoyaltyTime;
	}
	public void setExpectRoyaltyTime(Date expectRoyaltyTime) {
		this.expectRoyaltyTime = expectRoyaltyTime;
	}

	public Long getRoyaltyPeriod() {
		return this.royaltyPeriod;
	}
	public void setRoyaltyPeriod(Long royaltyPeriod) {
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
