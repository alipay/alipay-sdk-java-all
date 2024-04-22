package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.insure.recommend.check response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-15 14:31:58
 */
public class AlipayInsSceneInsureRecommendCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 3814599394823338779L;

	/** 
	 * 是否能推荐保险true|false
	 */
	@ApiField("access_result")
	private Boolean accessResult;

	public void setAccessResult(Boolean accessResult) {
		this.accessResult = accessResult;
	}
	public Boolean getAccessResult( ) {
		return this.accessResult;
	}

}
