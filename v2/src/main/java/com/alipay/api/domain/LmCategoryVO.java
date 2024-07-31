package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 渠道商类目
 *
 * @author auto create
 * @since 1.0, 2024-06-20 15:15:28
 */
public class LmCategoryVO extends AlipayObject {

	private static final long serialVersionUID = 4858914373527223388L;

	/**
	 * 类目id
	 */
	@ApiField("category_id")
	private Long categoryId;

	/**
	 * 是否叶子类目
	 */
	@ApiField("leaf")
	private Boolean leaf;

	/**
	 * 类目层级
	 */
	@ApiField("level")
	private Long level;

	/**
	 * 类目名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 当前类目的父类目id
	 */
	@ApiField("parent_id")
	private Long parentId;

	public Long getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
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

	public Long getParentId() {
		return this.parentId;
	}
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

}
