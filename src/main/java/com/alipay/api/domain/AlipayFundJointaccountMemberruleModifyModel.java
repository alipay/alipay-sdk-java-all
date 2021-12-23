package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业设置员工规则
 *
 * @author auto create
 * @since 1.0, 2021-03-18 10:44:47
 */
public class AlipayFundJointaccountMemberruleModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5199792277214868518L;

	/**
	 * 账户ID
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 授权协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 员工列表
	 */
	@ApiField("member_list")
	private JointAccountMemberList memberList;

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

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public JointAccountMemberList getMemberList() {
		return this.memberList;
	}
	public void setMemberList(JointAccountMemberList memberList) {
		this.memberList = memberList;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
