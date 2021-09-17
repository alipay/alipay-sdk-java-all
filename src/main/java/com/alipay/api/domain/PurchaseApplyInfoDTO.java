package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 集团采购的活动预算请求对象
 *
 * @author auto create
 * @since 1.0, 2021-03-11 14:53:19
 */
public class PurchaseApplyInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 8243916389568162638L;

	/**
	 * 采购类目
	 */
	@ApiField("account_code")
	private String accountCode;

	/**
	 * 预算周期
	 */
	@ApiField("begin_cycle")
	private Date beginCycle;

	/**
	 * 活动预算申请code
	 */
	@ApiField("biz_budget_apply_code")
	private String bizBudgetApplyCode;

	/**
	 * 活动预算id
	 */
	@ApiField("biz_budget_id")
	private String bizBudgetId;

	/**
	 * 业务类型 COMMISSION("COMMISSION", "返佣"), PURCHASE("PURCHASE", "采购"), PROMO("PROMO", "营销"),
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * PERCENTAGE("PERCENTAGE", "出资占比"), ORDER("ORDER", "自定义顺序");
	 */
	@ApiField("budget_strategy")
	private String budgetStrategy;

	/**
	 * 币种
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 预算周期结束时间
	 */
	@ApiField("end_cycle")
	private Date endCycle;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 申请id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 活动预算池编码
	 */
	@ApiField("pool_code")
	private String poolCode;

	/**
	 * 剩余可用金额
	 */
	@ApiField("remain_amount")
	private String remainAmount;

	/**
	 * 状态：CONFIG，CONFIG_DONE，CHECK，ACTIVE，HISTORY，CLOSE，DISCARD，INACTIVE
	 */
	@ApiField("status")
	private String status;

	/**
	 * 采购用途
	 */
	@ApiField("use")
	private String use;

	public String getAccountCode() {
		return this.accountCode;
	}
	public void setAccountCode(String accountCode) {
		this.accountCode = accountCode;
	}

	public Date getBeginCycle() {
		return this.beginCycle;
	}
	public void setBeginCycle(Date beginCycle) {
		this.beginCycle = beginCycle;
	}

	public String getBizBudgetApplyCode() {
		return this.bizBudgetApplyCode;
	}
	public void setBizBudgetApplyCode(String bizBudgetApplyCode) {
		this.bizBudgetApplyCode = bizBudgetApplyCode;
	}

	public String getBizBudgetId() {
		return this.bizBudgetId;
	}
	public void setBizBudgetId(String bizBudgetId) {
		this.bizBudgetId = bizBudgetId;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getBudgetStrategy() {
		return this.budgetStrategy;
	}
	public void setBudgetStrategy(String budgetStrategy) {
		this.budgetStrategy = budgetStrategy;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Date getEndCycle() {
		return this.endCycle;
	}
	public void setEndCycle(Date endCycle) {
		this.endCycle = endCycle;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getPoolCode() {
		return this.poolCode;
	}
	public void setPoolCode(String poolCode) {
		this.poolCode = poolCode;
	}

	public String getRemainAmount() {
		return this.remainAmount;
	}
	public void setRemainAmount(String remainAmount) {
		this.remainAmount = remainAmount;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getUse() {
		return this.use;
	}
	public void setUse(String use) {
		this.use = use;
	}

}
