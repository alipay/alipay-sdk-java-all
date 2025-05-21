package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 经营分析商品分析商品效果总览趋势
 *
 * @author auto create
 * @since 1.0, 2024-09-20 17:31:52
 */
public class AlipayCloudCloudpromoAnalysiscommodityCommodityoverviewQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3392872113792825392L;

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
