package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AmpeCategoryInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.ampe.category.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2020-07-14 14:37:25
 */
public class AlipayOpenMiniAmpeCategoryBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8518549612698717338L;

	/** 
	 * 可选行业列表
	 */
	@ApiListField("category_list")
	@ApiField("ampe_category_info")
	private List<AmpeCategoryInfo> categoryList;

	public void setCategoryList(List<AmpeCategoryInfo> categoryList) {
		this.categoryList = categoryList;
	}
	public List<AmpeCategoryInfo> getCategoryList( ) {
		return this.categoryList;
	}

}
