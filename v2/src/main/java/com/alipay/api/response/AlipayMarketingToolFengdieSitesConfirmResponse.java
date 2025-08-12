package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.FengdieSuccessRespModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.tool.fengdie.sites.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:41:16
 */
public class AlipayMarketingToolFengdieSitesConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 2257226954414775838L;

	/** 
	 * 返回执行云凤蝶站点审核操作的成功失败状态
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
