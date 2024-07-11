package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 孩子节点类目对象
 *
 * @author auto create
 * @since 1.0, 2020-10-20 16:05:53
 */
public class CategoryDTO extends AlipayObject {

	private static final long serialVersionUID = 1186184623378982188L;

	/**
	 * 门店码类目ID
	 */
	@ApiField("id")
	private String id;

	/**
	 * 叶子节点类目列表
	 */
	@ApiListField("leaf_cates")
	@ApiField("category_leaf_d_t_o")
	private List<CategoryLeafDTO> leafCates;

	/**
	 * 门店码类目名称
	 */
	@ApiField("name")
	private String name;

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public List<CategoryLeafDTO> getLeafCates() {
		return this.leafCates;
	}
	public void setLeafCates(List<CategoryLeafDTO> leafCates) {
		this.leafCates = leafCates;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
