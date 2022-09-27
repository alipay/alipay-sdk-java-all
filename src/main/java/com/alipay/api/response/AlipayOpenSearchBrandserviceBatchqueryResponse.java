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
 * @since 1.0, 2021-08-19 20:00:23
 */
public class AlipayOpenSearchBrandserviceBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3511381991451499493L;

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
