package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.antiep.rights.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-11 09:36:40
 */
public class AlipaySocialAntiepRightsSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 5421437254966595496L;

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
