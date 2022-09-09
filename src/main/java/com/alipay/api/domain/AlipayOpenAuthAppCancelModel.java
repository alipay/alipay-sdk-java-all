package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 应用授权授权关系取消接口
 *
 * @author auto create
 * @since 1.0, 2022-05-13 17:20:10
 */
public class AlipayOpenAuthAppCancelModel extends AlipayObject {

	private static final long serialVersionUID = 2516776971722987225L;

	/**
	 * 授权方应用ID
	 */
	@ApiField("auth_app_id")
	private String authAppId;

	/**
	 * 授权场景，固定值PLATFORM_APP_AUTH
	 */
	@ApiField("auth_scene")
	private String authScene;

	/**
	 * 当前登录账号支付宝userId
	 */
	@ApiField("operator_user_id")
	private String operatorUserId;

	public String getAuthAppId() {
		return this.authAppId;
	}
	public void setAuthAppId(String authAppId) {
		this.authAppId = authAppId;
	}

	public String getAuthScene() {
		return this.authScene;
	}
	public void setAuthScene(String authScene) {
		this.authScene = authScene;
	}

	public String getOperatorUserId() {
		return this.operatorUserId;
	}
	public void setOperatorUserId(String operatorUserId) {
		this.operatorUserId = operatorUserId;
	}

}
