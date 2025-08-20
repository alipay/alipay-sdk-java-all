package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询匹配的包裹信息
 *
 * @author auto create
 * @since 1.0, 2025-04-14 16:03:23
 */
public class AlipayCommerceLogisticsTokenWaybillQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5886164533252691617L;

	/**
	 * 支付宝跳转商户小程序携带的token，商户通过token回查支付宝获取token关联的运单信息
	 */
	@ApiField("info_token")
	private String infoToken;

	/**
	 * token场景
NFC_PICK_PKG碰一下取件
	 */
	@ApiField("token_scene")
	private String tokenScene;

	public String getInfoToken() {
		return this.infoToken;
	}
	public void setInfoToken(String infoToken) {
		this.infoToken = infoToken;
	}

	public String getTokenScene() {
		return this.tokenScene;
	}
	public void setTokenScene(String tokenScene) {
		this.tokenScene = tokenScene;
	}

}
