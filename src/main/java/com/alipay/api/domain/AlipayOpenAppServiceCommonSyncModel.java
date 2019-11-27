package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通用服务同步接口
 *
 * @author auto create
 * @since 1.0, 2019-11-01 10:16:48
 */
public class AlipayOpenAppServiceCommonSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4669887853731748271L;

	/**
	 * 服务名称
	 */
	@ApiField("service_name")
	private String serviceName;

	public String getServiceName() {
		return this.serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

}
