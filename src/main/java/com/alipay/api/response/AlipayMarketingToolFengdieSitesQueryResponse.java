package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.FengdieSitesQueryRespModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.tool.fengdie.sites.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-05-22 14:31:00
 */
public class AlipayMarketingToolFengdieSitesQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4579475571816593273L;

	/** 
	 * 站点查询返回值
	 */
	@ApiField("data")
	private FengdieSitesQueryRespModel data;

	public void setData(FengdieSitesQueryRespModel data) {
		this.data = data;
	}
	public FengdieSitesQueryRespModel getData( ) {
		return this.data;
	}

}
