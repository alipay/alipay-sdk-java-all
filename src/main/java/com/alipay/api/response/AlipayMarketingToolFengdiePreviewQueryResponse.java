package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.FengdiePreviewQueryRespModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.tool.fengdie.preview.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-05-22 14:30:34
 */
public class AlipayMarketingToolFengdiePreviewQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6792785968216812717L;

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
