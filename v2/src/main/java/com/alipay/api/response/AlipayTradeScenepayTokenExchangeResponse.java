package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ScenePayCode;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.scenepay.token.exchange response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-13 15:07:10
 */
public class AlipayTradeScenepayTokenExchangeResponse extends AlipayResponse {

	private static final long serialVersionUID = 2831747353778211935L;

	/** 
	 * 经过场景支付凭证交换出的预期码值
	 */
	@ApiField("scene_pay_code")
	private ScenePayCode scenePayCode;

	public void setScenePayCode(ScenePayCode scenePayCode) {
		this.scenePayCode = scenePayCode;
	}
	public ScenePayCode getScenePayCode( ) {
		return this.scenePayCode;
	}

}
