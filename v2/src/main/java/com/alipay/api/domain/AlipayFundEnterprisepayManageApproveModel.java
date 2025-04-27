package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 管理员审批申请
 *
 * @author auto create
 * @since 1.0, 2025-04-07 17:02:13
 */
public class AlipayFundEnterprisepayManageApproveModel extends AlipayObject {

	private static final long serialVersionUID = 8233723649153988489L;

	/**
	 * 共同账户id
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 申请人信息
	 */
	@ApiField("applicant_info")
	private IdentityInfo applicantInfo;

	/**
	 * 管理员信息；默认没有管理员，此时会以企业创建者为管理员。
目前只有企业码侧存在管理员这个概念。
	 */
	@ApiField("approve_info")
	private IdentityInfo approveInfo;

	/**
	 * 业务场景，联系支付宝分配
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 管理员审批操作
枚举值：APPROVE REJECT
	 */
	@ApiField("operation")
	private String operation;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

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

	public IdentityInfo getApplicantInfo() {
		return this.applicantInfo;
	}
	public void setApplicantInfo(IdentityInfo applicantInfo) {
		this.applicantInfo = applicantInfo;
	}

	public IdentityInfo getApproveInfo() {
		return this.approveInfo;
	}
	public void setApproveInfo(IdentityInfo approveInfo) {
		this.approveInfo = approveInfo;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getOperation() {
		return this.operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
