package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 还款参与方扩展
 *
 * @author auto create
 * @since 1.0, 2023-05-24 16:57:11
 */
public class RepaymentParticipantExtInfo extends AlipayObject {

	private static final long serialVersionUID = 8386157281313115969L;

	/**
	 * 参与方关联的业务协议号，默认可选，特定场景提供，以业务接入文档为准。
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
