package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InsOpenLogisticsDigestDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.ecommerce.orderlogistics.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-10 13:37:09
 */
public class AlipayInsSceneEcommerceOrderlogisticsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3229529295916673648L;

	/** 
	 * 物流单摘要
	 */
	@ApiField("logistics_digest")
	private InsOpenLogisticsDigestDTO logisticsDigest;

	public void setLogisticsDigest(InsOpenLogisticsDigestDTO logisticsDigest) {
		this.logisticsDigest = logisticsDigest;
	}
	public InsOpenLogisticsDigestDTO getLogisticsDigest( ) {
		return this.logisticsDigest;
	}

}
