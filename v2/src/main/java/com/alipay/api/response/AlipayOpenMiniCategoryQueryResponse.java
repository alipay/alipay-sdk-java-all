package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MiniAppCategory;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.category.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-22 10:07:38
 */
public class AlipayOpenMiniCategoryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7562288943914257648L;

	/** 
	 * 小程序类目列表
	 */
	@ApiListField("category_list")
	@ApiField("mini_app_category")
	private List<MiniAppCategory> categoryList;

	/** 
	 * 小程序新类目列表。小程序新类目列表，为三级类目。创建、修改、提审传入mini_category_ids，资质相关请参考<a href="https://opendocs.alipay.com/mini/operation/material ">https://opendocs.alipay.com/mini/operation/material</a>
	 */
	@ApiListField("mini_category_list")
	@ApiField("mini_app_category")
	private List<MiniAppCategory> miniCategoryList;

	public void setCategoryList(List<MiniAppCategory> categoryList) {
		this.categoryList = categoryList;
	}
	public List<MiniAppCategory> getCategoryList( ) {
		return this.categoryList;
	}

	public void setMiniCategoryList(List<MiniAppCategory> miniCategoryList) {
		this.miniCategoryList = miniCategoryList;
	}
	public List<MiniAppCategory> getMiniCategoryList( ) {
		return this.miniCategoryList;
	}

}
