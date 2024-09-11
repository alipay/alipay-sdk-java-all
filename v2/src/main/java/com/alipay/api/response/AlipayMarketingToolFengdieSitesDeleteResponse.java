package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.FengdieSuccessRespModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.tool.fengdie.sites.delete response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:38:00
 */
public class AlipayMarketingToolFengdieSitesDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 4757488647263536483L;

	/** 
	 * 返回删除云凤蝶站点成功与失败的结果
	 */
	@ApiField("data")
	private FengdieSuccessRespModel data;

	public void setData(FengdieSuccessRespModel data) {
		this.data = data;
	}
	public FengdieSuccessRespModel getData( ) {
		return this.data;
	}

}
