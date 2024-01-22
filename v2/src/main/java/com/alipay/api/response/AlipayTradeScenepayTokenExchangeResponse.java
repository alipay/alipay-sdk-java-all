package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ScenePayCode;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.scenepay.token.exchange response.
 * 
 * @author auto create
 * @since 1.0, 2023-12-27 15:59:11
 */
public class AlipayTradeScenepayTokenExchangeResponse extends AlipayResponse {

	private static final long serialVersionUID = 1164595546764162897L;

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
