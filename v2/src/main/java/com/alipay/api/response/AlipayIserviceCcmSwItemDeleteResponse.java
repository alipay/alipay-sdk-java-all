package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.sw.item.delete response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 01:06:42
 */
public class AlipayIserviceCcmSwItemDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 3151165146882753121L;

	/** 
	 * 外部透传批量操作id,用于问题排查
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
