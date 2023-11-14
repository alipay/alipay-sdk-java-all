package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 计划详情
 *
 * @author auto create
 * @since 1.0, 2019-10-21 19:13:56
 */
public class OuterPlan extends AlipayObject {

	private static final long serialVersionUID = 4688953462517373573L;

	/**
	 * 日预算，单位：分
	 */
	@ApiField("budget")
	private Long budget;

	/**
	 * 日预算状态：
ENOUGH-未花完
OVER-已花完
	 */
	@ApiField("budget_over_status")
	private String budgetOverStatus;

	/**
	 * 计费方式：
CPC-按点击付费
CPM-按展示次数付费
CPD-按投放天数计费（包段）
	 */
	@ApiField("charge_type")
	private String chargeType;

	/**
	 * 投放结束时间：yyyy-MM-dd
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 业务扩展参数字段，根据第三方需要使用，投放端只做存储并向检索端透传
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/**
	 * 计划编号
	 */
	@ApiField("plan_id")
	private Long planId;

	/**
	 * 计划名称
	 */
	@ApiField("plan_name")
	private String planName;

	/**
	 * 外部计划唯一编号
	 */
	@ApiField("plan_outer_id")
	private String planOuterId;

	/**
	 * 计划状态：
PLAN_EFFECTIVE-有效
PLAN_PAUSE-暂停
PLAN_DELETE-删除
PLAN_NOT_BEGIN-未开始
PLAN_END-已结束
PLAN_DISABLE-失效
	 */
	@ApiField("plan_status")
	private String planStatus;

	/**
	 * 广告投放商家id，来自投放商户创建或者修改接口的响应
	 */
	@ApiField("principal_id")
	private Long principalId;

	/**
	 * 售卖方式：
GD-保量投放
RTB-竞价交易
	 */
	@ApiField("sell_mode")
	private String sellMode;

	/**
	 * 投放开始时间：yyyy-MM-dd
	 */
	@ApiField("start_date")
	private String startDate;

	/**
	 * 投放时段配置，bitmap。规则：7个int用「,」分隔组成的字符串；每个int中第0位表示0点，第1位表示1点。如此类推; 7个int的排序是星期日、星期一、星期二、星期三、星期四、星期五、星期六
	 */
	@ApiField("time_schema")
	private String timeSchema;

	/**
	 * 广告投放账户id，来自投放账户开户接口的响应
	 */
	@ApiField("user_id")
	private Long userId;

	public Long getBudget() {
		return this.budget;
	}
	public void setBudget(Long budget) {
		this.budget = budget;
	}

	public String getBudgetOverStatus() {
		return this.budgetOverStatus;
	}
	public void setBudgetOverStatus(String budgetOverStatus) {
		this.budgetOverStatus = budgetOverStatus;
	}

	public String getChargeType() {
		return this.chargeType;
	}
	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
	}

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getExtendInfo() {
		return this.extendInfo;
	}
	public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
	}

	public Long getPlanId() {
		return this.planId;
	}
	public void setPlanId(Long planId) {
		this.planId = planId;
	}

	public String getPlanName() {
		return this.planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getPlanOuterId() {
		return this.planOuterId;
	}
	public void setPlanOuterId(String planOuterId) {
		this.planOuterId = planOuterId;
	}

	public String getPlanStatus() {
		return this.planStatus;
	}
	public void setPlanStatus(String planStatus) {
		this.planStatus = planStatus;
	}

	public Long getPrincipalId() {
		return this.principalId;
	}
	public void setPrincipalId(Long principalId) {
		this.principalId = principalId;
	}

	public String getSellMode() {
		return this.sellMode;
	}
	public void setSellMode(String sellMode) {
		this.sellMode = sellMode;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getTimeSchema() {
		return this.timeSchema;
	}
	public void setTimeSchema(String timeSchema) {
		this.timeSchema = timeSchema;
	}

	public Long getUserId() {
		return this.userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}

}
