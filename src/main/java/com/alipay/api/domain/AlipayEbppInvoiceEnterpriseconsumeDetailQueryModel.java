package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 凭证详情查询接口
 *
 * @author auto create
 * @since 1.0, 2021-12-16 16:49:48
 */
public class AlipayEbppInvoiceEnterpriseconsumeDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7247113234546752344L;

	/**
	 * 企业id-共同和账号ID
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 授权签约协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 账单凭证ID
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

}
