package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.FrontCategoryInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.frontcategory.security.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-01-15 11:34:51
 */
public class AntMerchantExpandFrontcategorySecurityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1484285819261279679L;

	/** 
	 * 前台类目列表
	 */
	@ApiListField("front_category_list")
	@ApiField("front_category_info")
	private List<FrontCategoryInfo> frontCategoryList;

	public void setFrontCategoryList(List<FrontCategoryInfo> frontCategoryList) {
		this.frontCategoryList = frontCategoryList;
	}
	public List<FrontCategoryInfo> getFrontCategoryList( ) {
		return this.frontCategoryList;
	}

}
