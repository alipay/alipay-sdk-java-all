package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OpenQueryPoimBaseResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.address.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-21 10:44:05
 */
public class AntMerchantExpandAddressQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6156426237455625893L;

	/** 
	 * 商家地址库基本信息集合的list,会有多个商家地址基础信息返回
	 */
	@ApiListField("data")
	@ApiField("open_query_poim_base_response")
	private List<OpenQueryPoimBaseResponse> data;

	public void setData(List<OpenQueryPoimBaseResponse> data) {
		this.data = data;
	}
	public List<OpenQueryPoimBaseResponse> getData( ) {
		return this.data;
	}

}
