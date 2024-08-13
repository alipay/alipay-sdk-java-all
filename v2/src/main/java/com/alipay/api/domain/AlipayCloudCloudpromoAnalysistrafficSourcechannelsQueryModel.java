package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 经营分析流量分析流量来源渠道列表
 *
 * @author auto create
 * @since 1.0, 2024-08-05 09:49:49
 */
public class AlipayCloudCloudpromoAnalysistrafficSourcechannelsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3889856491875527532L;

	/**
	 * 经营分析、经营概况模块公用入参
此接口只需要通用入参里的：
bizDate、startDate、p_f、timeWindow
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
