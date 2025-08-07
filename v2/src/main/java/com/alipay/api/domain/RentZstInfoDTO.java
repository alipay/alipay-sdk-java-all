package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁资商通产品信息
 *
 * @author auto create
 * @since 1.0, 2025-06-10 11:42:11
 */
public class RentZstInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 6152968283973567513L;

	/**
	 * 服务商模式。签约资商通直付通平台商分账产品后，下单时传入平台模式 PLATFORM，smid必传；此模式下支持服务商派单模式
	 */
	@ApiField("service_provider_model")
	private String serviceProviderModel;

	public String getServiceProviderModel() {
		return this.serviceProviderModel;
	}
	public void setServiceProviderModel(String serviceProviderModel) {
		this.serviceProviderModel = serviceProviderModel;
	}

}
