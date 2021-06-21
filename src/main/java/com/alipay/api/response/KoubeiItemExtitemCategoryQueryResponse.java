package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ExtCategory;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.item.extitem.category.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiItemExtitemCategoryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3795215774477894111L;

	/** 
	 * 品类信息列表
	 */
	@ApiListField("category_list")
	@ApiField("ext_category")
	private List<ExtCategory> categoryList;

	public void setCategoryList(List<ExtCategory> categoryList) {
		this.categoryList = categoryList;
	}
	public List<ExtCategory> getCategoryList( ) {
		return this.categoryList;
	}

}
