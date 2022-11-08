package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序基础信息
 *
 * @author auto create
 * @since 1.0, 2022-10-10 16:37:17
 */
public class MiniAppBaseInfoResponse extends AlipayObject {

	private static final long serialVersionUID = 8259322827697632963L;

	/**
	 * 小程序描述
	 */
	@ApiField("app_desc")
	private String appDesc;

	/**
	 * 小程序名称
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 小程序类型
	 */
	@ApiField("app_type")
	private String appType;

	/**
	 * 小程序logo
	 */
	@ApiField("logo_url")
	private String logoUrl;

	/**
	 * 小程序ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 小程序归属者ID
	 */
	@ApiField("oid")
	private String oid;

	/**
	 * 小程序状态
	 */
	@ApiField("status")
	private String status;

	public String getAppDesc() {
		return this.appDesc;
	}
	public void setAppDesc(String appDesc) {
		this.appDesc = appDesc;
	}

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAppType() {
		return this.appType;
	}
	public void setAppType(String appType) {
		this.appType = appType;
	}

	public String getLogoUrl() {
		return this.logoUrl;
	}
	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getOid() {
		return this.oid;
	}
	public void setOid(String oid) {
		this.oid = oid;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
