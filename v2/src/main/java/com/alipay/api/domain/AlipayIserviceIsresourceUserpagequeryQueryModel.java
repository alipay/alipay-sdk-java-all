package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 用户信息分页查询
 *
 * @author auto create
 * @since 1.0, 2023-07-10 10:03:55
 */
public class AlipayIserviceIsresourceUserpagequeryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3653583176542718233L;

	/**
	 * antbuserviceid
	 */
	@ApiField("busvc_id")
	private String busvcId;

	/**
	 * 旧平台用户id列表
	 */
	@ApiListField("clv_user_ids")
	@ApiField("number")
	private List<Long> clvUserIds;

	/**
	 * 用工类型code
	 */
	@ApiField("employee_type_code")
	private String employeeTypeCode;

	/**
	 * 用户名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 组织节点id
	 */
	@ApiField("org_node_id")
	private String orgNodeId;

	/**
	 * 页码
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 分页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 是否查询关联账户信息
	 */
	@ApiField("query_ref_account")
	private Boolean queryRefAccount;

	/**
	 * 是否查询角色信息
	 */
	@ApiField("query_role")
	private Boolean queryRole;

	/**
	 * 技能组id
	 */
	@ApiField("skill_group_id")
	private String skillGroupId;

	/**
	 * 租户id
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	public String getBusvcId() {
		return this.busvcId;
	}
	public void setBusvcId(String busvcId) {
		this.busvcId = busvcId;
	}

	public List<Long> getClvUserIds() {
		return this.clvUserIds;
	}
	public void setClvUserIds(List<Long> clvUserIds) {
		this.clvUserIds = clvUserIds;
	}

	public String getEmployeeTypeCode() {
		return this.employeeTypeCode;
	}
	public void setEmployeeTypeCode(String employeeTypeCode) {
		this.employeeTypeCode = employeeTypeCode;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOrgNodeId() {
		return this.orgNodeId;
	}
	public void setOrgNodeId(String orgNodeId) {
		this.orgNodeId = orgNodeId;
	}

	public Long getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Boolean getQueryRefAccount() {
		return this.queryRefAccount;
	}
	public void setQueryRefAccount(Boolean queryRefAccount) {
		this.queryRefAccount = queryRefAccount;
	}

	public Boolean getQueryRole() {
		return this.queryRole;
	}
	public void setQueryRole(Boolean queryRole) {
		this.queryRole = queryRole;
	}

	public String getSkillGroupId() {
		return this.skillGroupId;
	}
	public void setSkillGroupId(String skillGroupId) {
		this.skillGroupId = skillGroupId;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

}
