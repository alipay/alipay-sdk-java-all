package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 计划新增或修改
 *
 * @author auto create
 * @since 1.0, 2025-05-12 16:14:57
 */
public class AlipayDataDataserviceAdcampaignPlanCreateormodifyModel extends AlipayObject {

	private static final long serialVersionUID = 3493218159534952461L;

	/**
	 * 计划日预算，单位元【人民币】
	 */
	@ApiField("budget")
	private String budget;

	/**
	 * 计划结束投放日期，格式为yyyy-MM-dd，新增或者编辑时有改动必须大于等于今天；结束日期必须大于等于开始日期
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 营销目标参数code
	 */
	@ApiField("market_target_code")
	private String marketTargetCode;

	/**
	 * 计划id
	 */
	@ApiField("plan_id")
	private Long planId;

	/**
	 * 计划名称
	 */
	@ApiField("plan_name")
	private String planName;

	/**
	 * ON：不限日预算开启
OFF：开启计划日预算（计划日预算字段必填）
	 */
	@ApiField("plan_unlimited_budget_switch")
	private String planUnlimitedBudgetSwitch;

	/**
	 * 商家标志,唯一值,在广告投放平台商家详情获取
	 */
	@ApiField("principal_tag")
	private String principalTag;

	/**
	 * 计划开始投放日期，格式为yyyy-MM-dd，新增或者编辑时有改动必须大于等于今天
	 */
	@ApiField("start_date")
	private String startDate;

	/**
	 * 如果是全时段投放，本参数无需传参。
如果指定投放时段，本参数必填，格式为24*7位字符串，且都为 0 和 1，以单小时为最小粒度。按日,一,二,……,六排列。单日内按23,22,21,……3,2,1,0排列。0为不投放，1 为投放，全传 1 视为全时段投放，不允许全部传 0。日维度采用“,”分隔。
	 */
	@ApiField("time_schema")
	private String timeSchema;

	public String getBudget() {
		return this.budget;
	}
	public void setBudget(String budget) {
		this.budget = budget;
	}

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getMarketTargetCode() {
		return this.marketTargetCode;
	}
	public void setMarketTargetCode(String marketTargetCode) {
		this.marketTargetCode = marketTargetCode;
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

	public String getPlanUnlimitedBudgetSwitch() {
		return this.planUnlimitedBudgetSwitch;
	}
	public void setPlanUnlimitedBudgetSwitch(String planUnlimitedBudgetSwitch) {
		this.planUnlimitedBudgetSwitch = planUnlimitedBudgetSwitch;
	}

	public String getPrincipalTag() {
		return this.principalTag;
	}
	public void setPrincipalTag(String principalTag) {
		this.principalTag = principalTag;
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

}
