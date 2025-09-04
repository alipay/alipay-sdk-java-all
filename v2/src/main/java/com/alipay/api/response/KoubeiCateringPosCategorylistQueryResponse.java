package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DishCategoryEntity;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.pos.categorylist.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:34
 */
public class KoubeiCateringPosCategorylistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8498992732827213942L;

	/** 
	 * 菜类列表
	 */
	@ApiListField("category_entity_list")
	@ApiField("dish_category_entity")
	private List<DishCategoryEntity> categoryEntityList;

	public void setCategoryEntityList(List<DishCategoryEntity> categoryEntityList) {
		this.categoryEntityList = categoryEntityList;
	}
	public List<DishCategoryEntity> getCategoryEntityList( ) {
		return this.categoryEntityList;
	}

}
