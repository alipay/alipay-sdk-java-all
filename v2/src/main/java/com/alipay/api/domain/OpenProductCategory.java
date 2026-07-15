package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-07-07 08:52:55
 */
public class OpenProductCategory extends AlipayObject {

	private static final long serialVersionUID = 4395691773813733729L;

	/**
	 * 生态侧的类目ID
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 生态侧类目对应的名称
	 */
	@ApiField("category_name")
	private String categoryName;

	/**
	 * 是否叶子节点
	 */
	@ApiField("leaf")
	private Boolean leaf;

	/**
	 * 类目的层级
	 */
	@ApiField("level")
	private Long level;

	/**
	 * 父目录ID
	 */
	@ApiField("parent_id")
	private String parentId;

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return this.categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
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

	public String getParentId() {
		return this.parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

}
