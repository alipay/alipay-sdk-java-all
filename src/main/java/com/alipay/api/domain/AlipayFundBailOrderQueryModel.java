package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保证金主单查询
 *
 * @author auto create
 * @since 1.0, 2021-12-20 13:49:12
 */
public class AlipayFundBailOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8645295372865696964L;

	/**
	 * 代扣协议号，对应唯一的保证金代扣协议及保证金资金池
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
