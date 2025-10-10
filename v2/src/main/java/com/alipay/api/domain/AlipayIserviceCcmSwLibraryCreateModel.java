package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 知识库-创建
 *
 * @author auto create
 * @since 1.0, 2022-10-26 14:59:50
 */
public class AlipayIserviceCcmSwLibraryCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5862966346787788624L;

	/**
	 * 子部门ID，不传为默认部门
	 */
	@ApiField("ccs_instance_id")
	private String ccsInstanceId;

	/**
	 * 知识库对应的类目树名称，与treeId不可同时为空
	 */
	@ApiField("instance_code")
	private String instanceCode;

	/**
	 * 知识库名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 知识库对应的类目树Id，与instanceCode不可同时为空
	 */
	@ApiField("tree_id")
	private Long treeId;

	public String getCcsInstanceId() {
		return this.ccsInstanceId;
	}
	public void setCcsInstanceId(String ccsInstanceId) {
		this.ccsInstanceId = ccsInstanceId;
	}

	public String getInstanceCode() {
		return this.instanceCode;
	}
	public void setInstanceCode(String instanceCode) {
		this.instanceCode = instanceCode;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Long getTreeId() {
		return this.treeId;
	}
	public void setTreeId(Long treeId) {
		this.treeId = treeId;
	}

}
