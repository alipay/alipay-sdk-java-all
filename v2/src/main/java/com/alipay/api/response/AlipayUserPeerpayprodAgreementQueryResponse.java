package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.peerpayprod.agreement.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-13 10:41:54
 */
public class AlipayUserPeerpayprodAgreementQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7576241474237755728L;

	/** 
	 * 亲情号协议的额度
	 */
	@ApiField("quota")
	private Long quota;

	public void setQuota(Long quota) {
		this.quota = quota;
	}
	public Long getQuota( ) {
		return this.quota;
	}

}
