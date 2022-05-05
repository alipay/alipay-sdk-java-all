package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 应用授权文案查询
 *
 * @author auto create
 * @since 1.0, 2020-12-14 14:28:20
 */
public class AlipayOpenAuthAppContentQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1116315212798299662L;

	/**
	 * 授权场景，固定值PLATFORM_APP_AUTH
	 */
	@ApiField("auth_scene")
	private String authScene;

	public String getAuthScene() {
		return this.authScene;
	}
	public void setAuthScene(String authScene) {
		this.authScene = authScene;
	}

}
