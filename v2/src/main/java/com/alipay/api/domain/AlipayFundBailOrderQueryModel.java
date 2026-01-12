package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保证金主单查询
 *
 * @author auto create
 * @since 1.0, 2022-12-06 10:21:43
 */
public class AlipayFundBailOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3114839767712477722L;

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
