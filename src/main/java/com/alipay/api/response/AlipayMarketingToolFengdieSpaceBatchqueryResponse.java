package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.FengdieSpaceListRespModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.tool.fengdie.space.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-05-22 14:31:13
 */
public class AlipayMarketingToolFengdieSpaceBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7688625492223482355L;

	/** 
	 * 云凤蝶空间列表查询接口返回值，包含分页信息，空间信息的列表。
	 */
	@ApiField("data")
	private FengdieSpaceListRespModel data;

	public void setData(FengdieSpaceListRespModel data) {
		this.data = data;
	}
	public FengdieSpaceListRespModel getData( ) {
		return this.data;
	}

}
