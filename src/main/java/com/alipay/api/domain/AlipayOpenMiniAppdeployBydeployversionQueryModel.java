package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据发布版本查询小程序发布信息
 *
 * @author auto create
 * @since 1.0, 2021-06-21 10:40:48
 */
public class AlipayOpenMiniAppdeployBydeployversionQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4552956325216471952L;

	/**
	 * 客户端标识
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/**
	 * 发布标识
	 */
	@ApiField("deploy_version")
	private String deployVersion;

	/**
	 * 租户
	 */
	@ApiField("inst_code")
	private String instCode;

	/**
	 * 小程序ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

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

}
