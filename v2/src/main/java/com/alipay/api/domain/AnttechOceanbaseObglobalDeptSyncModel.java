package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * crm部门信息同步海图
 *
 * @author auto create
 * @since 1.0, 2026-02-11 10:42:43
 */
public class AnttechOceanbaseObglobalDeptSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6352956683146174632L;

	/**
	 * 部门名称
	 */
	@ApiField("dept_name")
	private String deptName;

	/**
	 * 部门编码
	 */
	@ApiField("dept_no")
	private String deptNo;

	/**
	 * 部门负责人工号
	 */
	@ApiField("master_work_no")
	private String masterWorkNo;

	/**
	 * 上级部门id
	 */
	@ApiField("parent_dept_id")
	private String parentDeptId;

	/**
	 * 部门id层级路径
	 */
	@ApiField("parent_path")
	private String parentPath;

	/**
	 * 部门状态
	 */
	@ApiField("status")
	private String status;

	public String getDeptName() {
		return this.deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptNo() {
		return this.deptNo;
	}
	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}

	public String getMasterWorkNo() {
		return this.masterWorkNo;
	}
	public void setMasterWorkNo(String masterWorkNo) {
		this.masterWorkNo = masterWorkNo;
	}

	public String getParentDeptId() {
		return this.parentDeptId;
	}
	public void setParentDeptId(String parentDeptId) {
		this.parentDeptId = parentDeptId;
	}

	public String getParentPath() {
		return this.parentPath;
	}
	public void setParentPath(String parentPath) {
		this.parentPath = parentPath;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
