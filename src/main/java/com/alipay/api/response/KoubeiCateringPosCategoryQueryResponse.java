package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.DishCategoryEntity;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.pos.category.query response.
 * 
 * @author auto create
 * @since 1.0, 2018-11-16 17:18:54
 */
public class KoubeiCateringPosCategoryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6312639175922278391L;

	/** 
	 * 菜类信息
	 */
	@ApiField("dish_category_entity")
	private DishCategoryEntity dishCategoryEntity;

	public void setDishCategoryEntity(DishCategoryEntity dishCategoryEntity) {
		this.dishCategoryEntity = dishCategoryEntity;
	}
	public DishCategoryEntity getDishCategoryEntity( ) {
		return this.dishCategoryEntity;
	}

}
