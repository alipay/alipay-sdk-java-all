package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 类目信息
 *
 * @author auto create
 * @since 1.0, 2018-04-25 11:00:54
 */
public class CategoryVO extends AlipayObject {

	private static final long serialVersionUID = 3154964213655391625L;

	/**
	 * 类目ID
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 类目名称
	 */
	@ApiField("category_name")
	private String categoryName;

	/**
	 * 类目描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 1表示有效，0表示无效
	 */
	@ApiField("enable")
	private Long enable;

	/**
	 * 类目层级
	 */
	@ApiField("level")
	private String level;

	/**
	 * 父类目ID
	 */
	@ApiField("parent_id")
	private String parentId;

	/**
	 * 根类目ID
	 */
	@ApiField("root_id")
	private String rootId;

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

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public Long getEnable() {
		return this.enable;
	}
	public void setEnable(Long enable) {
		this.enable = enable;
	}

	public String getLevel() {
		return this.level;
	}
	public void setLevel(String level) {
		this.level = level;
	}

	public String getParentId() {
		return this.parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getRootId() {
		return this.rootId;
	}
	public void setRootId(String rootId) {
		this.rootId = rootId;
	}

}
