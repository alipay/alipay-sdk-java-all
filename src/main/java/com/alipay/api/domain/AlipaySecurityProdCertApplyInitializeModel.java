package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 证书安装初始化
 *
 * @author auto create
 * @since 1.0, 2018-08-17 16:43:58
 */
public class AlipaySecurityProdCertApplyInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 4554797915884268597L;

	/**
	 * IFAA标准中的校验类型，证书为8
	 */
	@ApiField("auth_type")
	private String authType;

	/**
	 * IFAA协议客户端静态信息，调用IFAA客户端SDK接口获取secData，透传至本参数
	 */
	@ApiField("sec_data")
	private String secData;

	/**
	 * IFAA标准中的证书类型，目前1为SE硬件证书
	 */
	@ApiField("secert_type")
	private String secertType;

	public String getAuthType() {
		return this.authType;
	}
	public void setAuthType(String authType) {
		this.authType = authType;
	}

	public String getSecData() {
		return this.secData;
	}
	public void setSecData(String secData) {
		this.secData = secData;
	}

	public String getSecertType() {
		return this.secertType;
	}
	public void setSecertType(String secertType) {
		this.secertType = secertType;
	}

}
