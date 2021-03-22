package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务查询
 *
 * @author auto create
 * @since 1.0, 2021-03-18 11:50:53
 */
public class AlipayOpenAppServiceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7876228836476822935L;

	/**
	 * 服务id
	 */
	@ApiField("service_id")
	private String serviceId;

	public String getServiceId() {
		return this.serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

}
