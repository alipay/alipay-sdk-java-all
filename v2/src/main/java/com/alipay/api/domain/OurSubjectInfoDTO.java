package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 我方主体信息
 *
 * @author auto create
 * @since 1.0, 2023-03-21 20:43:56
 */
public class OurSubjectInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 1149488419428712476L;

	/**
	 * 行号
	 */
	@ApiField("bank_code")
	private String bankCode;

	/**
	 * 开户银行
	 */
	@ApiField("deposit_bank")
	private String depositBank;

	/**
	 * 我方公司id
	 */
	@ApiField("entity_id")
	private String entityId;

	/**
	 * 提交人
	 */
	@ApiField("operator")
	private AlcollectioncenterUserDTO operator;

	/**
	 * ouCode
	 */
	@ApiField("ou_code")
	private String ouCode;

	/**
	 * 我方收款银行账户
	 */
	@ApiField("our_bank_account")
	private String ourBankAccount;

	/**
	 * 业务所属BU
	 */
	@ApiField("our_biz_bu")
	private String ourBizBu;

	/**
	 * 我方业务负责人
	 */
	@ApiField("our_biz_principal")
	private AlcollectioncenterUserDTO ourBizPrincipal;

	/**
	 * 我方联系人邮箱
	 */
	@ApiField("our_contact_email")
	private String ourContactEmail;

	/**
	 * 我方联系人姓名
	 */
	@ApiField("our_contact_name")
	private String ourContactName;

	/**
	 * 我方联系人工号
	 */
	@ApiField("our_contact_no")
	private String ourContactNo;

	/**
	 * 我方联系人电话
	 */
	@ApiField("our_contact_phone")
	private String ourContactPhone;

	/**
	 * 我方财务负责人
	 */
	@ApiField("our_finance_principal")
	private AlcollectioncenterUserDTO ourFinancePrincipal;

	/**
	 * 我方业中台负责人
	 */
	@ApiField("our_middle_ground_principal")
	private AlcollectioncenterUserDTO ourMiddleGroundPrincipal;

	/**
	 * 我方收款户名
	 */
	@ApiField("our_payee_account_name")
	private String ourPayeeAccountName;

	/**
	 * 我方结算负责人
	 */
	@ApiField("our_settle_principal")
	private AlcollectioncenterUserDTO ourSettlePrincipal;

	/**
	 * 我方主体
	 */
	@ApiField("our_subject")
	private String ourSubject;

	/**
	 * 我方主体id
	 */
	@ApiField("our_subject_id")
	private String ourSubjectId;

	public String getBankCode() {
		return this.bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getDepositBank() {
		return this.depositBank;
	}
	public void setDepositBank(String depositBank) {
		this.depositBank = depositBank;
	}

	public String getEntityId() {
		return this.entityId;
	}
	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}

	public AlcollectioncenterUserDTO getOperator() {
		return this.operator;
	}
	public void setOperator(AlcollectioncenterUserDTO operator) {
		this.operator = operator;
	}

	public String getOuCode() {
		return this.ouCode;
	}
	public void setOuCode(String ouCode) {
		this.ouCode = ouCode;
	}

	public String getOurBankAccount() {
		return this.ourBankAccount;
	}
	public void setOurBankAccount(String ourBankAccount) {
		this.ourBankAccount = ourBankAccount;
	}

	public String getOurBizBu() {
		return this.ourBizBu;
	}
	public void setOurBizBu(String ourBizBu) {
		this.ourBizBu = ourBizBu;
	}

	public AlcollectioncenterUserDTO getOurBizPrincipal() {
		return this.ourBizPrincipal;
	}
	public void setOurBizPrincipal(AlcollectioncenterUserDTO ourBizPrincipal) {
		this.ourBizPrincipal = ourBizPrincipal;
	}

	public String getOurContactEmail() {
		return this.ourContactEmail;
	}
	public void setOurContactEmail(String ourContactEmail) {
		this.ourContactEmail = ourContactEmail;
	}

	public String getOurContactName() {
		return this.ourContactName;
	}
	public void setOurContactName(String ourContactName) {
		this.ourContactName = ourContactName;
	}

	public String getOurContactNo() {
		return this.ourContactNo;
	}
	public void setOurContactNo(String ourContactNo) {
		this.ourContactNo = ourContactNo;
	}

	public String getOurContactPhone() {
		return this.ourContactPhone;
	}
	public void setOurContactPhone(String ourContactPhone) {
		this.ourContactPhone = ourContactPhone;
	}

	public AlcollectioncenterUserDTO getOurFinancePrincipal() {
		return this.ourFinancePrincipal;
	}
	public void setOurFinancePrincipal(AlcollectioncenterUserDTO ourFinancePrincipal) {
		this.ourFinancePrincipal = ourFinancePrincipal;
	}

	public AlcollectioncenterUserDTO getOurMiddleGroundPrincipal() {
		return this.ourMiddleGroundPrincipal;
	}
	public void setOurMiddleGroundPrincipal(AlcollectioncenterUserDTO ourMiddleGroundPrincipal) {
		this.ourMiddleGroundPrincipal = ourMiddleGroundPrincipal;
	}

	public String getOurPayeeAccountName() {
		return this.ourPayeeAccountName;
	}
	public void setOurPayeeAccountName(String ourPayeeAccountName) {
		this.ourPayeeAccountName = ourPayeeAccountName;
	}

	public AlcollectioncenterUserDTO getOurSettlePrincipal() {
		return this.ourSettlePrincipal;
	}
	public void setOurSettlePrincipal(AlcollectioncenterUserDTO ourSettlePrincipal) {
		this.ourSettlePrincipal = ourSettlePrincipal;
	}

	public String getOurSubject() {
		return this.ourSubject;
	}
	public void setOurSubject(String ourSubject) {
		this.ourSubject = ourSubject;
	}

	public String getOurSubjectId() {
		return this.ourSubjectId;
	}
	public void setOurSubjectId(String ourSubjectId) {
		this.ourSubjectId = ourSubjectId;
	}

}
