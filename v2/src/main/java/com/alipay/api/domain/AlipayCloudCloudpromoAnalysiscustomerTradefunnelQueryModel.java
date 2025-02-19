package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 经营分析客户分析交易漏斗
 *
 * @author auto create
 * @since 1.0, 2024-09-20 17:38:51
 */
public class AlipayCloudCloudpromoAnalysiscustomerTradefunnelQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1885115751767721622L;

	/**
	 * 经营分析、经营概况模块公用入参
	 */
	@ApiField("common_request")
	private OpenApiAnalysisCommonRequest commonRequest;

	public OpenApiAnalysisCommonRequest getCommonRequest() {
		return this.commonRequest;
	}
	public void setCommonRequest(OpenApiAnalysisCommonRequest commonRequest) {
		this.commonRequest = commonRequest;
	}

}
