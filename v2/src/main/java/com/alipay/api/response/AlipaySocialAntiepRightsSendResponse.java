package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.antiep.rights.send response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:10
 */
public class AlipaySocialAntiepRightsSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 2573216873736499497L;

	/** 
	 * 是否幂等
	 */
	@ApiField("idempotent")
	private Boolean idempotent;

	public void setIdempotent(Boolean idempotent) {
		this.idempotent = idempotent;
	}
	public Boolean getIdempotent( ) {
		return this.idempotent;
	}

}
