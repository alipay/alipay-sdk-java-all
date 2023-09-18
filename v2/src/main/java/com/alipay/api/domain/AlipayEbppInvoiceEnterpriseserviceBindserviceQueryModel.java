package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据企业服务id查询可用的供给服务列表
 *
 * @author auto create
 * @since 1.0, 2023-03-28 19:29:23
 */
public class AlipayEbppInvoiceEnterpriseserviceBindserviceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3385346324984683634L;

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
