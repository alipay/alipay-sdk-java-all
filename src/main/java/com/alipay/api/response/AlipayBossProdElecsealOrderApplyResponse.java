package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.prod.elecseal.order.apply response.
 * 
 * @author auto create
 * @since 1.0, 2022-03-11 15:46:37
 */
public class AlipayBossProdElecsealOrderApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2393232332936195167L;

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
