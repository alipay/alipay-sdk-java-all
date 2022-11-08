package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 作废额度发放
 *
 * @author auto create
 * @since 1.0, 2022-09-26 22:07:49
 */
public class AlipayEbppInvoiceExpensecontrolIssuebatchCancelModel extends AlipayObject {

	private static final long serialVersionUID = 2723513751966819193L;

	/**
	 * 共同账户id - 适用于在企业码小程序创建的共同账户，和agreement_no搭配使用
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 授权签约协议号，可通过签约消息获取。配合企业共同账户id使用，当填写企业共同账户id时，此字段必填。
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 企业ID - 适用于在企业码PC端创建的企业账号
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 制度id
	 */
	@ApiField("institution_id")
	private String institutionId;

	/**
	 * 发放批次id
	 */
	@ApiField("issue_batch_id")
	private String issueBatchId;

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

	public String getInstitutionId() {
		return this.institutionId;
	}
	public void setInstitutionId(String institutionId) {
		this.institutionId = institutionId;
	}

	public String getIssueBatchId() {
		return this.issueBatchId;
	}
	public void setIssueBatchId(String issueBatchId) {
		this.issueBatchId = issueBatchId;
	}

}
