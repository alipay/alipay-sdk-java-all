package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序线下包查询
 *
 * @author auto create
 * @since 1.0, 2021-07-21 20:13:47
 */
public class AlipayOpenMiniDeveloppackageQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8751999964521458464L;

	/**
	 * 一个端的标识，用于区分不同的客户端，每接入一个客户端，都需要向小程序应用中心申请bundelId入驻
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/**
	 * 部署版本号，一个应用、租户、端在应用中心唯一的一条发布记录版本号。
	 */
	@ApiField("deploy_version")
	private String deployVersion;

	/**
	 * 开发者标识的版本，这个版本号和deploy_version是二选一。
	 */
	@ApiField("developer_version")
	private String developerVersion;

	/**
	 * 租户类型，由应用中心分配
	 */
	@ApiField("inst_code")
	private String instCode;

	/**
	 * 小程序ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 拉包协议版本
	 */
	@ApiField("protocol")
	private String protocol;

	/**
	 * 类型，目前分为“DEBUG(调试版)、TRIAL(试用版)”
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBundleId() {
		return this.bundleId;
	}
	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}

	public String getDeployVersion() {
		return this.deployVersion;
	}
	public void setDeployVersion(String deployVersion) {
		this.deployVersion = deployVersion;
	}

	public String getDeveloperVersion() {
		return this.developerVersion;
	}
	public void setDeveloperVersion(String developerVersion) {
		this.developerVersion = developerVersion;
	}

	public String getInstCode() {
		return this.instCode;
	}
	public void setInstCode(String instCode) {
		this.instCode = instCode;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getProtocol() {
		return this.protocol;
	}
	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
