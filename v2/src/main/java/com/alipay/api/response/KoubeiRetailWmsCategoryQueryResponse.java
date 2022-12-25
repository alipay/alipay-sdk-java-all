package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CategoryVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.wms.category.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 04:00:40
 */
public class KoubeiRetailWmsCategoryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3524241668627894642L;

	/** 
	 * 类目信息
	 */
	@ApiField("category")
	private CategoryVO category;

	/** 
	 * 子类目信息
	 */
	@ApiListField("sub_categories")
	@ApiField("category_v_o")
	private List<CategoryVO> subCategories;

	public void setCategory(CategoryVO category) {
		this.category = category;
	}
	public CategoryVO getCategory( ) {
		return this.category;
	}

	public void setSubCategories(List<CategoryVO> subCategories) {
		this.subCategories = subCategories;
	}
	public List<CategoryVO> getSubCategories( ) {
		return this.subCategories;
	}

}
