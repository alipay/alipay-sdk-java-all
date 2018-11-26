package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.pos.category.create response.
 * 
 * @author auto create
 * @since 1.0, 2018-11-16 16:50:32
 */
public class KoubeiCateringPosCategoryCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3411276384197789348L;

	/** 
	 * 新建菜类ID
	 */
	@ApiField("cate_id")
	private String cateId;

	public void setCateId(String cateId) {
		this.cateId = cateId;
	}
	public String getCateId( ) {
		return this.cateId;
	}

}
