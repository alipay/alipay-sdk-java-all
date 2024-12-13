package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建商户部门信息
 *
 * @author auto create
 * @since 1.0, 2022-06-17 16:46:23
 */
public class KoubeiMerchantDepartmentCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5488458389849152354L;

	/**
	 * isv回传的auth_code，通过auth_code校验当前操作人与商户的关系
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 员工管理场景下的商户部门名称，根目录为商户名称，下属部门由商户自己创建，例如可以创建下属部门为“华东大区”
	 */
	@ApiField("dept_name")
	private String deptName;

	/**
	 * 组织部门标签，现在有PROCESSING_ROOM, DELIVER_CENTRE, CENTRAL_KITCHEN三种
	 */
	@ApiField("label_code")
	private String labelCode;

	/**
	 * 当前需要创建部门的上级部门id
	 */
	@ApiField("parent_dept_id")
	private String parentDeptId;

	public String getAuthCode() {
		return this.authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
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
