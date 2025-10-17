package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 间连商户小蓝环碰交易情况查询
 *
 * @author auto create
 * @since 1.0, 2025-08-26 17:19:01
 */
public class AlipayOfflineProviderSmidCoilpaydescriptionQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1479749927124131655L;

	/**
	 * 支付宝间连商家smid
	 */
	@ApiField("sub_merchant_id")
	private String subMerchantId;

	public String getSubMerchantId() {
		return this.subMerchantId;
	}
	public void setSubMerchantId(String subMerchantId) {
		this.subMerchantId = subMerchantId;
	}

}
