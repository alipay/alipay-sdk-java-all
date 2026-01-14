package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开通一键和解
 *
 * @author auto create
 * @since 1.0, 2025-10-29 11:22:47
 */
public class AlipayMerchantComplainReconciliationCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7484968725952571833L;

	/**
	 * 统一社会信用代码
	 */
	@ApiField("merchant_cert_no")
	private String merchantCertNo;

	public String getMerchantCertNo() {
		return this.merchantCertNo;
	}
	public void setMerchantCertNo(String merchantCertNo) {
		this.merchantCertNo = merchantCertNo;
	}

}
