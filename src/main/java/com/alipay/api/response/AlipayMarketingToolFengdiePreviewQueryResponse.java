package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.FengdiePreviewQueryRespModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.tool.fengdie.preview.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayMarketingToolFengdiePreviewQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4584541688727839871L;

	/** 
	 * 站点页面预览数据返回值
	 */
	@ApiField("data")
	private FengdiePreviewQueryRespModel data;

	public void setData(FengdiePreviewQueryRespModel data) {
		this.data = data;
	}
	public FengdiePreviewQueryRespModel getData( ) {
		return this.data;
	}

}
