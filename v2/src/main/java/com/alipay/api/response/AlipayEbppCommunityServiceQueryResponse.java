package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CommunityServiceInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.community.service.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 01:14:29
 */
public class AlipayEbppCommunityServiceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5583345237898831911L;

	/** 
	 * 服务查询列表
	 */
	@ApiListField("service_info_list")
	@ApiField("community_service_info")
	private List<CommunityServiceInfo> serviceInfoList;

	public void setServiceInfoList(List<CommunityServiceInfo> serviceInfoList) {
		this.serviceInfoList = serviceInfoList;
	}
	public List<CommunityServiceInfo> getServiceInfoList( ) {
		return this.serviceInfoList;
	}

}
