package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * AMPE小程序解除绑定
 *
 * @author auto create
 * @since 1.0, 2020-07-14 10:50:45
 */
public class AlipayOpenMiniAmpeMiniappUnbindModel extends AlipayObject {

	private static final long serialVersionUID = 3162912511784758755L;

	/**
	 * 小程序ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 需要绑定小程序的移动应用ID
	 */
	@ApiField("mobile_app_id")
	private String mobileAppId;

	/**
	 * 场景码，申请后平台分配，必填
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getMobileAppId() {
		return this.mobileAppId;
	}
	public void setMobileAppId(String mobileAppId) {
		this.mobileAppId = mobileAppId;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
