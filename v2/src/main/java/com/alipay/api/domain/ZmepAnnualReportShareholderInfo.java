package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业工商年报股东出资信息
 *
 * @author auto create
 * @since 1.0, 2025-01-20 11:20:25
 */
public class ZmepAnnualReportShareholderInfo extends AlipayObject {

	private static final long serialVersionUID = 4711943976495577659L;

	/**
	 * 实缴出资时间
	 */
	@ApiField("paid_contributive_date")
	private String paidContributiveDate;

	/**
	 * 实缴出资额（万元）
	 */
	@ApiField("paid_contributive_money")
	private String paidContributiveMoney;

	/**
	 * 实缴出资方式
	 */
	@ApiField("paid_contributive_way")
	private String paidContributiveWay;

	/**
	 * 认缴出资时间
	 */
	@ApiField("paid_in_contributive_date")
	private String paidInContributiveDate;

	/**
	 * 认缴出资额（万元）
	 */
	@ApiField("paid_in_contributive_money")
	private String paidInContributiveMoney;

	/**
	 * 认缴出资方式
	 */
	@ApiField("paid_in_contributive_way")
	private String paidInContributiveWay;

	/**
	 * 股东
	 */
	@ApiField("shareholder")
	private String shareholder;

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

	public String getShareholder() {
		return this.shareholder;
	}
	public void setShareholder(String shareholder) {
		this.shareholder = shareholder;
	}

}
