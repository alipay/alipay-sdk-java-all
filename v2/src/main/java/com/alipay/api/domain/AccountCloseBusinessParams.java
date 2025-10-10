package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 记账本注销业务补充参数
 *
 * @author auto create
 * @since 1.0, 2023-03-15 11:36:05
 */
public class AccountCloseBusinessParams extends AlipayObject {

	private static final long serialVersionUID = 7468411267715632779L;

	/**
	 * 当前访问的记账本关联的授权协议ID，访问授权记账本时必须提供
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
