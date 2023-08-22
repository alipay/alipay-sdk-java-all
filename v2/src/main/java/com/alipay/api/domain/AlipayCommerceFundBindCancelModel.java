package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 基金绑卡-银行卡解绑接口
 *
 * @author auto create
 * @since 1.0, 2022-11-25 13:54:49
 */
public class AlipayCommerceFundBindCancelModel extends AlipayObject {

	private static final long serialVersionUID = 5559634679689981737L;

	/**
	 * 需解绑的协议号
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
