package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EcomStoreFeatureInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.ecomstore.feature.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-13 17:57:19
 */
public class ZhimaCreditEpEcomstoreFeatureQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6328442341254467517L;

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
