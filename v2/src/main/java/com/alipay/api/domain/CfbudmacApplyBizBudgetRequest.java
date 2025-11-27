package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业务活动预算申请Request
 *
 * @author auto create
 * @since 1.0, 2023-01-11 14:55:15
 */
public class CfbudmacApplyBizBudgetRequest extends AlipayObject {

	private static final long serialVersionUID = 6615467958652255437L;

	/**
	 * 申请金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 假如，amount字段为100 APPEND: 增加，在原有基础上增加100 APPEND_TO:增加到，将原有基础增加到100
	 */
	@ApiField("amount_type")
	private String amountType;

	/**
	 * bba编码
	 */
	@ApiField("biz_budget_apply_code")
	private String bizBudgetApplyCode;

	/**
	 * 业务申请的时间，默认不填写为当前时间，填写后可以按照业务申请时间来进行预算申请有效期校验
	 */
	@ApiField("biz_date")
	private Date bizDate;

	/**
	 * 业务名称
	 */
	@ApiField("biz_name")
	private String bizName;

	/**
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 业务活动唯一id,用于幂等,与biz_type一起组成幂等索引，不可重复
	 */
	@ApiField("biz_uk_id")
	private String bizUkId;

	/**
	 * 币种编码，如果不填写，默认为156人民币
	 */
	@ApiField("currency_code")
	private String currencyCode;

	/**
	 * 时区
	 */
	@ApiField("time_zone")
	private String timeZone;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getAmountType() {
		return this.amountType;
	}
	public void setAmountType(String amountType) {
		this.amountType = amountType;
	}

	public String getBizBudgetApplyCode() {
		return this.bizBudgetApplyCode;
	}
	public void setBizBudgetApplyCode(String bizBudgetApplyCode) {
		this.bizBudgetApplyCode = bizBudgetApplyCode;
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

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getBizUkId() {
		return this.bizUkId;
	}
	public void setBizUkId(String bizUkId) {
		this.bizUkId = bizUkId;
	}

	public String getCurrencyCode() {
		return this.currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getTimeZone() {
		return this.timeZone;
	}
	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

}
