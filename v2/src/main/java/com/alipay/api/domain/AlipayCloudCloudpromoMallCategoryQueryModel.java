package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询类目结构
 *
 * @author auto create
 * @since 1.0, 2024-06-05 15:17:40
 */
public class AlipayCloudCloudpromoMallCategoryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3664239496312461664L;

	/**
	 * 待查询的类目id列表
	 */
	@ApiListField("category_ids")
	@ApiField("number")
	private List<Long> categoryIds;

	/**
	 * 父类目id，返回父类目的所有子类目信息
	 */
	@ApiField("parent_category_id")
	private Long parentCategoryId;

	public List<Long> getCategoryIds() {
		return this.categoryIds;
	}
	public void setCategoryIds(List<Long> categoryIds) {
		this.categoryIds = categoryIds;
	}

	public Long getParentCategoryId() {
		return this.parentCategoryId;
	}
	public void setParentCategoryId(Long parentCategoryId) {
		this.parentCategoryId = parentCategoryId;
	}

}
