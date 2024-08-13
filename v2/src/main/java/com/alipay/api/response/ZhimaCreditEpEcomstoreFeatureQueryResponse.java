package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EcomStoreFeatureInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.ecomstore.feature.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-12 15:07:05
 */
public class ZhimaCreditEpEcomstoreFeatureQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8233541835916963971L;

	/** 
	 * 电商店铺特征信息
	 */
	@ApiField("data")
	private EcomStoreFeatureInfo data;

	public void setData(EcomStoreFeatureInfo data) {
		this.data = data;
	}
	public EcomStoreFeatureInfo getData( ) {
		return this.data;
	}

}
