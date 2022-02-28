package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * AMPE绑定小程序
 *
 * @author auto create
 * @since 1.0, 2020-07-06 15:04:41
 */
public class AlipayOpenMiniAmpeMiniappBindModel extends AlipayObject {

	private static final long serialVersionUID = 7726815157367912954L;

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
