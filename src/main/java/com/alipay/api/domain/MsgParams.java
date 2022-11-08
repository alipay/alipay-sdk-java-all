package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 消息内容
 *
 * @author auto create
 * @since 1.0, 2022-03-02 11:39:18
 */
public class MsgParams extends AlipayObject {

	private static final long serialVersionUID = 3515781175142231793L;

	/**
	 * 账单金额
	 */
	@ApiField("bill_amount")
	private String billAmount;

	/**
	 * 机构名称
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 到期天数
	 */
	@ApiField("expire_days")
	private String expireDays;

	/**
	 * 还款时间
	 */
	@ApiField("repay_date")
	private String repayDate;

	public String getBillAmount() {
		return this.billAmount;
	}
	public void setBillAmount(String billAmount) {
		this.billAmount = billAmount;
	}

	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getExpireDays() {
		return this.expireDays;
	}
	public void setExpireDays(String expireDays) {
		this.expireDays = expireDays;
	}

	public String getRepayDate() {
		return this.repayDate;
	}
	public void setRepayDate(String repayDate) {
		this.repayDate = repayDate;
	}

}
