package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据企业服务id查询可用的供给服务列表
 *
 * @author auto create
 * @since 1.0, 2024-04-24 17:47:31
 */
public class AlipayEbppInvoiceEnterpriseserviceBindserviceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3685964675766199892L;

	/**
	 * 企业服务产品id
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
