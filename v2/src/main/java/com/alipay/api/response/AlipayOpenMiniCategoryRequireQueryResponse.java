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
 * @since 1.0, 2023-09-11 18:57:15
 */
public class AlipayOpenMiniCategoryRequireQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7396792288311169593L;

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
