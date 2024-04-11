package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业码资金专户出资绑定
 *
 * @author auto create
 * @since 1.0, 2023-11-23 17:52:41
 */
public class AlipayCommerceEcTransAccountBindModel extends AlipayObject {

	private static final long serialVersionUID = 7632284764986735733L;

	/**
	 * 资金专户ID
	 */
	@ApiField("account_book_id")
	private String accountBookId;

	/**
	 * 共同账户ID
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 授权签约协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 企业ID
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 外部业务单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 被授权方的支付宝登录账号
	 */
	@ApiField("participant_login_id")
	private String participantLoginId;

	public String getAccountBookId() {
		return this.accountBookId;
	}
	public void setAccountBookId(String accountBookId) {
		this.accountBookId = accountBookId;
	}

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

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getParticipantLoginId() {
		return this.participantLoginId;
	}
	public void setParticipantLoginId(String participantLoginId) {
		this.participantLoginId = participantLoginId;
	}

}
