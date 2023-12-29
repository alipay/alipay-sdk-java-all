package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.discount.budget.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 01:41:45
 */
public class AlipayMarketingCampaignDiscountBudgetQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2797248472521366555L;

	/** 
	 * 预算ID
	 */
	@ApiField("budget_id")
	private String budgetId;

	/** 
	 * 预算剩余冻结金额(元)
	 */
	@ApiField("freeze_amount")
	private String freezeAmount;

	/** 
	 * 预算已回收退回保证金账户金额(元)
	 */
	@ApiField("recycle_amount")
	private String recycleAmount;

	/** 
	 * 交易已退款金额(元)
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/** 
	 * 预算总金额(元)
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 交易已使用金额(元)
	 */
	@ApiField("used_amount")
	private String usedAmount;

	public void setBudgetId(String budgetId) {
		this.budgetId = budgetId;
	}
	public String getBudgetId( ) {
		return this.budgetId;
	}

	public void setFreezeAmount(String freezeAmount) {
		this.freezeAmount = freezeAmount;
	}
	public String getFreezeAmount( ) {
		return this.freezeAmount;
	}

	public void setRecycleAmount(String recycleAmount) {
		this.recycleAmount = recycleAmount;
	}
	public String getRecycleAmount( ) {
		return this.recycleAmount;
	}

	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}
	public String getRefundAmount( ) {
		return this.refundAmount;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getTotalAmount( ) {
		return this.totalAmount;
	}

	public void setUsedAmount(String usedAmount) {
		this.usedAmount = usedAmount;
	}
	public String getUsedAmount( ) {
		return this.usedAmount;
	}

}
