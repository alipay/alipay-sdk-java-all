package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取商户意愿确认状态
 *
 * @author auto create
 * @since 1.0, 2023-03-08 17:48:20
 */
public class AlipayMerchantIndirectSmidbindQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3732143428726542621L;

	/**
	 * 支付宝商户id
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
