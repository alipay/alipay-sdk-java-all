package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EstablishResponseHeader;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pay.codec.applepay.establish.set response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:09
 */
public class AlipayPayCodecApplepayEstablishSetResponse extends AlipayResponse {

	private static final long serialVersionUID = 7556399999463986324L;

	/** 
	 * 结果。 statusCode:Status code used to indicate an error. If omitted, assumed to be 200 (success);subStatusCode:Conveys failure codes from downstream entities or for more granular conveyance of specific error conditions;statusMessage:Not parsed programmatically. Example "Downstream system offline".
	 */
	@ApiField("response_header")
	private EstablishResponseHeader responseHeader;

	public void setResponseHeader(EstablishResponseHeader responseHeader) {
		this.responseHeader = responseHeader;
	}
	public EstablishResponseHeader getResponseHeader( ) {
		return this.responseHeader;
	}

}
