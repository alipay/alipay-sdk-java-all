package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ServiceSearchDetailInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.govservice.search.recommend response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-17 18:02:24
 */
public class AlipayEbppIndustryGovserviceSearchRecommendResponse extends AlipayResponse {

	private static final long serialVersionUID = 7798445323183437138L;

	/** 
	 * 搜到的服务列表
	 */
	@ApiListField("search_service_list")
	@ApiField("service_search_detail_info")
	private List<ServiceSearchDetailInfo> searchServiceList;

	public void setSearchServiceList(List<ServiceSearchDetailInfo> searchServiceList) {
		this.searchServiceList = searchServiceList;
	}
	public List<ServiceSearchDetailInfo> getSearchServiceList( ) {
		return this.searchServiceList;
	}

}
