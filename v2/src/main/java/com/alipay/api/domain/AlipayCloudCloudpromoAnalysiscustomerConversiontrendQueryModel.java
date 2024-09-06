package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 经营分析客户分析转化趋势
 *
 * @author auto create
 * @since 1.0, 2024-08-05 09:49:55
 */
public class AlipayCloudCloudpromoAnalysiscustomerConversiontrendQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3144883836271316912L;

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
