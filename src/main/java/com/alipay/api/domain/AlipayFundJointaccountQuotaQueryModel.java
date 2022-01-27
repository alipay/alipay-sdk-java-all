package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询账户额度详情
 *
 * @author auto create
 * @since 1.0, 2021-03-18 10:44:59
 */
public class AlipayFundJointaccountQuotaQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2694167282482585884L;

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
	 * 员工ID
	 */
	@ApiField("member_id")
	private String memberId;

	/**
	 * 角色：创建方(CREATOR)、参与方(PARTICIPANT)
	 */
	@ApiField("operate_role")
	private String operateRole;

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

	public String getMemberId() {
		return this.memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getOperateRole() {
		return this.operateRole;
	}
	public void setOperateRole(String operateRole) {
		this.operateRole = operateRole;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
