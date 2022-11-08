package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 校园搜索服务下架
 *
 * @author auto create
 * @since 1.0, 2022-07-14 17:05:37
 */
public class AlipayCommerceEducateSchoolserviceOfflineModel extends AlipayObject {

	private static final long serialVersionUID = 4335894726541736163L;

	/**
	 * 支付宝返回的服务唯一ID
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
