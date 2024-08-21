package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 新增小程序端信息
 *
 * @author auto create
 * @since 1.0, 2024-04-03 11:57:41
 */
public class AlipayOpenMiniInnerclientinfoCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6297465764459559969L;

	/**
	 * 端ID，不可重复，接入方需要和小程序平台约定格式
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/**
	 * 端名称
	 */
	@ApiField("bundle_name")
	private String bundleName;

	/**
	 * 端信息缓存前缀，不可重复，接入方需要和小程序平台约定前后缀信息
	 */
	@ApiField("bundle_prefix")
	private String bundlePrefix;

	/**
	 * 租户code，手淘租户:taobao，钉钉租户:dingding；参数不填默认为手淘租户
	 */
	@ApiField("inst_code")
	private String instCode;

	public String getBundleId() {
		return this.bundleId;
	}
	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}

	public String getBundleName() {
		return this.bundleName;
	}
	public void setBundleName(String bundleName) {
		this.bundleName = bundleName;
	}

	public String getBundlePrefix() {
		return this.bundlePrefix;
	}
	public void setBundlePrefix(String bundlePrefix) {
		this.bundlePrefix = bundlePrefix;
	}

	public String getInstCode() {
		return this.instCode;
	}
	public void setInstCode(String instCode) {
		this.instCode = instCode;
	}

}
