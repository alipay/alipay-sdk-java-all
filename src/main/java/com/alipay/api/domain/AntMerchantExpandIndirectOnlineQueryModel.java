package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 线上间连商户信息查询
 *
 * @author auto create
 * @since 1.0, 2021-06-17 10:44:13
 */
public class AntMerchantExpandIndirectOnlineQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4881695157833515294L;

	/**
	 * 受理商户在受理机构下的唯一标识，与sub_merchant_id二选一必传
	 */
	@ApiField("external_id")
	private String externalId;

	/**
	 * 商户在支付宝入驻成功后，生成的支付宝内全局唯一的商户编号，与external_id二选一必传
	 */
	@ApiField("sub_merchant_id")
	private String subMerchantId;

	public String getExternalId() {
		return this.externalId;
	}
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public String getSubMerchantId() {
		return this.subMerchantId;
	}
	public void setSubMerchantId(String subMerchantId) {
		this.subMerchantId = subMerchantId;
	}

}
