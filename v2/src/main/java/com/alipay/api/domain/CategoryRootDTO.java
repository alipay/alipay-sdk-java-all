package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 一级类目
 *
 * @author auto create
 * @since 1.0, 2020-10-20 17:39:20
 */
public class CategoryRootDTO extends AlipayObject {

	private static final long serialVersionUID = 3481726579865249869L;

	/**
	 * 二级类目列表
	 */
	@ApiListField("children")
	@ApiField("category_d_t_o")
	private List<CategoryDTO> children;

	/**
	 * 一级类目ID
	 */
	@ApiField("id")
	private String id;

	/**
	 * 一级类目名称
	 */
	@ApiField("name")
	private String name;

	public List<CategoryDTO> getChildren() {
		return this.children;
	}
	public void setChildren(List<CategoryDTO> children) {
		this.children = children;
	}

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
