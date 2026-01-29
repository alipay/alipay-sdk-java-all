package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AxfItemCategoryVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.lifeservice.category.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-28 15:22:42
 */
public class AlipayCommerceLifeserviceCategoryBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1819785334311469537L;

	/** 
	 * null
	 */
	@ApiListField("category_info")
	@ApiField("axf_item_category_v_o")
	private List<AxfItemCategoryVO> categoryInfo;

	public void setCategoryInfo(List<AxfItemCategoryVO> categoryInfo) {
		this.categoryInfo = categoryInfo;
	}
	public List<AxfItemCategoryVO> getCategoryInfo( ) {
		return this.categoryInfo;
	}

}
