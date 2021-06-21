package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 指定版本查询小程序包信息
 *
 * @author auto create
 * @since 1.0, 2020-07-22 20:01:39
 */
public class AlipayOpenMiniInnerdeploypackageQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1521999266793649733L;

	/**
	 * 一个端的标识，用于区分不同的客户端，每接入一个客户端，都需要向小程序应用中心申请bundelId入驻
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/**
	 * 开发者标识的版本
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

	public String getBundleId() {
		return this.bundleId;
	}
	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
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

}
