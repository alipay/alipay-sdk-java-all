package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 间连商户小蓝环碰交易情况查询
 *
 * @author auto create
 * @since 1.0, 2025-05-23 17:46:13
 */
public class AlipayOfflineProviderSmidCoilpaydescriptionQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5432984373641876911L;

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
