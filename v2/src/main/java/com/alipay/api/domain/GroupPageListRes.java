package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 单元分页返回对象
 *
 * @author auto create
 * @since 1.0, 2025-07-15 19:27:42
 */
public class GroupPageListRes extends AlipayObject {

	private static final long serialVersionUID = 1731889429791296144L;

	/**
	 * 单元出价类型
	 */
	@ApiField("bid_type")
	private String bidType;

	/**
	 * 起量预算。单位：元【人民币】；没有使用一键起量时，此值为空
	 */
	@ApiField("boost_budget")
	private String boostBudget;

	/**
	 * 起量结束时间
	 */
	@ApiField("boost_end_date")
	private Date boostEndDate;

	/**
	 * 起量id
	 */
	@ApiField("boost_id")
	private Long boostId;

	/**
	 * 起量开始时间
	 */
	@ApiField("boost_start_date")
	private Date boostStartDate;

	/**
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 单元日预算。单位：元【人民币】如果是不限单元日预算，此值为空
	 */
	@ApiField("group_budget")
	private String groupBudget;

	/**
	 * 单次出价。单位：元【人民币】
	 */
	@ApiField("group_charge")
	private String groupCharge;

	/**
	 * 单元id
	 */
	@ApiField("group_id")
	private Long groupId;

	/**
	 * 单元名称
	 */
	@ApiField("group_name")
	private String groupName;

	/**
	 * 单元状态
	 */
	@ApiField("group_status")
	private String groupStatus;

	/**
	 * 二级营销目标code
	 */
	@ApiField("market_target_code")
	private String marketTargetCode;

	/**
	 * 二级营销目标名称
	 */
	@ApiField("market_target_name")
	private String marketTargetName;

	/**
	 * 起量状态
	 */
	@ApiField("one_boost_status")
	private String oneBoostStatus;

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
	 * 商家id
	 */
	@ApiField("principal_id")
	private Long principalId;

	/**
	 * 场景code
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 转化目标成本。单位：元【人民币】
	 */
	@ApiField("target_cpa")
	private String targetCpa;

	/**
	 * 目标ROI，单位【元】，人民币。 bidType= ROI时候必填
	 */
	@ApiField("target_roi")
	private String targetRoi;

	public String getBidType() {
		return this.bidType;
	}
	public void setBidType(String bidType) {
		this.bidType = bidType;
	}

	public String getBoostBudget() {
		return this.boostBudget;
	}
	public void setBoostBudget(String boostBudget) {
		this.boostBudget = boostBudget;
	}

	public Date getBoostEndDate() {
		return this.boostEndDate;
	}
	public void setBoostEndDate(Date boostEndDate) {
		this.boostEndDate = boostEndDate;
	}

	public Long getBoostId() {
		return this.boostId;
	}
	public void setBoostId(Long boostId) {
		this.boostId = boostId;
	}

	public Date getBoostStartDate() {
		return this.boostStartDate;
	}
	public void setBoostStartDate(Date boostStartDate) {
		this.boostStartDate = boostStartDate;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getGroupBudget() {
		return this.groupBudget;
	}
	public void setGroupBudget(String groupBudget) {
		this.groupBudget = groupBudget;
	}

	public String getGroupCharge() {
		return this.groupCharge;
	}
	public void setGroupCharge(String groupCharge) {
		this.groupCharge = groupCharge;
	}

	public Long getGroupId() {
		return this.groupId;
	}
	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return this.groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getGroupStatus() {
		return this.groupStatus;
	}
	public void setGroupStatus(String groupStatus) {
		this.groupStatus = groupStatus;
	}

	public String getMarketTargetCode() {
		return this.marketTargetCode;
	}
	public void setMarketTargetCode(String marketTargetCode) {
		this.marketTargetCode = marketTargetCode;
	}

	public String getMarketTargetName() {
		return this.marketTargetName;
	}
	public void setMarketTargetName(String marketTargetName) {
		this.marketTargetName = marketTargetName;
	}

	public String getOneBoostStatus() {
		return this.oneBoostStatus;
	}
	public void setOneBoostStatus(String oneBoostStatus) {
		this.oneBoostStatus = oneBoostStatus;
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

	public Long getPrincipalId() {
		return this.principalId;
	}
	public void setPrincipalId(Long principalId) {
		this.principalId = principalId;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getTargetCpa() {
		return this.targetCpa;
	}
	public void setTargetCpa(String targetCpa) {
		this.targetCpa = targetCpa;
	}

	public String getTargetRoi() {
		return this.targetRoi;
	}
	public void setTargetRoi(String targetRoi) {
		this.targetRoi = targetRoi;
	}

}
