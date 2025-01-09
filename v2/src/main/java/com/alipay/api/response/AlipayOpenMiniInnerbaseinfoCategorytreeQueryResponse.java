package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MiniAppFirstCategoryInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.innerbaseinfo.categorytree.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-08 21:58:09
 */
public class AlipayOpenMiniInnerbaseinfoCategorytreeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5261936369669311977L;

	/** 
	 * 小程序一级类目列表
	 */
	@ApiListField("category_list")
	@ApiField("mini_app_first_category_info")
	private List<MiniAppFirstCategoryInfo> categoryList;

	public void setCategoryList(List<MiniAppFirstCategoryInfo> categoryList) {
		this.categoryList = categoryList;
	}
	public List<MiniAppFirstCategoryInfo> getCategoryList( ) {
		return this.categoryList;
	}

}
