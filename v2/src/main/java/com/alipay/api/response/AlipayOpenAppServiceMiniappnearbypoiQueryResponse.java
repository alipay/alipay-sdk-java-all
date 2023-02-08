package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AddressDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.service.miniappnearbypoi.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 05:17:33
 */
public class AlipayOpenAppServiceMiniappnearbypoiQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6627845235328671589L;

	/** 
	 * 服务poi信息列表
	 */
	@ApiField("addresses")
	private AddressDTO addresses;

	public void setAddresses(AddressDTO addresses) {
		this.addresses = addresses;
	}
	public AddressDTO getAddresses( ) {
		return this.addresses;
	}

}
