package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁二级商户入驻
 *
 * @author auto create
 * @since 1.0, 2026-09-03 18:47:51
 */
public class AlipayCommerceRentSubmerchantCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8161232938754637879L;

	/**
	 * 商户名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 商户统一社会信用代码
	 */
	@ApiField("merchant_uscc")
	private String merchantUscc;

	/**
	 * 支付宝二级商户编号。由直付通进件返回。
	 */
	@ApiField("sub_merchant_id")
	private String subMerchantId;

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getMerchantUscc() {
		return this.merchantUscc;
	}
	public void setMerchantUscc(String merchantUscc) {
		this.merchantUscc = merchantUscc;
	}

	public String getSubMerchantId() {
		return this.subMerchantId;
	}
	public void setSubMerchantId(String subMerchantId) {
		this.subMerchantId = subMerchantId;
	}

}
