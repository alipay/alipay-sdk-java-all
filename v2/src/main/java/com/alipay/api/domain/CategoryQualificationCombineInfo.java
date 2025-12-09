package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 团购店铺类目资质组合信息
 *
 * @author auto create
 * @since 1.0, 2025-10-23 19:42:30
 */
public class CategoryQualificationCombineInfo extends AlipayObject {

	private static final long serialVersionUID = 8828711576772171484L;

	/**
	 * 资质列表
	 */
	@ApiListField("qualification_list")
	@ApiField("category_qualification_info")
	private List<CategoryQualificationInfo> qualificationList;

	/**
	 * 关联类目列表
	 */
	@ApiListField("rel_category_list")
	@ApiField("group_purchase_category_info")
	private List<GroupPurchaseCategoryInfo> relCategoryList;

	public List<CategoryQualificationInfo> getQualificationList() {
		return this.qualificationList;
	}
	public void setQualificationList(List<CategoryQualificationInfo> qualificationList) {
		this.qualificationList = qualificationList;
	}

	public List<GroupPurchaseCategoryInfo> getRelCategoryList() {
		return this.relCategoryList;
	}
	public void setRelCategoryList(List<GroupPurchaseCategoryInfo> relCategoryList) {
		this.relCategoryList = relCategoryList;
	}

}
