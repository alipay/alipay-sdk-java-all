package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 全域营销信息查询
 *
 * @author auto create
 * @since 1.0, 2020-12-03 14:37:50
 */
public class AlipayOpenMiniMarketMultibundleConsultModel extends AlipayObject {

	private static final long serialVersionUID = 1783484395161181676L;

	/**
	 * 端ID
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/**
	 * 商户小程序ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 场景值，用于区分营销场景，例如打车星巴克
	 */
	@ApiField("scenes")
	private String scenes;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBundleId() {
		return this.bundleId;
	}
	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getScenes() {
		return this.scenes;
	}
	public void setScenes(String scenes) {
		this.scenes = scenes;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
