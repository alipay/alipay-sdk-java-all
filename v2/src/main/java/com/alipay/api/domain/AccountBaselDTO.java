package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账户基础信息
 *
 * @author auto create
 * @since 1.0, 2025-06-30 20:05:19
 */
public class AccountBaselDTO extends AlipayObject {

	private static final long serialVersionUID = 4532945375735644372L;

	/**
	 * 小荷包账户ID
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 账户名称开户时传入
	 */
	@ApiField("account_name")
	private String accountName;

	/**
	 * 账户状态
	 */
	@ApiField("account_status")
	private String accountStatus;

	/**
	 * 授权协议号支付宝侧生成
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 当前可用金额（单位为元，必须大于0且最多小数点后两位）
	 */
	@ApiField("available_balance")
	private String availableBalance;

	/**
	 * 当前冻结金额（单位为元，必须大于0且最多小数点后两位）
	 */
	@ApiField("freeze_balance")
	private String freezeBalance;

	/**
	 * 生息状态
	 */
	@ApiField("profit_status")
	private String profitStatus;

	/**
	 * 昨日收益（单位为元，必须大于0且最多小数点后两位）
	 */
	@ApiField("yesterday_profit")
	private String yesterdayProfit;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAccountName() {
		return this.accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountStatus() {
		return this.accountStatus;
	}
	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getAvailableBalance() {
		return this.availableBalance;
	}
	public void setAvailableBalance(String availableBalance) {
		this.availableBalance = availableBalance;
	}

	public String getFreezeBalance() {
		return this.freezeBalance;
	}
	public void setFreezeBalance(String freezeBalance) {
		this.freezeBalance = freezeBalance;
	}

	public String getProfitStatus() {
		return this.profitStatus;
	}
	public void setProfitStatus(String profitStatus) {
		this.profitStatus = profitStatus;
	}

	public String getYesterdayProfit() {
		return this.yesterdayProfit;
	}
	public void setYesterdayProfit(String yesterdayProfit) {
		this.yesterdayProfit = yesterdayProfit;
	}

}
