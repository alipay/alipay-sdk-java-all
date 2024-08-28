package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 经营分析商品分析商品效果总览趋势
 *
 * @author auto create
 * @since 1.0, 2024-08-05 09:49:58
 */
public class AlipayCloudCloudpromoAnalysiscommodityCommodityoverviewQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7895346339964448268L;

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
