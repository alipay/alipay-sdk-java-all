package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.FengdieTemplateListRespModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.tool.fengdie.template.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2021-06-25 21:55:02
 */
public class AlipayMarketingToolFengdieTemplateBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3635114622368618361L;

	/** 
	 * 模板详情列表
	 */
	@ApiField("data")
	private FengdieTemplateListRespModel data;

	public void setData(FengdieTemplateListRespModel data) {
		this.data = data;
	}
	public FengdieTemplateListRespModel getData( ) {
		return this.data;
	}

}
