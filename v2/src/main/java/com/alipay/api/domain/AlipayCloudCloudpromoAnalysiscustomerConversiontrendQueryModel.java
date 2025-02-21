package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 经营分析客户分析转化趋势
 *
 * @author auto create
 * @since 1.0, 2024-09-20 17:31:08
 */
public class AlipayCloudCloudpromoAnalysiscustomerConversiontrendQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6248929739769326817L;

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
