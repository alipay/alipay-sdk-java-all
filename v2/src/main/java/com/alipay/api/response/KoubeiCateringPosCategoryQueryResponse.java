package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.DishCategoryEntity;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.pos.category.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 09:26:19
 */
public class KoubeiCateringPosCategoryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1822182388667247899L;

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
