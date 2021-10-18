package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 快收宝协议查询接口
 *
 * @author auto create
 * @since 1.0, 2021-08-19 14:05:44
 */
public class AlipayTradeContractQuicksettlementQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7676368873874933343L;

	/**
	 * 二级商户smid
	 */
	@ApiField("secondary_merchant_id")
	private String secondaryMerchantId;

	public String getSecondaryMerchantId() {
		return this.secondaryMerchantId;
	}
	public void setSecondaryMerchantId(String secondaryMerchantId) {
		this.secondaryMerchantId = secondaryMerchantId;
	}

}
