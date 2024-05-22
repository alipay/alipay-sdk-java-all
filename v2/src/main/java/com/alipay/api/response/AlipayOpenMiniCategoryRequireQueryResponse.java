package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CategoryRequireInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.category.require.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-23 21:50:59
 */
public class AlipayOpenMiniCategoryRequireQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1579737756495295239L;

	/** 
	 * 类目对应资质列表
	 */
	@ApiListField("category_require_info_list")
	@ApiField("category_require_info")
	private List<CategoryRequireInfo> categoryRequireInfoList;

	public void setCategoryRequireInfoList(List<CategoryRequireInfo> categoryRequireInfoList) {
		this.categoryRequireInfoList = categoryRequireInfoList;
	}
	public List<CategoryRequireInfo> getCategoryRequireInfoList( ) {
		return this.categoryRequireInfoList;
	}

}
