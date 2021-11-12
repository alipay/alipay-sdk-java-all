package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户部门信息修改
 *
 * @author auto create
 * @since 1.0, 2021-10-27 14:05:11
 */
public class KoubeiMerchantDepartmentModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1588442723879974825L;

	/**
	 * isv回传的auth_code，通过auth_code校验当前操作人与商户的关系
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 商户部门id
	 */
	@ApiField("dept_id")
	private String deptId;

	/**
	 * 商户创建的部门名称，可以修改
	 */
	@ApiField("dept_name")
	private String deptName;

	/**
	 * 人员组织场景，组织部门属性标签，现在支持PROCESSING_ROOM, DELIVER_CENTRE, CENTRAL_KITCHEN三种
	 */
	@ApiField("label_code")
	private String labelCode;

	/**
	 * 当前部门对应的上级部门id
	 */
	@ApiField("parent_dept_id")
	private String parentDeptId;

	public String getAuthCode() {
		return this.authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public String getDeptId() {
		return this.deptId;
	}
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return this.deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getLabelCode() {
		return this.labelCode;
	}
	public void setLabelCode(String labelCode) {
		this.labelCode = labelCode;
	}

	public String getParentDeptId() {
		return this.parentDeptId;
	}
	public void setParentDeptId(String parentDeptId) {
		this.parentDeptId = parentDeptId;
	}

}
