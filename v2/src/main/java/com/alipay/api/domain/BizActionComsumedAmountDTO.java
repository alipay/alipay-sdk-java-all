package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * BizActionComsumedAmountDTO
 *
 * @author auto create
 * @since 1.0, 2023-04-03 19:40:47
 */
public class BizActionComsumedAmountDTO extends AlipayObject {

	private static final long serialVersionUID = 1544775357922569676L;

	/**
	 * 业务预算申请Code
	 */
	@ApiField("biz_budget_apply_code")
	private String bizBudgetApplyCode;

	/**
	 * 外部系统bizUkId
	 */
	@ApiField("biz_uk_id")
	private String bizUkId;

	/**
	 * 占用金额
	 */
	@ApiField("consumed_amount")
	private String consumedAmount;

	public String getBizBudgetApplyCode() {
		return this.bizBudgetApplyCode;
	}
	public void setBizBudgetApplyCode(String bizBudgetApplyCode) {
		this.bizBudgetApplyCode = bizBudgetApplyCode;
	}

	public String getBizUkId() {
		return this.bizUkId;
	}
	public void setBizUkId(String bizUkId) {
		this.bizUkId = bizUkId;
	}

	public String getConsumedAmount() {
		return this.consumedAmount;
	}
	public void setConsumedAmount(String consumedAmount) {
		this.consumedAmount = consumedAmount;
	}

}
