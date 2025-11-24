package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 一键和解项目中，杭州市监局按照“统一社会信用代码”为商家开通一键和解能力，统一社会信用代码可能关联多个商家账号信息（pid、类型等）
 *
 * @author auto create
 * @since 1.0, 2025-10-29 11:22:47
 */
public class ReconciliationMerchantInfo extends AlipayObject {

	private static final long serialVersionUID = 2272537117474859864L;

	/**
	 * 统一社会信用代码
	 */
	@ApiField("merchant_credit_no")
	private String merchantCreditNo;

	/**
	 * 商家支付宝账号
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 商户类型
	 */
	@ApiField("merchant_type")
	private String merchantType;

	public String getMerchantCreditNo() {
		return this.merchantCreditNo;
	}
	public void setMerchantCreditNo(String merchantCreditNo) {
		this.merchantCreditNo = merchantCreditNo;
	}

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
