package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预算释放
 *
 * @author auto create
 * @since 1.0, 2020-09-25 15:34:20
 */
public class AlipayBossFncAntbudgetReturnModel extends AlipayObject {

	private static final long serialVersionUID = 7688265698123956427L;

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
	 * * COMMISSION: 返佣 * PURCHASE: 采购 * PROMO: 营销
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 业务活动唯一id,用于幂等,与biz_type一起组成幂等索引，不可重复
	 */
	@ApiField("biz_uk_id")
	private String bizUkId;

	/**
	 * 幂等字段
	 */
	@ApiField("idempotent_id")
	private String idempotentId;

	/**
	 * 退回类型 
BIZ_RETURN, 业务活动预算退回
     *
     *     BIZ_EXPIRE_RETURN, 业务活动预算过期退回
	 */
	@ApiField("modify_type")
	private String modifyType;

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

}
