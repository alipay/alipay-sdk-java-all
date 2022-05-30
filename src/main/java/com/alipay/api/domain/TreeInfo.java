package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 类目树信息
 *
 * @author auto create
 * @since 1.0, 2021-01-06 19:42:39
 */
public class TreeInfo extends AlipayObject {

	private static final long serialVersionUID = 4722925633139727248L;

	/**
	 * 类目树ID
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 知识库对应的类目树名称，与treeId不可同时为空
	 */
	@ApiField("instance_code")
	private String instanceCode;

	/**
	 * 类目名称
	 */
	@ApiField("name")
	private String name;

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
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

}
