package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.prod.elecseal.order.apply response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-02 16:33:24
 */
public class AlipayBossProdElecsealOrderApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8377665875267689248L;

	/** 
	 * 法务中台电子用印流水号
	 */
	@ApiField("seal_request_id")
	private String sealRequestId;

	public void setSealRequestId(String sealRequestId) {
		this.sealRequestId = sealRequestId;
	}
	public String getSealRequestId( ) {
		return this.sealRequestId;
	}

}
