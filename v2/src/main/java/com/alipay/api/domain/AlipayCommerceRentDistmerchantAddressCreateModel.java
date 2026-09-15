package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 归还地址新增接口
 *
 * @author auto create
 * @since 1.0, 2026-09-04 17:07:50
 */
public class AlipayCommerceRentDistmerchantAddressCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7472758613116716777L;

	/**
	 * 销商户归还地址
	 */
	@ApiField("address")
	private DistributionMerchantAddressDTO address;

	public DistributionMerchantAddressDTO getAddress() {
		return this.address;
	}
	public void setAddress(DistributionMerchantAddressDTO address) {
		this.address = address;
	}

}
