package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝个人Agent协议解约接口
 *
 * @author auto create
 * @since 1.0, 2025-07-29 14:13:00
 */
public class AlipayUserAgreementAgentUnsignModel extends AlipayObject {

	private static final long serialVersionUID = 6584799888969267288L;

	/**
	 * 支付宝系统中用以唯一标识用户签约记录的编号（用户签约成功后的协议号 ）
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
