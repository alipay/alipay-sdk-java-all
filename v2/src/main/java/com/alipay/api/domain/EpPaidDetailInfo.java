package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业实缴明细
 *
 * @author auto create
 * @since 1.0, 2024-12-19 14:26:03
 */
public class EpPaidDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 3359878197493384934L;

	/**
	 * 实缴出资币种
	 */
	@ApiField("paid_contributive_currency")
	private String paidContributiveCurrency;

	/**
	 * 实缴出资日期
	 */
	@ApiField("paid_contributive_date")
	private String paidContributiveDate;

	/**
	 * 实缴出资额
	 */
	@ApiField("paid_contributive_money")
	private String paidContributiveMoney;

	/**
	 * 实缴出资方式
	 */
	@ApiField("paid_contributive_way")
	private String paidContributiveWay;

	public String getPaidContributiveCurrency() {
		return this.paidContributiveCurrency;
	}
	public void setPaidContributiveCurrency(String paidContributiveCurrency) {
		this.paidContributiveCurrency = paidContributiveCurrency;
	}

	public String getPaidContributiveDate() {
		return this.paidContributiveDate;
	}
	public void setPaidContributiveDate(String paidContributiveDate) {
		this.paidContributiveDate = paidContributiveDate;
	}

	public String getPaidContributiveMoney() {
		return this.paidContributiveMoney;
	}
	public void setPaidContributiveMoney(String paidContributiveMoney) {
		this.paidContributiveMoney = paidContributiveMoney;
	}

	public String getPaidContributiveWay() {
		return this.paidContributiveWay;
	}
	public void setPaidContributiveWay(String paidContributiveWay) {
		this.paidContributiveWay = paidContributiveWay;
	}

}
