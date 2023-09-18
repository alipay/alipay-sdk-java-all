package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BoxExclusiveServiceOpenApiInfos;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.search.serviceinbrand.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 04:06:02
 */
public class AlipayOpenSearchServiceinbrandBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2441452229497345258L;

	/** 
	 * 品牌绑定的官方账号详情
	 */
	@ApiListField("data")
	@ApiField("box_exclusive_service_open_api_infos")
	private List<BoxExclusiveServiceOpenApiInfos> data;

	public void setData(List<BoxExclusiveServiceOpenApiInfos> data) {
		this.data = data;
	}
	public List<BoxExclusiveServiceOpenApiInfos> getData( ) {
		return this.data;
	}

}
