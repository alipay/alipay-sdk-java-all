package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业抬头查询
 *
 * @author auto create
 * @since 1.0, 2021-09-24 18:19:28
 */
public class AlipayEbppInvoiceEnterpriseexctrlEmployertitleQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6351758164814511324L;

	/**
	 * 企业支付宝Id
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 授权签约协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 抬头与企业关系表主键
	 */
	@ApiField("title_id")
	private String titleId;

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

	public String getTitleId() {
		return this.titleId;
	}
	public void setTitleId(String titleId) {
		this.titleId = titleId;
	}

}
