package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑标准后台类目
 *
 * @author auto create
 * @since 1.0, 2017-06-06 11:40:51
 */
public class StandardCategoryInfo extends AlipayObject {

	private static final long serialVersionUID = 7638458881623989469L;

	/**
	 * 后台类目ID，类目信息的主键；商品类目ID，发布/修改商品的时候，需要填写商品所属的类目ID
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 是否为叶子类目，商品只能够发布在叶子类目下
	 */
	@ApiField("is_leaf")
	private String isLeaf;

	/**
	 * 类目名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 本类目的上一级类目ID，如果本类目是一级类目，上一级类目ID为空
	 */
	@ApiField("parent_id")
	private String parentId;

	/**
	 * 类目路径，递归父一级类目ID的列表，依次按照一级、二级、三级...顺序排列
	 */
	@ApiField("path")
	private String path;

	/**
	 * 类目所属一级类目的ID，若本类目是一级类目，值为本类目的ID
	 */
	@ApiField("root_id")
	private String rootId;

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getIsLeaf() {
		return this.isLeaf;
	}
	public void setIsLeaf(String isLeaf) {
		this.isLeaf = isLeaf;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getParentId() {
		return this.parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getPath() {
		return this.path;
	}
	public void setPath(String path) {
		this.path = path;
	}

	public String getRootId() {
		return this.rootId;
	}
	public void setRootId(String rootId) {
		this.rootId = rootId;
	}

}
