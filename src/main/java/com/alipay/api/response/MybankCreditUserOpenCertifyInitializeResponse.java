package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.user.open.certify.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:09:13
 */
public class MybankCreditUserOpenCertifyInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 8634893926563729397L;

	/** 
	 * 本次申请操作的唯一标识，商户需要记录，后续的操作都需要用到
	 */
	@ApiField("certify_id")
	private String certifyId;

	public void setCertifyId(String certifyId) {
		this.certifyId = certifyId;
	}
	public String getCertifyId( ) {
		return this.certifyId;
	}

}
