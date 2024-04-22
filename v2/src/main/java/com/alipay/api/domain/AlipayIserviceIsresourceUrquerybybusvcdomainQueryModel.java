package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据域账号查询用户资源信息
 *
 * @author auto create
 * @since 1.0, 2023-07-10 10:01:20
 */
public class AlipayIserviceIsresourceUrquerybybusvcdomainQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4216822479524151131L;

	/**
	 * 域账号
	 */
	@ApiField("busvc_domain")
	private String busvcDomain;

	public String getBusvcDomain() {
		return this.busvcDomain;
	}
	public void setBusvcDomain(String busvcDomain) {
		this.busvcDomain = busvcDomain;
	}

}
