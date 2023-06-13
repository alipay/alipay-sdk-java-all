package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.message.dynamicicondata.modify response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-12 16:01:50
 */
public class AlipaySocialBaseMessageDynamicicondataModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5242772272782674166L;

	/** 
	 * 此次操作结果
	 */
	@ApiField("op_result")
	private Boolean opResult;

	public void setOpResult(Boolean opResult) {
		this.opResult = opResult;
	}
	public Boolean getOpResult( ) {
		return this.opResult;
	}

}
