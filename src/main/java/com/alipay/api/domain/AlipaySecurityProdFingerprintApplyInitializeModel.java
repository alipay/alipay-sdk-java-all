package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 指纹注册初始化
 *
 * @author auto create
 * @since 1.0, 2021-10-25 11:16:09
 */
public class AlipaySecurityProdFingerprintApplyInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 2392343388844846576L;

	/**
	 * IFAA标准中的校验类型，目前1为指纹
	 */
	@ApiField("auth_type")
	private String authType;

	/**
	 * IFAA协议的版本，目前为2.0
	 */
	@ApiField("ifaa_version")
	private String ifaaVersion;

	/**
	 * IFAA协议客户端静态信息，调用IFAA客户端SDK接口获取secData，透传至本参数
	 */
	@ApiField("sec_data")
	private String secData;

	public String getAuthType() {
		return this.authType;
	}
	public void setAuthType(String authType) {
		this.authType = authType;
	}

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
