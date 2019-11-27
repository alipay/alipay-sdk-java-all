package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.health.gift.accept response.
 * 
 * @author auto create
 * @since 1.0, 2019-11-25 13:02:33
 */
public class AlipayInsSceneHealthGiftAcceptResponse extends AlipayResponse {

	private static final long serialVersionUID = 3772858699345273372L;

	/** 
	 * 本次领取的保额
	 */
	@ApiField("delta_sum_insured")
	private String deltaSumInsured;

	public void setDeltaSumInsured(String deltaSumInsured) {
		this.deltaSumInsured = deltaSumInsured;
	}
	public String getDeltaSumInsured( ) {
		return this.deltaSumInsured;
	}

}
