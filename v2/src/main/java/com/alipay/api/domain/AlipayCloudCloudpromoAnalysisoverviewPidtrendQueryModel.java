package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 经营概况小程序列表商户趋势
 *
 * @author auto create
 * @since 1.0, 2024-09-20 17:31:36
 */
public class AlipayCloudCloudpromoAnalysisoverviewPidtrendQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8276454811455619516L;

	/**
	 * 经营分析、经营概况模块公用入参
	 */
	@ApiField("common_request")
	private OpenApiAnalysisCommonRequest commonRequest;

	/**
	 * 商户pid，查看商户pid的趋势数据，pid必传。
	 */
	@ApiField("merchant_id")
	private String merchantId;

	public OpenApiAnalysisCommonRequest getCommonRequest() {
		return this.commonRequest;
	}
	public void setCommonRequest(OpenApiAnalysisCommonRequest commonRequest) {
		this.commonRequest = commonRequest;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

}
