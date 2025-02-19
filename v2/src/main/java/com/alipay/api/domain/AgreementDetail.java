package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物流协议详细内容
 *
 * @author auto create
 * @since 1.0, 2024-09-24 15:24:17
 */
public class AgreementDetail extends AlipayObject {

	private static final long serialVersionUID = 2727494474317254976L;

	/**
	 * 协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 协议状态
	 */
	@ApiField("status")
	private String status;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
