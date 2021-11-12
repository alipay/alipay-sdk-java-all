package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑商家中心员工管理的部门组织对象
 *
 * @author auto create
 * @since 1.0, 2018-05-31 20:28:57
 */
public class DepartmentDTO extends AlipayObject {

	private static final long serialVersionUID = 1248665983167313598L;

	/**
	 * 业务类型KOUBEI_OPERATOR
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 部门组织id
	 */
	@ApiField("dept_id")
	private String deptId;

	/**
	 * 组织树部门名称
	 */
	@ApiField("dept_name")
	private String deptName;

	/**
	 * 组织部门树
	 */
	@ApiField("dept_path")
	private String deptPath;

	/**
	 * 人员组织场景的部门标签码
	 */
	@ApiField("label_code")
	private String labelCode;

	/**
	 * 人员组织场景的部门标签名称
	 */
	@ApiField("label_name")
	private String labelName;

	/**
	 * 上级组织部门id
	 */
	@ApiField("parent_dept_id")
	private String parentDeptId;

	/**
	 * 门店id，只有叶子节点部门才有shop_id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 组织部门类型(5为非叶子部门，6为叶子部门)
	 */
	@ApiField("type")
	private String type;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
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

	public String getDeptPath() {
		return this.deptPath;
	}
	public void setDeptPath(String deptPath) {
		this.deptPath = deptPath;
	}

	public String getLabelCode() {
		return this.labelCode;
	}
	public void setLabelCode(String labelCode) {
		this.labelCode = labelCode;
	}

	public String getLabelName() {
		return this.labelName;
	}
	public void setLabelName(String labelName) {
		this.labelName = labelName;
	}

	public String getParentDeptId() {
		return this.parentDeptId;
	}
	public void setParentDeptId(String parentDeptId) {
		this.parentDeptId = parentDeptId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
