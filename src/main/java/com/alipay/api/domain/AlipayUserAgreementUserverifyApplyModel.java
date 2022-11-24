package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 协议用户一致性验证
 *
 * @author auto create
 * @since 1.0, 2020-07-08 14:01:28
 */
public class AlipayUserAgreementUserverifyApplyModel extends AlipayObject {

	private static final long serialVersionUID = 2335647744333953791L;

	/**
	 * 协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

}
