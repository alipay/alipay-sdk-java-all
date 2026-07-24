package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 可信设备认证初始化
 *
 * @author auto create
 * @since 1.0, 2026-04-21 11:23:58
 */
public class AlipaySecurityProdSecdeviceInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 6659813141182435531L;

	/**
	 * 版本号，默认为2.0
	 */
	@ApiField("ifaa_version")
	private String ifaaVersion;

	/**
	 * 安全数据
	 */
	@ApiField("sec_data")
	private String secData;

	public String getIfaaVersion() {
		return this.ifaaVersion;
	}
	public void setIfaaVersion(String ifaaVersion) {
		this.ifaaVersion = ifaaVersion;
	}

	public String getSecData() {
		return this.secData;
	}
	public void setSecData(String secData) {
		this.secData = secData;
	}

}
