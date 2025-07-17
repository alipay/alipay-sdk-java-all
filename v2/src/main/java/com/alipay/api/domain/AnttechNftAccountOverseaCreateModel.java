package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 注册鲸探海外账户
 *
 * @author auto create
 * @since 1.0, 2025-05-26 17:54:44
 */
public class AnttechNftAccountOverseaCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2652222556439838526L;

	/**
	 * aldaba链上地址
	 */
	@ApiField("blockchain_address")
	private String blockchainAddress;

	public String getBlockchainAddress() {
		return this.blockchainAddress;
	}
	public void setBlockchainAddress(String blockchainAddress) {
		this.blockchainAddress = blockchainAddress;
	}

}
