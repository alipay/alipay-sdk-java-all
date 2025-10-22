package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ServiceDetailInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.govservice.recommend.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-01 16:32:05
 */
public class AlipayEbppIndustryGovserviceRecommendQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2179797293269797193L;

	/** 
	 * 根据用户意图推荐的服务
	 */
	@ApiListField("recommend_service")
	@ApiField("service_detail_info")
	private List<ServiceDetailInfo> recommendService;

	public void setRecommendService(List<ServiceDetailInfo> recommendService) {
		this.recommendService = recommendService;
	}
	public List<ServiceDetailInfo> getRecommendService( ) {
		return this.recommendService;
	}

}
