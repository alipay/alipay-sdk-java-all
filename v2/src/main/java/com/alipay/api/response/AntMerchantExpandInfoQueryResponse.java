package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MerchantQueryResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.info.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 06:41:21
 */
public class AntMerchantExpandInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7544828851129973526L;

	/** 
	 * 商户基础信息返回接口
	 */
	@ApiField("merchant_query_result")
	private MerchantQueryResult merchantQueryResult;

	public void setMerchantQueryResult(MerchantQueryResult merchantQueryResult) {
		this.merchantQueryResult = merchantQueryResult;
	}
	public MerchantQueryResult getMerchantQueryResult( ) {
		return this.merchantQueryResult;
	}

}
