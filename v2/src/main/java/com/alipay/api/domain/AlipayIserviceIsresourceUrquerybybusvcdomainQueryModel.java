package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据域账号查询用户资源信息
 *
 * @author auto create
 * @since 1.0, 2023-05-26 10:40:40
 */
public class AlipayIserviceIsresourceUrquerybybusvcdomainQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4769635844645373365L;

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
