package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 间连商户费率审核状态查询
 *
 * @author auto create
 * @since 1.0, 2021-08-31 02:53:21
 */
public class AntMerchantExpandIndirectActivityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2431774816596255878L;

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
