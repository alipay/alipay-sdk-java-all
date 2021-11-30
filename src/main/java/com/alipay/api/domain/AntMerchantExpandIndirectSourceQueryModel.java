package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 间连商户信息渠道商查询
 *
 * @author auto create
 * @since 1.0, 2019-10-14 10:26:50
 */
public class AntMerchantExpandIndirectSourceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3788917165936391621L;

	/**
	 * 商户在支付宝入驻成功后，生成的支付宝内全局唯一的商户编号
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
