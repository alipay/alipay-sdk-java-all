package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BoxExclusiveServiceData;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.search.brandservice.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-18 14:37:36
 */
public class AlipayOpenSearchBrandserviceBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7779511579828346259L;

	/** 
	 * 服务信息详情
	 */
	@ApiListField("data")
	@ApiField("box_exclusive_service_data")
	private List<BoxExclusiveServiceData> data;

	public void setData(List<BoxExclusiveServiceData> data) {
		this.data = data;
	}
	public List<BoxExclusiveServiceData> getData( ) {
		return this.data;
	}

}
