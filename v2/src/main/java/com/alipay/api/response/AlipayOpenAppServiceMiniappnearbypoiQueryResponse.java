package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AddressDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.service.miniappnearbypoi.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 21:28:38
 */
public class AlipayOpenAppServiceMiniappnearbypoiQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5688281538146534729L;

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
