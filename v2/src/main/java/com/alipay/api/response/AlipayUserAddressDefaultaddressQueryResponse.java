package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.DefaultDeliverAddress;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.address.defaultaddress.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-08 22:04:27
 */
public class AlipayUserAddressDefaultaddressQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4165758633325792162L;

	/** 
	 * 用户默认收货地址。取值逻辑：1，如果用户有设置默认地址，则返回该地址；2，如果用户有添加地址但没设置默认地址，取最近修改的地址；3，如果用户没有地址，该字段没有值。
	 */
	@ApiField("default_address")
	private DefaultDeliverAddress defaultAddress;

	public void setDefaultAddress(DefaultDeliverAddress defaultAddress) {
		this.defaultAddress = defaultAddress;
	}
	public DefaultDeliverAddress getDefaultAddress( ) {
		return this.defaultAddress;
	}

}
