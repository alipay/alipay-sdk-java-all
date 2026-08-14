package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 供应商对外-查询商品类目树节点
 *
 * @author auto create
 * @since 1.0, 2026-08-07 11:21:47
 */
public class ExternalCategoryTreeNode extends AlipayObject {

	private static final long serialVersionUID = 5346434322454755623L;

	/**
	 * 类目ID
	 */
	@ApiField("cate_id")
	private String cateId;

	/**
	 * 类目名称
	 */
	@ApiField("cate_name")
	private String cateName;

	/**
	 * 是否叶子节点
	 */
	@ApiField("leaf")
	private Boolean leaf;

	/**
	 * 父类目ID
	 */
	@ApiField("parent_cate_id")
	private String parentCateId;

	public String getCateId() {
		return this.cateId;
	}
	public void setCateId(String cateId) {
		this.cateId = cateId;
	}

	public String getCateName() {
		return this.cateName;
	}
	public void setCateName(String cateName) {
		this.cateName = cateName;
	}

	public Boolean getLeaf() {
		return this.leaf;
	}
	public void setLeaf(Boolean leaf) {
		this.leaf = leaf;
	}

	public String getParentCateId() {
		return this.parentCateId;
	}
	public void setParentCateId(String parentCateId) {
		this.parentCateId = parentCateId;
	}

}
