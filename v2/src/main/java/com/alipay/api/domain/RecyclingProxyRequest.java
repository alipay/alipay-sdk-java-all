package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 代卖人入参信息
 *
 * @author auto create
 * @since 1.0, 2026-04-29 14:58:44
 */
public class RecyclingProxyRequest extends AlipayObject {

	private static final long serialVersionUID = 1584149111816819584L;

	/**
	 * 代卖人身份证件号
	 */
	@ApiField("proxy_cert_no")
	private String proxyCertNo;

	/**
	 * 代卖人姓名
	 */
	@ApiField("proxy_name")
	private String proxyName;

	/**
	 * 代卖人联系手机号
	 */
	@ApiField("proxy_phone")
	private String proxyPhone;

	public String getProxyCertNo() {
		return this.proxyCertNo;
	}
	public void setProxyCertNo(String proxyCertNo) {
		this.proxyCertNo = proxyCertNo;
	}

	public String getProxyName() {
		return this.proxyName;
	}
	public void setProxyName(String proxyName) {
		this.proxyName = proxyName;
	}

	public String getProxyPhone() {
		return this.proxyPhone;
	}
	public void setProxyPhone(String proxyPhone) {
		this.proxyPhone = proxyPhone;
	}

}
