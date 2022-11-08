package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.template.marketing.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-07 19:21:34
 */
public class AlipayOpenMiniTemplateMarketingCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3684918711112327586L;

	/** 
	 * 投放详情主键id
	 */
	@ApiField("detail_id")
	private String detailId;

	public void setDetailId(String detailId) {
		this.detailId = detailId;
	}
	public String getDetailId( ) {
		return this.detailId;
	}

}
