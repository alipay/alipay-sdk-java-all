package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.gp.storeid.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-26 17:02:48
 */
public class AlipayMerchantGpStoreidQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2359771279673552272L;

	/** 
	 * 商家店铺id，用于调用神券的业务接口
	 */
	@ApiField("a_store_id")
	private String aStoreId;

	public void setaStoreId(String aStoreId) {
		this.aStoreId = aStoreId;
	}
	public String getaStoreId( ) {
		return this.aStoreId;
	}

}
