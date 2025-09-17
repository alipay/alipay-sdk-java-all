package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 经营分析客户分析消费层级
 *
 * @author auto create
 * @since 1.0, 2024-09-20 17:34:36
 */
public class AlipayCloudCloudpromoAnalysiscustomerConsumptionlevelQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8173636156776893471L;

	/**
	 * 经营分析、经营概况模块公用入参
	 */
	@ApiField("common_request")
	private OpenApiAnalysisCommonRequest commonRequest;

	/**
	 * 消费层级区间粒度，用于查看各个层级的消费数据和占比
	 */
	@ApiField("trade_level_granularity")
	private String tradeLevelGranularity;

	public OpenApiAnalysisCommonRequest getCommonRequest() {
		return this.commonRequest;
	}
	public void setCommonRequest(OpenApiAnalysisCommonRequest commonRequest) {
		this.commonRequest = commonRequest;
	}

	public String getTradeLevelGranularity() {
		return this.tradeLevelGranularity;
	}
	public void setTradeLevelGranularity(String tradeLevelGranularity) {
		this.tradeLevelGranularity = tradeLevelGranularity;
	}

}
