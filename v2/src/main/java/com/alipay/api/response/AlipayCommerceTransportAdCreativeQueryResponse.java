package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AdCreativeResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.ad.creative.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-13 17:52:44
 */
public class AlipayCommerceTransportAdCreativeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2551596358646647433L;

	/** 
	 * 广告创意详情；是否唯一(不需要)；用于通过创意ID查询创意详情；admgr广告创意查询返回
	 */
	@ApiField("ad_creative_result")
	private AdCreativeResult adCreativeResult;

	public void setAdCreativeResult(AdCreativeResult adCreativeResult) {
		this.adCreativeResult = adCreativeResult;
	}
	public AdCreativeResult getAdCreativeResult( ) {
		return this.adCreativeResult;
	}

}
