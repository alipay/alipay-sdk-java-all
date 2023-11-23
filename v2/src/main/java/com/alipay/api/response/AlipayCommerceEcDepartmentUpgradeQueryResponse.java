package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.department.upgrade.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-01 10:31:49
 */
public class AlipayCommerceEcDepartmentUpgradeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1428225846876978649L;

	/** 
	 * 待升级的部门id
	 */
	@ApiField("department_id")
	private String departmentId;

	/** 
	 * 主企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/** 
	 * 升级工单id
	 */
	@ApiField("process_id")
	private String processId;

	/** 
	 * 子企业签约因公付链接
	 */
	@ApiField("sign_url")
	private String signUrl;

	/** 
	 * 升级工单的状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 子企业共同账户id
	 */
	@ApiField("sub_account_id")
	private String subAccountId;

	/** 
	 * 子企业id
	 */
	@ApiField("sub_enterprise_id")
	private String subEnterpriseId;

	/** 
	 * 子企业企业名称
	 */
	@ApiField("sub_enterprise_name")
	private String subEnterpriseName;

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentId( ) {
		return this.departmentId;
	}

	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}
	public String getEnterpriseId( ) {
		return this.enterpriseId;
	}

	public void setProcessId(String processId) {
		this.processId = processId;
	}
	public String getProcessId( ) {
		return this.processId;
	}

	public void setSignUrl(String signUrl) {
		this.signUrl = signUrl;
	}
	public String getSignUrl( ) {
		return this.signUrl;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setSubAccountId(String subAccountId) {
		this.subAccountId = subAccountId;
	}
	public String getSubAccountId( ) {
		return this.subAccountId;
	}

	public void setSubEnterpriseId(String subEnterpriseId) {
		this.subEnterpriseId = subEnterpriseId;
	}
	public String getSubEnterpriseId( ) {
		return this.subEnterpriseId;
	}

	public void setSubEnterpriseName(String subEnterpriseName) {
		this.subEnterpriseName = subEnterpriseName;
	}
	public String getSubEnterpriseName( ) {
		return this.subEnterpriseName;
	}

}
