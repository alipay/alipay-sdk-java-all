package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 类目叶子节点
 *
 * @author auto create
 * @since 1.0, 2020-10-20 14:02:49
 */
public class CategoryLeafDTO extends AlipayObject {

	private static final long serialVersionUID = 4814533763381632538L;

	/**
	 * 类目ID
	 */
	@ApiField("id")
	private String id;

	/**
	 * 类目名称
	 */
	@ApiField("name")
	private String name;

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
