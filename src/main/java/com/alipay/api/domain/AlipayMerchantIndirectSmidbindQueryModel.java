package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取商户意愿确认状态
 *
 * @author auto create
 * @since 1.0, 2022-06-27 11:27:27
 */
public class AlipayMerchantIndirectSmidbindQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2187472373336418967L;

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
