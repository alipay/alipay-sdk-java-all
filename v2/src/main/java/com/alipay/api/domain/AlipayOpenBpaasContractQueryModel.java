package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * bpaas合约签约状态查询
 *
 * @author auto create
 * @since 1.0, 2021-03-22 09:58:10
 */
public class AlipayOpenBpaasContractQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2855972458516166326L;

	/**
	 * bpaas 应用ID
	 */
	@ApiField("bpaas_app_id")
	private String bpaasAppId;

	/**
	 * bpaas服务ID；注意：同一个服务不同版本ID不同
	 */
	@ApiField("service_id")
	private String serviceId;

	public String getBpaasAppId() {
		return this.bpaasAppId;
	}
	public void setBpaasAppId(String bpaasAppId) {
		this.bpaasAppId = bpaasAppId;
	}

	public String getServiceId() {
		return this.serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

}
