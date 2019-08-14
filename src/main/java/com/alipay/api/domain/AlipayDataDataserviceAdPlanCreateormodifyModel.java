package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建/修改计划
 *
 * @author auto create
 * @since 1.0, 2019-07-30 17:28:22
 */
public class AlipayDataDataserviceAdPlanCreateormodifyModel extends AlipayObject {

	private static final long serialVersionUID = 6787457992514478281L;

	/**
	 * 灯火平台提供给外部系统的访问token
	 */
	@ApiField("biz_token")
	private String bizToken;

	/**
	 * 日预算，单位：分
	 */
	@ApiField("budget")
	private Long budget;

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
	 * 计划名称
	 */
	@ApiField("plan_name")
	private String planName;

	/**
	 * 外部计划编号
	 */
	@ApiField("plan_outer_id")
	private String planOuterId;

	/**
	 * 商家id
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
	 * 投放时段配置，bitmap
	 */
	@ApiField("time_schema")
	private String timeSchema;

	/**
	 * 账户id
	 */
	@ApiField("user_id")
	private Long userId;

	public String getBizToken() {
		return this.bizToken;
	}
	public void setBizToken(String bizToken) {
		this.bizToken = bizToken;
	}

	public Long getBudget() {
		return this.budget;
	}
	public void setBudget(Long budget) {
		this.budget = budget;
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
