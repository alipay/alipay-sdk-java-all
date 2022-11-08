package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.SignatoryInfoMap;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.signatory.info.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-05-10 20:51:43
 */
public class AlipayUserSignatoryInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7681842529926544844L;

	/** 
	 * 出参
	 */
	@ApiField("out_put_map")
	private SignatoryInfoMap outPutMap;

	public void setOutPutMap(SignatoryInfoMap outPutMap) {
		this.outPutMap = outPutMap;
	}
	public SignatoryInfoMap getOutPutMap( ) {
		return this.outPutMap;
	}

}
