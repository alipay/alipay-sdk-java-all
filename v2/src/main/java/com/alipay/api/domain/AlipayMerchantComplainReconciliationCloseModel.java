package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 关闭一键和解功能
 *
 * @author auto create
 * @since 1.0, 2023-06-27 09:48:34
 */
public class AlipayMerchantComplainReconciliationCloseModel extends AlipayObject {

	private static final long serialVersionUID = 3612934714688539433L;

	/**
	 * 商家支付宝侧账号，唯一标识
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 商家类型，默认为DIRECT
	 */
	@ApiField("merchant_type")
	private String merchantType;

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getMerchantType() {
		return this.merchantType;
	}
	public void setMerchantType(String merchantType) {
		this.merchantType = merchantType;
	}

}
