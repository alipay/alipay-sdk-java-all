package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.sw.item.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-24 22:46:43
 */
public class AlipayIserviceCcmSwItemSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4884981237237311422L;

	/** 
	 * 返回的外部批次id
	 */
	@ApiField("syn_id")
	private String synId;

	public void setSynId(String synId) {
		this.synId = synId;
	}
	public String getSynId( ) {
		return this.synId;
	}

}
