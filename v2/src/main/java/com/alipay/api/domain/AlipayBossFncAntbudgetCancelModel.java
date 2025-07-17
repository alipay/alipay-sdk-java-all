package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预算申请撤销
 *
 * @author auto create
 * @since 1.0, 2022-05-19 14:26:40
 */
public class AlipayBossFncAntbudgetCancelModel extends AlipayObject {

	private static final long serialVersionUID = 4682522788192519218L;

	/**
	 * 业务预算申请code
	 */
	@ApiField("biz_budget_apply_code")
	private String bizBudgetApplyCode;

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

}
