package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.template.marketing.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 20:41:59
 */
public class AlipayOpenMiniTemplateMarketingCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3494199934429452163L;

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
