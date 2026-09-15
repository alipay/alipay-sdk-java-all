package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分销订单买家收货地址
 *
 * @author auto create
 * @since 1.0, 2026-08-26 12:37:47
 */
public class DistributionBuyerAddressModifyApplyInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 3149432691268418651L;

	/**
	 * 申请修改的地址
	 */
	@ApiField("address")
	private DistributionMerchantAddressDTO address;

	/**
	 * 修改前的买家收货地址
	 */
	@ApiField("source_address")
	private DistributionMerchantAddressDTO sourceAddress;

	public DistributionMerchantAddressDTO getAddress() {
		return this.address;
	}
	public void setAddress(DistributionMerchantAddressDTO address) {
		this.address = address;
	}

	public DistributionMerchantAddressDTO getSourceAddress() {
		return this.sourceAddress;
	}
	public void setSourceAddress(DistributionMerchantAddressDTO sourceAddress) {
		this.sourceAddress = sourceAddress;
	}

}
