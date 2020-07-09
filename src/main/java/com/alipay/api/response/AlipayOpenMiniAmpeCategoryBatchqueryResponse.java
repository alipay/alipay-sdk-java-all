package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AmpeCategoryInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.ampe.category.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2020-07-06 15:04:51
 */
public class AlipayOpenMiniAmpeCategoryBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5519773157932716724L;

	/** 
	 * 可选行业列表
	 */
	@ApiField("category_list")
	private AmpeCategoryInfo categoryList;

	public void setCategoryList(AmpeCategoryInfo categoryList) {
		this.categoryList = categoryList;
	}
	public AmpeCategoryInfo getCategoryList( ) {
		return this.categoryList;
	}

}
