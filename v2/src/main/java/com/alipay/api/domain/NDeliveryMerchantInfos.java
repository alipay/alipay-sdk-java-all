package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 指定收单账号信息。 说明：传入需曝光的碰一下支付成功页对应的收单账号。
 *
 * @author auto create
 * @since 1.0, 2025-02-11 14:47:12
 */
public class NDeliveryMerchantInfos extends AlipayObject {

	private static final long serialVersionUID = 5756992631141531937L;

	/**
	 * 指定收单账号
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 指定收单账号类型。
枚举值：
·SMID： 间连商户
	 */
	@ApiField("merchant_id_type")
	private String merchantIdType;

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getMerchantIdType() {
		return this.merchantIdType;
	}
	public void setMerchantIdType(String merchantIdType) {
		this.merchantIdType = merchantIdType;
	}

}
