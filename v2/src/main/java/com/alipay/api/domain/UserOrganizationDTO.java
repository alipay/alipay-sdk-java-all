package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * UserOrganizationDTO
 *
 * @author auto create
 * @since 1.0, 2023-09-14 14:47:43
 */
public class UserOrganizationDTO extends AlipayObject {

	private static final long serialVersionUID = 6651839458121165954L;

	/**
	 * 实体id
	 */
	@ApiField("entity_id")
	private String entityId;

	/**
	 * 成员id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 维保校验状态
	 */
	@ApiField("ma_check_status")
	private Long maCheckStatus;

	/**
	 * 组织合同列表
	 */
	@ApiListField("org_contract_list")
	@ApiField("organization_contract_d_t_o")
	private List<OrganizationContractDTO> orgContractList;

	/**
	 * 组织id
	 */
	@ApiField("org_id")
	private String orgId;

	/**
	 * 组织名
	 */
	@ApiField("org_name")
	private String orgName;

	/**
	 * 角色
	 */
	@ApiField("role_type")
	private String roleType;

	/**
	 * 子组织列表
	 */
	@ApiListField("user_sub_org_list")
	@ApiField("user_sub_organization_d_t_o")
	private List<UserSubOrganizationDTO> userSubOrgList;

	/**
	 * 工单权限
	 */
	@ApiField("work_order_permission")
	private Boolean workOrderPermission;

	public String getEntityId() {
		return this.entityId;
	}
	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public Long getMaCheckStatus() {
		return this.maCheckStatus;
	}
	public void setMaCheckStatus(Long maCheckStatus) {
		this.maCheckStatus = maCheckStatus;
	}

	public List<OrganizationContractDTO> getOrgContractList() {
		return this.orgContractList;
	}
	public void setOrgContractList(List<OrganizationContractDTO> orgContractList) {
		this.orgContractList = orgContractList;
	}

	public String getOrgId() {
		return this.orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getOrgName() {
		return this.orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getRoleType() {
		return this.roleType;
	}
	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

	public List<UserSubOrganizationDTO> getUserSubOrgList() {
		return this.userSubOrgList;
	}
	public void setUserSubOrgList(List<UserSubOrganizationDTO> userSubOrgList) {
		this.userSubOrgList = userSubOrgList;
	}

	public Boolean getWorkOrderPermission() {
		return this.workOrderPermission;
	}
	public void setWorkOrderPermission(Boolean workOrderPermission) {
		this.workOrderPermission = workOrderPermission;
	}

}
