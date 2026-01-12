package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 授权奖励查询
 *
 * @author auto create
 * @since 1.0, 2025-08-27 17:34:18
 */
public class ZhimaCustomerCreditinfoAuthawardQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8728639365862932447L;

	/**
	 * 商户外部协议号，不同的支付宝用户需要传递不同的外部单号
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
