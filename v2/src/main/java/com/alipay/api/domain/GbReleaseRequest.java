package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 集团预算释放入参集合
 *
 * @author auto create
 * @since 1.0, 2021-08-06 10:17:49
 */
public class GbReleaseRequest extends AlipayObject {

	private static final long serialVersionUID = 8528343913915965952L;

	/**
	 * 释放金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 业务发生时间
	 */
	@ApiField("biz_date")
	private Date bizDate;

	/**
	 * 业务单据名称
	 */
	@ApiField("biz_name")
	private String bizName;

	/**
	 * 业务单据唯一id
	 */
	@ApiField("biz_uk_id")
	private String bizUkId;

	/**
	 * 预算适用类型 RESOURCE、ZK_COMMISSION
	 */
	@ApiField("budget_use_type")
	private String budgetUseType;

	/**
	 * 申请金额币种
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 集团预算编码
	 */
	@ApiField("group_budget_code")
	private String groupBudgetCode;

	/**
	 * 是否含税，true表示含税，false表示不含税，默认为true
	 */
	@ApiField("tax_included")
	private String taxIncluded;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public Date getBizDate() {
		return this.bizDate;
	}
	public void setBizDate(Date bizDate) {
		this.bizDate = bizDate;
	}

	public String getBizName() {
		return this.bizName;
	}
	public void setBizName(String bizName) {
		this.bizName = bizName;
	}

	public String getBizUkId() {
		return this.bizUkId;
	}
	public void setBizUkId(String bizUkId) {
		this.bizUkId = bizUkId;
	}

	public String getBudgetUseType() {
		return this.budgetUseType;
	}
	public void setBudgetUseType(String budgetUseType) {
		this.budgetUseType = budgetUseType;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getGroupBudgetCode() {
		return this.groupBudgetCode;
	}
	public void setGroupBudgetCode(String groupBudgetCode) {
		this.groupBudgetCode = groupBudgetCode;
	}

	public String getTaxIncluded() {
		return this.taxIncluded;
	}
	public void setTaxIncluded(String taxIncluded) {
		this.taxIncluded = taxIncluded;
	}

}
