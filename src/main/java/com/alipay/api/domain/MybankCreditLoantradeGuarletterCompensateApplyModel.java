package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 赔付申请
 *
 * @author auto create
 * @since 1.0, 2022-08-24 17:38:17
 */
public class MybankCreditLoantradeGuarletterCompensateApplyModel extends AlipayObject {

	private static final long serialVersionUID = 4814862788641286457L;

	/**
	 * 理赔申请的发起人的证件号
	 */
	@ApiField("apply_user_cert_no")
	private String applyUserCertNo;

	/**
	 * 理赔申请的发起人
	 */
	@ApiField("apply_user_name")
	private String applyUserName;

	/**
	 * 理赔申请的发起人的手机号
	 */
	@ApiField("apply_user_phone")
	private String applyUserPhone;

	/**
	 * 银行卡号
	 */
	@ApiField("beneficiary_bank_card_no")
	private String beneficiaryBankCardNo;

	/**
	 * 开户行名称
	 */
	@ApiField("beneficiary_bank_name")
	private String beneficiaryBankName;

	/**
	 * 附件url，多个使用英文逗号隔开(,)
	 */
	@ApiField("file_list")
	private String fileList;

	/**
	 * 保函单号
	 */
	@ApiField("guar_letter_order_no")
	private String guarLetterOrderNo;

	/**
	 * 理赔原因
	 */
	@ApiField("reason")
	private String reason;

	/**
	 * 请求id，标识每一笔不同的请求
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 方案合约号
	 */
	@ApiField("scheme_ar_no")
	private String schemeArNo;

	public String getApplyUserCertNo() {
		return this.applyUserCertNo;
	}
	public void setApplyUserCertNo(String applyUserCertNo) {
		this.applyUserCertNo = applyUserCertNo;
	}

	public String getApplyUserName() {
		return this.applyUserName;
	}
	public void setApplyUserName(String applyUserName) {
		this.applyUserName = applyUserName;
	}

	public String getApplyUserPhone() {
		return this.applyUserPhone;
	}
	public void setApplyUserPhone(String applyUserPhone) {
		this.applyUserPhone = applyUserPhone;
	}

	public String getBeneficiaryBankCardNo() {
		return this.beneficiaryBankCardNo;
	}
	public void setBeneficiaryBankCardNo(String beneficiaryBankCardNo) {
		this.beneficiaryBankCardNo = beneficiaryBankCardNo;
	}

	public String getBeneficiaryBankName() {
		return this.beneficiaryBankName;
	}
	public void setBeneficiaryBankName(String beneficiaryBankName) {
		this.beneficiaryBankName = beneficiaryBankName;
	}

	public String getFileList() {
		return this.fileList;
	}
	public void setFileList(String fileList) {
		this.fileList = fileList;
	}

	public String getGuarLetterOrderNo() {
		return this.guarLetterOrderNo;
	}
	public void setGuarLetterOrderNo(String guarLetterOrderNo) {
		this.guarLetterOrderNo = guarLetterOrderNo;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSchemeArNo() {
		return this.schemeArNo;
	}
	public void setSchemeArNo(String schemeArNo) {
		this.schemeArNo = schemeArNo;
	}

}
