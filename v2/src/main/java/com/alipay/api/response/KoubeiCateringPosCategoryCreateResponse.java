package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.pos.category.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 03:27:42
 */
public class KoubeiCateringPosCategoryCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8385774389161796395L;

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
