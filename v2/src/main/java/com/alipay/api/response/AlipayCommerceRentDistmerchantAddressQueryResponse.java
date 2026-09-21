package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DistributionMerchantAddressDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.rent.distmerchant.address.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-04 17:07:50
 */
public class AlipayCommerceRentDistmerchantAddressQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5219864375385254336L;

	/** 
	 * null
	 */
	@ApiListField("addresses")
	@ApiField("distribution_merchant_address_d_t_o")
	private List<DistributionMerchantAddressDTO> addresses;

	public void setAddresses(List<DistributionMerchantAddressDTO> addresses) {
		this.addresses = addresses;
	}
	public List<DistributionMerchantAddressDTO> getAddresses( ) {
		return this.addresses;
	}

}
