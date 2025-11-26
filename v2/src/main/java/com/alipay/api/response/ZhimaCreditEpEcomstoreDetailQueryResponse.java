package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EcomStoreInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.ecomstore.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-02-20 15:12:23
 */
public class ZhimaCreditEpEcomstoreDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5681958693564488186L;

	/** 
	 * 电商店铺明细数据
	 */
	@ApiField("data")
	private EcomStoreInfo data;

	public void setData(EcomStoreInfo data) {
		this.data = data;
	}
	public EcomStoreInfo getData( ) {
		return this.data;
	}

}
