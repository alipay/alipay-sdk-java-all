package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AddressDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.service.miniappnearbypoi.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 08:19:15
 */
public class AlipayOpenAppServiceMiniappnearbypoiQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6228841983989962789L;

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
