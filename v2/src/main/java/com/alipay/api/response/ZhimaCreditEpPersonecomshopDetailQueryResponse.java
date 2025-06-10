package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.TaoBaoEcomStoreResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.personecomshop.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-02-08 11:02:24
 */
public class ZhimaCreditEpPersonecomshopDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6356516776792628327L;

	/** 
	 * 数据结果集
	 */
	@ApiField("data")
	private TaoBaoEcomStoreResult data;

	public void setData(TaoBaoEcomStoreResult data) {
		this.data = data;
	}
	public TaoBaoEcomStoreResult getData( ) {
		return this.data;
	}

}
