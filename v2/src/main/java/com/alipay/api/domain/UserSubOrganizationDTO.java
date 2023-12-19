package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * UserSubOrganizationDTO
 *
 * @author auto create
 * @since 1.0, 2023-09-14 14:46:04
 */
public class UserSubOrganizationDTO extends AlipayObject {

	private static final long serialVersionUID = 4325616375422815694L;

	/**
	 * 成员id
	 */
	@ApiField("id")
	private String id;

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

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
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

}
