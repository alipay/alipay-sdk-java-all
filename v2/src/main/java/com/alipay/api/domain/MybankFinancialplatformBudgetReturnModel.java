package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 网商预算释放
 *
 * @author auto create
 * @since 1.0, 2023-02-08 12:43:48
 */
public class MybankFinancialplatformBudgetReturnModel extends AlipayObject {

	private static final long serialVersionUID = 3117385998657473594L;

	/**
	 * 预算申请金额，默认为人民币
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 业务预算申请code
	 */
	@ApiField("biz_budget_apply_code")
	private String bizBudgetApplyCode;

	/**
	 * 采购：PURCHASE
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 业务活动唯一id,用于幂等,与biz_type一起组成幂等索引，不可重复
	 */
	@ApiField("biz_uk_id")
	private String bizUkId;

	/**
	 * 币种，默认156
	 */
	@ApiField("currency_code")
	private String currencyCode;

	/**
	 * 幂等字段
	 */
	@ApiField("idempotent_id")
	private String idempotentId;

	/**
	 * 退回类型 BIZ_RETURN, 业务活动预算退回 * * BIZ_EXPIRE_RETURN, 业务活动预算过期退回
	 */
	@ApiField("modify_type")
	private String modifyType;

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

	public String getBizBudgetApplyCode() {
		return this.bizBudgetApplyCode;
	}
	public void setBizBudgetApplyCode(String bizBudgetApplyCode) {
		this.bizBudgetApplyCode = bizBudgetApplyCode;
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

	public String getIdempotentId() {
		return this.idempotentId;
	}
	public void setIdempotentId(String idempotentId) {
		this.idempotentId = idempotentId;
	}

	public String getModifyType() {
		return this.modifyType;
	}
	public void setModifyType(String modifyType) {
		this.modifyType = modifyType;
	}

	public String getTimeZone() {
		return this.timeZone;
	}
	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

}
