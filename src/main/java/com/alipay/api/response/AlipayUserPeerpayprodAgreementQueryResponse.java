package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.peerpayprod.agreement.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-11-21 11:36:25
 */
public class AlipayUserPeerpayprodAgreementQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6529738479698491392L;

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
