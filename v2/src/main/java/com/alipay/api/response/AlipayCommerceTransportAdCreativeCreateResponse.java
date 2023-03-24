package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.ad.creative.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-12 18:16:05
 */
public class AlipayCommerceTransportAdCreativeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8159927471455557476L;

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
