package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.ad.creative.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:39
 */
public class AlipayCommerceTransportAdCreativeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7652471168873466197L;

	/** 
	 * 创意ID：广告创意ID，投放广告唯一标识，可使用该ID进行广告详情查询
	 */
	@ApiField("ad_id")
	private Long adId;

	public void setAdId(Long adId) {
		this.adId = adId;
	}
	public Long getAdId( ) {
		return this.adId;
	}

}
