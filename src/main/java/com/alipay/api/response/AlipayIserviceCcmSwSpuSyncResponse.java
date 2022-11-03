package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.sw.spu.sync response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-26 15:56:51
 */
public class AlipayIserviceCcmSwSpuSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1465646373651524439L;

	/** 
	 * 商品id
	 */
	@ApiField("spu_id")
	private String spuId;

	public void setSpuId(String spuId) {
		this.spuId = spuId;
	}
	public String getSpuId( ) {
		return this.spuId;
	}

}
