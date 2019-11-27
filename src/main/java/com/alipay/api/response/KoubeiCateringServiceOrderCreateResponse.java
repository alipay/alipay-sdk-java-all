package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CreateResponseData;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.service.order.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-29 14:09:37
 */
public class KoubeiCateringServiceOrderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1873394834349353877L;

	/** 
	 * 订座/排队线下订单创建接口返回data结构内容
	 */
	@ApiField("data")
	private CreateResponseData data;

	public void setData(CreateResponseData data) {
		this.data = data;
	}
	public CreateResponseData getData( ) {
		return this.data;
	}

}
