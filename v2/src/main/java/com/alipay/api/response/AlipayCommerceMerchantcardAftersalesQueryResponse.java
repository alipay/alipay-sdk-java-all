package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AftersalesInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.aftersales.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-19 15:39:51
 */
public class AlipayCommerceMerchantcardAftersalesQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5246934569588822243L;

	/** 
	 * 售后详情
	 */
	@ApiField("aftersales_info")
	private AftersalesInfo aftersalesInfo;

	public void setAftersalesInfo(AftersalesInfo aftersalesInfo) {
		this.aftersalesInfo = aftersalesInfo;
	}
	public AftersalesInfo getAftersalesInfo( ) {
		return this.aftersalesInfo;
	}

}
