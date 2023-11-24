package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.setting.category.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-12 06:49:21
 */
public class AlipayOpenPublicSettingCategoryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7643672176128331638L;

	/** 
	 * 已设置的一级行业分类名称。

	 */
	@ApiField("primary_category")
	private String primaryCategory;

	/** 
	 * 已设置的二级行业分类名称。
	 */
	@ApiField("secondary_category")
	private String secondaryCategory;

	public void setPrimaryCategory(String primaryCategory) {
		this.primaryCategory = primaryCategory;
	}
	public String getPrimaryCategory( ) {
		return this.primaryCategory;
	}

	public void setSecondaryCategory(String secondaryCategory) {
		this.secondaryCategory = secondaryCategory;
	}
	public String getSecondaryCategory( ) {
		return this.secondaryCategory;
	}

}
