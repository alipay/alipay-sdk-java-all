package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 指纹校验初始化
 *
 * @author auto create
 * @since 1.0, 2018-08-17 16:53:42
 */
public class AlipaySecurityProdFingerprintVerifyInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 4391663915965892426L;

	/**
	 * IFAA协议的版本，目前为2.0
	 */
	@ApiField("ifaa_version")
	private String ifaaVersion;

	/**
	 * IFAA协议客户端静态信息，调用IFAA客户端SDK接口获取secData，透传至本参数。此参数是为了兼容IFAA1.0而设计的，接入方可根据是否需要接入IFAA1.0来决定是否要传(只接入IFAA2.0不需要传)
	 */
	@ApiField("sec_data")
	private String secData;

	/**
	 * IFAA标准中用于关联IFAA Server和业务方Server开通状态的token，此token为注册时保存的token，传入此token，用于生成服务端校验信息。
	 */
	@ApiField("token")
	private String token;

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

	public String getToken() {
		return this.token;
	}
	public void setToken(String token) {
		this.token = token;
	}

}
