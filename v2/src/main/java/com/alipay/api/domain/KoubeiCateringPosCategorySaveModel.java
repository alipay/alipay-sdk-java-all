package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 菜类排序
 *
 * @author auto create
 * @since 1.0, 2018-11-16 16:49:43
 */
public class KoubeiCateringPosCategorySaveModel extends AlipayObject {

	private static final long serialVersionUID = 1547876536544731884L;

	/**
	 * 排序菜类列表
	 */
	@ApiListField("category_entity_list")
	@ApiField("dish_category_entity")
	private List<DishCategoryEntity> categoryEntityList;

	public List<DishCategoryEntity> getCategoryEntityList() {
		return this.categoryEntityList;
	}
	public void setCategoryEntityList(List<DishCategoryEntity> categoryEntityList) {
		this.categoryEntityList = categoryEntityList;
	}

}
