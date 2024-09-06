package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.discount.info.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-03 16:06:54
 */
public class AlipayMarketingCampaignDiscountInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6786198348262717453L;

	/** 
	 * 代理人
	 */
	@ApiListField("agents")
	@ApiField("string")
	private List<String> agents;

	/** 
	 * 预警阀值信息
	 */
	@ApiListField("alert_detail_list")
	@ApiField("number")
	private List<Long> alertDetailList;

	/** 
	 * 预警接收人
	 */
	@ApiListField("alert_users")
	@ApiField("string")
	private List<String> alertUsers;

	/** 
	 * 总预算金额(元)
	 */
	@ApiField("budget_amount")
	private String budgetAmount;

	/** 
	 * 创建人姓名
	 */
	@ApiField("creator")
	private String creator;

	/** 
	 * 活动描述
	 */
	@ApiField("discount_desc")
	private String discountDesc;

	/** 
	 * 活动Id
	 */
	@ApiField("discount_id")
	private String discountId;

	/** 
	 * 立减活动名称
	 */
	@ApiField("discount_name")
	private String discountName;

	/** 
	 * 活动结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/** 
	 * 需求方
	 */
	@ApiField("owner")
	private String owner;

	/** 
	 * 活动的定价策略
	 */
	@ApiField("price_calc_type")
	private String priceCalcType;

	/** 
	 * 剩余预算(元)
	 */
	@ApiField("remaining_budget_amount")
	private String remainingBudgetAmount;

	/** 
	 * 活动开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/** 
	 * 状态信息
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 已使用预算金额(元)
	 */
	@ApiField("used_budget_amount")
	private String usedBudgetAmount;

	public void setAgents(List<String> agents) {
		this.agents = agents;
	}
	public List<String> getAgents( ) {
		return this.agents;
	}

	public void setAlertDetailList(List<Long> alertDetailList) {
		this.alertDetailList = alertDetailList;
	}
	public List<Long> getAlertDetailList( ) {
		return this.alertDetailList;
	}

	public void setAlertUsers(List<String> alertUsers) {
		this.alertUsers = alertUsers;
	}
	public List<String> getAlertUsers( ) {
		return this.alertUsers;
	}

	public void setBudgetAmount(String budgetAmount) {
		this.budgetAmount = budgetAmount;
	}
	public String getBudgetAmount( ) {
		return this.budgetAmount;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}
	public String getCreator( ) {
		return this.creator;
	}

	public void setDiscountDesc(String discountDesc) {
		this.discountDesc = discountDesc;
	}
	public String getDiscountDesc( ) {
		return this.discountDesc;
	}

	public void setDiscountId(String discountId) {
		this.discountId = discountId;
	}
	public String getDiscountId( ) {
		return this.discountId;
	}

	public void setDiscountName(String discountName) {
		this.discountName = discountName;
	}
	public String getDiscountName( ) {
		return this.discountName;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public Date getEndTime( ) {
		return this.endTime;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getOwner( ) {
		return this.owner;
	}

	public void setPriceCalcType(String priceCalcType) {
		this.priceCalcType = priceCalcType;
	}
	public String getPriceCalcType( ) {
		return this.priceCalcType;
	}

	public void setRemainingBudgetAmount(String remainingBudgetAmount) {
		this.remainingBudgetAmount = remainingBudgetAmount;
	}
	public String getRemainingBudgetAmount( ) {
		return this.remainingBudgetAmount;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getStartTime( ) {
		return this.startTime;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setUsedBudgetAmount(String usedBudgetAmount) {
		this.usedBudgetAmount = usedBudgetAmount;
	}
	public String getUsedBudgetAmount( ) {
		return this.usedBudgetAmount;
	}

}
