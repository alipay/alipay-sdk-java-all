package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-11-21 14:12:42
 */
public class CareertrainingsaasCategoryVO extends AlipayObject {

	private static final long serialVersionUID = 7865745165311498763L;

	/**
	 * 类目id
	 */
	@ApiField("category_id")
	private Long categoryId;

	/**
	 * 类目层级
	 */
	@ApiField("category_level")
	private Long categoryLevel;

	/**
	 * 类目名称
	 */
	@ApiField("category_name")
	private String categoryName;

	/**
	 * 类目父id
	 */
	@ApiField("category_parent_id")
	private Long categoryParentId;

	/**
	 * 类目排序
	 */
	@ApiField("category_sort")
	private Long categorySort;

	public Long getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public Long getCategoryLevel() {
		return this.categoryLevel;
	}
	public void setCategoryLevel(Long categoryLevel) {
		this.categoryLevel = categoryLevel;
	}

	public String getCategoryName() {
		return this.categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Long getCategoryParentId() {
		return this.categoryParentId;
	}
	public void setCategoryParentId(Long categoryParentId) {
		this.categoryParentId = categoryParentId;
	}

	public Long getCategorySort() {
		return this.categorySort;
	}
	public void setCategorySort(Long categorySort) {
		this.categorySort = categorySort;
	}

}
