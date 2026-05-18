package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业码服务订购接口
 *
 * @author auto create
 * @since 1.0, 2026-04-07 16:12:45
 */
public class AlipayCommerceEcServiceProductBuyModel extends AlipayObject {

	private static final long serialVersionUID = 5291459866392546946L;

	/**
	 * 企业ID，用于水平权限鉴权。通过alipay.commerce.ec.enterprise.change.notify获取
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 企业码服务ID，指定需要订购的服务。线下联系企业码小二获取
	 */
	@ApiField("service_id")
	private String serviceId;

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getServiceId() {
		return this.serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

}
