package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.FengdieSpaceDetailModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.tool.fengdie.space.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-06-09 22:21:28
 */
public class AlipayMarketingToolFengdieSpaceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2577733533387449494L;

	/** 
	 * 空间详情信息，比如空间名称、空间管理员等信息
	 */
	@ApiField("data")
	private FengdieSpaceDetailModel data;

	public void setData(FengdieSpaceDetailModel data) {
		this.data = data;
	}
	public FengdieSpaceDetailModel getData( ) {
		return this.data;
	}

}
