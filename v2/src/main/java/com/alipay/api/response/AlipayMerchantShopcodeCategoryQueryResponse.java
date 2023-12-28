package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CategoryRootDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.shopcode.category.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-23 20:03:52
 */
public class AlipayMerchantShopcodeCategoryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1449649541164938582L;

	/** 
	 * 门店码一级类目列表
	 */
	@ApiListField("categories")
	@ApiField("category_root_d_t_o")
	private List<CategoryRootDTO> categories;

	public void setCategories(List<CategoryRootDTO> categories) {
		this.categories = categories;
	}
	public List<CategoryRootDTO> getCategories( ) {
		return this.categories;
	}

}
