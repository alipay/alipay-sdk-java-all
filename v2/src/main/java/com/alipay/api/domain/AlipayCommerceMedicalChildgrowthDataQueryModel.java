package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 儿童成长数据查询
 *
 * @author auto create
 * @since 1.0, 2026-07-21 19:27:52
 */
public class AlipayCommerceMedicalChildgrowthDataQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7342875133425387299L;

	/**
	 * 组织ID（租户隔离）
	 */
	@ApiField("agent_id")
	private String agentId;

	/**
	 * 数据类型，当前仅支持 CHILD_GROWTH
	 */
	@ApiField("data_type")
	private String dataType;

	/**
	 * 解读业务ID。传入时精确查询指定 AI 解读；为空时自动取最新成长记录的 recordBizId 作为解读业务ID
	 */
	@ApiField("interp_biz_id")
	private String interpBizId;

	/**
	 * 用户OPENID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 组织ID（租户隔离）
	 */
	@ApiField("org_id")
	private String orgId;

	/**
	 * 成员档案ID（指定要查询的儿童成员）
	 */
	@ApiField("profile_id")
	private String profileId;

	/**
	 * 记录查询截止日期，格式 yyyy-MM-dd（实现侧自动补全到当日 23:59:59）
	 */
	@ApiField("record_end_date")
	private String recordEndDate;

	/**
	 * 记录查询起始日期，格式 yyyy-MM-dd
	 */
	@ApiField("record_start_date")
	private String recordStartDate;

	/**
	 * 用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getAgentId() {
		return this.agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getDataType() {
		return this.dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getInterpBizId() {
		return this.interpBizId;
	}
	public void setInterpBizId(String interpBizId) {
		this.interpBizId = interpBizId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrgId() {
		return this.orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getProfileId() {
		return this.profileId;
	}
	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}

	public String getRecordEndDate() {
		return this.recordEndDate;
	}
	public void setRecordEndDate(String recordEndDate) {
		this.recordEndDate = recordEndDate;
	}

	public String getRecordStartDate() {
		return this.recordStartDate;
	}
	public void setRecordStartDate(String recordStartDate) {
		this.recordStartDate = recordStartDate;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
