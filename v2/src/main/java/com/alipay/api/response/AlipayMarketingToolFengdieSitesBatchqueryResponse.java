package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.FengdieSitesListRespModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.tool.fengdie.sites.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 23:16:37
 */
public class AlipayMarketingToolFengdieSitesBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2826852648683585583L;

	/** 
	 * 获取云凤蝶站点列表返回值模型
	 */
	@ApiField("data")
	private FengdieSitesListRespModel data;

	public void setData(FengdieSitesListRespModel data) {
		this.data = data;
	}
	public FengdieSitesListRespModel getData( ) {
		return this.data;
	}

}
