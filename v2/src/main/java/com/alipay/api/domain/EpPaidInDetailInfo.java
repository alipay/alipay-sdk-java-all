package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业认缴明细
 *
 * @author auto create
 * @since 1.0, 2024-12-19 14:26:03
 */
public class EpPaidInDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 2713191237529751241L;

	/**
	 * 认缴出资币种
	 */
	@ApiField("paid_in_contributive_currency")
	private String paidInContributiveCurrency;

	/**
	 * 认缴出资日期
	 */
	@ApiField("paid_in_contributive_date")
	private String paidInContributiveDate;

	/**
	 * 认缴出资额
	 */
	@ApiField("paid_in_contributive_money")
	private String paidInContributiveMoney;

	/**
	 * 认缴出资方式
	 */
	@ApiField("paid_in_contributive_way")
	private String paidInContributiveWay;

	public String getPaidInContributiveCurrency() {
		return this.paidInContributiveCurrency;
	}
	public void setPaidInContributiveCurrency(String paidInContributiveCurrency) {
		this.paidInContributiveCurrency = paidInContributiveCurrency;
	}

	public String getPaidInContributiveDate() {
		return this.paidInContributiveDate;
	}
	public void setPaidInContributiveDate(String paidInContributiveDate) {
		this.paidInContributiveDate = paidInContributiveDate;
	}

	public String getPaidInContributiveMoney() {
		return this.paidInContributiveMoney;
	}
	public void setPaidInContributiveMoney(String paidInContributiveMoney) {
		this.paidInContributiveMoney = paidInContributiveMoney;
	}

	public String getPaidInContributiveWay() {
		return this.paidInContributiveWay;
	}
	public void setPaidInContributiveWay(String paidInContributiveWay) {
		this.paidInContributiveWay = paidInContributiveWay;
	}

}
