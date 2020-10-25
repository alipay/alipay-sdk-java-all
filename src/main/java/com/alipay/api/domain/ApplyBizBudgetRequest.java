package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业务活动预算申请Request
 *
 * @author auto create
 * @since 1.0, 2020-09-25 09:47:50
 */
public class ApplyBizBudgetRequest extends AlipayObject {

	private static final long serialVersionUID = 2392326378428279485L;

	/**
	 * 预算申请金额，人民币
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 假如，amount字段为100
APPEND: 增加，在原有基础上增加100
APPEND_TO:增加到，将原有基础增加到100
	 */
	@ApiField("amount_type")
	private String amountType;

	/**
	 * 业务预算申请code
	 */
	@ApiField("biz_budget_apply_code")
	private String bizBudgetApplyCode;

	/**
	 * 业务名称
	 */
	@ApiField("biz_name")
	private String bizName;

	/**
	 * * COMMISSION: 返佣 * PURCHASE: 采购 * PROMO: 营销
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 业务活动唯一id,用于幂等,与biz_type一起组成幂等索引，不可重复
	 */
	@ApiField("biz_uk_id")
	private String bizUkId;

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

}
