package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 用户信息
 *
 * @author auto create
 * @since 1.0, 2023-10-18 11:35:03
 */
public class OpenApiUserInfo extends AlipayObject {

	private static final long serialVersionUID = 5367164432421529193L;

	/**
	 * 旧平台用户id
	 */
	@ApiField("clv_user_id")
	private String clvUserId;

	/**
	 * 用工类型code
	 */
	@ApiField("employee_code")
	private String employeeCode;

	/**
	 * 花名
	 */
	@ApiField("nick_name")
	private String nickName;

	/**
	 * 用户组织信息
	 */
	@ApiListField("org_nodes")
	@ApiField("open_api_organization_node_info")
	private List<OpenApiOrganizationNodeInfo> orgNodes;

	/**
	 * 用户风险等级
	 */
	@ApiField("risk_level")
	private String riskLevel;

	/**
	 * 用户角色信息
	 */
	@ApiListField("roles")
	@ApiField("open_api_role_info")
	private List<OpenApiRoleInfo> roles;

	/**
	 * 用户技能组信息
	 */
	@ApiListField("skill_groups")
	@ApiField("open_api_skill_group_info")
	private List<OpenApiSkillGroupInfo> skillGroups;

	/**
	 * 租户id
	 */
	@ApiField("tnt_tnst_id")
	private String tntTnstId;

	/**
	 * 星云用户id
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户资源信息
	 */
	@ApiField("user_resource_info")
	private OpenApiUserResourceInfo userResourceInfo;

	/**
	 * 用户服务信息
	 */
	@ApiField("user_serve_info")
	private OpenApiUserServeInfo userServeInfo;

	/**
	 * 工作状态
	 */
	@ApiField("work_status")
	private String workStatus;

	public String getClvUserId() {
		return this.clvUserId;
	}
	public void setClvUserId(String clvUserId) {
		this.clvUserId = clvUserId;
	}

	public String getEmployeeCode() {
		return this.employeeCode;
	}
	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}

	public String getNickName() {
		return this.nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public List<OpenApiOrganizationNodeInfo> getOrgNodes() {
		return this.orgNodes;
	}
	public void setOrgNodes(List<OpenApiOrganizationNodeInfo> orgNodes) {
		this.orgNodes = orgNodes;
	}

	public String getRiskLevel() {
		return this.riskLevel;
	}
	public void setRiskLevel(String riskLevel) {
		this.riskLevel = riskLevel;
	}

	public List<OpenApiRoleInfo> getRoles() {
		return this.roles;
	}
	public void setRoles(List<OpenApiRoleInfo> roles) {
		this.roles = roles;
	}

	public List<OpenApiSkillGroupInfo> getSkillGroups() {
		return this.skillGroups;
	}
	public void setSkillGroups(List<OpenApiSkillGroupInfo> skillGroups) {
		this.skillGroups = skillGroups;
	}

	public String getTntTnstId() {
		return this.tntTnstId;
	}
	public void setTntTnstId(String tntTnstId) {
		this.tntTnstId = tntTnstId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public OpenApiUserResourceInfo getUserResourceInfo() {
		return this.userResourceInfo;
	}
	public void setUserResourceInfo(OpenApiUserResourceInfo userResourceInfo) {
		this.userResourceInfo = userResourceInfo;
	}

	public OpenApiUserServeInfo getUserServeInfo() {
		return this.userServeInfo;
	}
	public void setUserServeInfo(OpenApiUserServeInfo userServeInfo) {
		this.userServeInfo = userServeInfo;
	}

	public String getWorkStatus() {
		return this.workStatus;
	}
	public void setWorkStatus(String workStatus) {
		this.workStatus = workStatus;
	}

}
