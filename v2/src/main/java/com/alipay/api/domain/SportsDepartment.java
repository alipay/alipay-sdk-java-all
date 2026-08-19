package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-08-11 11:47:51
 */
public class SportsDepartment extends AlipayObject {

	private static final long serialVersionUID = 8667655166466926568L;

	/**
	 * 部门主键编码
	 */
	@ApiField("department_code")
	private String departmentCode;

	/**
	 * 是否叶子节点
	 */
	@ApiField("leaf")
	private Boolean leaf;

	/**
	 * 部门层级
	 */
	@ApiField("level")
	private Long level;

	/**
	 * 部门名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 父级部门code
	 */
	@ApiField("parent_code")
	private String parentCode;

	public String getDepartmentCode() {
		return this.departmentCode;
	}
	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}

	public Boolean getLeaf() {
		return this.leaf;
	}
	public void setLeaf(Boolean leaf) {
		this.leaf = leaf;
	}

	public Long getLevel() {
		return this.level;
	}
	public void setLevel(Long level) {
		this.level = level;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getParentCode() {
		return this.parentCode;
	}
	public void setParentCode(String parentCode) {
		this.parentCode = parentCode;
	}

}
