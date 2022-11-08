package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SubProtocolResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.finance.quotation.protocol.authorize.subscribe response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-26 11:01:46
 */
public class AlipayFinanceQuotationProtocolAuthorizeSubscribeResponse extends AlipayResponse {

	private static final long serialVersionUID = 7135536366192532269L;

	/** 
	 * 协议最终是否订阅的结果
	 */
	@ApiListField("result")
	@ApiField("sub_protocol_result")
	private List<SubProtocolResult> result;

	public void setResult(List<SubProtocolResult> result) {
		this.result = result;
	}
	public List<SubProtocolResult> getResult( ) {
		return this.result;
	}

}
