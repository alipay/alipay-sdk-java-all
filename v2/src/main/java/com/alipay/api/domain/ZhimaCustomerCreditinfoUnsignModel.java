package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 解除授权
 *
 * @author auto create
 * @since 1.0, 2025-08-27 17:34:17
 */
public class ZhimaCustomerCreditinfoUnsignModel extends AlipayObject {

	private static final long serialVersionUID = 5296274976984342636L;

	/**
	 * 商户外部单号
	 */
	@ApiField("out_agreement_no")
	private String outAgreementNo;

	public String getOutAgreementNo() {
		return this.outAgreementNo;
	}
	public void setOutAgreementNo(String outAgreementNo) {
		this.outAgreementNo = outAgreementNo;
	}

}
