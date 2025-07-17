package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 先采后付协议查询
 *
 * @author auto create
 * @since 1.0, 2025-07-07 15:59:03
 */
public class AlipayTradeCreditAgreementQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5645671582577722445L;

	/**
	 * 先采协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 商户外部协议号
	 */
	@ApiField("out_agreement_no")
	private String outAgreementNo;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getOutAgreementNo() {
		return this.outAgreementNo;
	}
	public void setOutAgreementNo(String outAgreementNo) {
		this.outAgreementNo = outAgreementNo;
	}

}
