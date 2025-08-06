package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 *  创意分页返回对象
 *
 * @author auto create
 * @since 1.0, 2025-07-15 15:12:34
 */
public class CreativePageListRes extends AlipayObject {

	private static final long serialVersionUID = 1185438157427451668L;

	/**
	 * 创意id
	 */
	@ApiField("ad_id")
	private Long adId;

	/**
	 * 创意名称
	 */
	@ApiField("ad_name")
	private String adName;

	/**
	 * 审核拒绝文案，由审核方填充。
	 */
	@ApiField("audit_refuse_reason")
	private String auditRefuseReason;

	/**
	 * 创意业务状态 PARTIALLY_ENABLE 代表有效-部分审核不通过状态
	 */
	@ApiField("creative_biz_status")
	private String creativeBizStatus;

	/**
	 * 创意模版
	 */
	@ApiField("creative_type")
	private String creativeType;

	/**
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

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
	 * 处置理由
	 */
	@ApiField("punish_reason")
	private String punishReason;

	/**
	 * 审核拒绝扩展信息
	 */
	@ApiField("refuse_extend_info_res")
	private CreativeRefuseExtendInfoRes refuseExtendInfoRes;

	/**
	 * 创意处置。状态 0:正常,1:风控
	 */
	@ApiField("risk_status")
	private String riskStatus;

	/**
	 * 场景code
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 创意状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 创意模板ID
	 */
	@ApiField("template_id")
	private Long templateId;

	public Long getAdId() {
		return this.adId;
	}
	public void setAdId(Long adId) {
		this.adId = adId;
	}

	public String getAdName() {
		return this.adName;
	}
	public void setAdName(String adName) {
		this.adName = adName;
	}

	public String getAuditRefuseReason() {
		return this.auditRefuseReason;
	}
	public void setAuditRefuseReason(String auditRefuseReason) {
		this.auditRefuseReason = auditRefuseReason;
	}

	public String getCreativeBizStatus() {
		return this.creativeBizStatus;
	}
	public void setCreativeBizStatus(String creativeBizStatus) {
		this.creativeBizStatus = creativeBizStatus;
	}

	public String getCreativeType() {
		return this.creativeType;
	}
	public void setCreativeType(String creativeType) {
		this.creativeType = creativeType;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
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

	public String getPunishReason() {
		return this.punishReason;
	}
	public void setPunishReason(String punishReason) {
		this.punishReason = punishReason;
	}

	public CreativeRefuseExtendInfoRes getRefuseExtendInfoRes() {
		return this.refuseExtendInfoRes;
	}
	public void setRefuseExtendInfoRes(CreativeRefuseExtendInfoRes refuseExtendInfoRes) {
		this.refuseExtendInfoRes = refuseExtendInfoRes;
	}

	public String getRiskStatus() {
		return this.riskStatus;
	}
	public void setRiskStatus(String riskStatus) {
		this.riskStatus = riskStatus;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Long getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(Long templateId) {
		this.templateId = templateId;
	}

}
