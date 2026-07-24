package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MiniAppServiceBatchQueryResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.memberbuy.service.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-13 10:52:45
 */
public class AlipayUserMemberbuyServiceBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6654697366188275462L;

	/** 
	 * null
	 */
	@ApiListField("service_info_list")
	@ApiField("mini_app_service_batch_query_result")
	private List<MiniAppServiceBatchQueryResult> serviceInfoList;

	public void setServiceInfoList(List<MiniAppServiceBatchQueryResult> serviceInfoList) {
		this.serviceInfoList = serviceInfoList;
	}
	public List<MiniAppServiceBatchQueryResult> getServiceInfoList( ) {
		return this.serviceInfoList;
	}

}
