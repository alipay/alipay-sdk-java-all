package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 提现审批
 *
 * @author auto create
 * @since 1.0, 2022-07-16 09:48:54
 */
public class AlipayFundJointaccountOperationApproveModel extends AlipayObject {

	private static final long serialVersionUID = 8396767917325984462L;

	/**
	 * 合花群ID<br>
补充说明：<br>
- 该字段可在签约接口调用后，由alipay.fund.jointaccount.account.completed通知中返回 <br>
- 该字段可在签约接口调用后，由alipay.fund.jointaccount.detail.query中返回
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 授权协议号 <br>
补充说明：<br>
- 该字段可在签约接口调用后，由alipay.fund.jointaccount.account.completed通知中返回 <br>
- 该字段可在签约接口调用后，由alipay.fund.jointaccount.detail.query中返回
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 审批金额（单位为元，必须大于0且最多小数点后两位）<br>
补充说明：<br>
1.  INVITE_REPLY场景时，该字段无需传递 <br>
2. WITHDRAW_APPROVE场景时，该字段必传:<br>
- 该字段可在提现申请接口调用后，alipay.fund.jointaccount.fund.completed中返回 <br>
- 该字段可在提现申请接口调用后，由alipay.fund.jointaccount.fund.order.query中返回
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 审批场景<br>
- INVITE_REPLY：成员邀请回复<br>
- WITHDRAW_APPROVE：提现审批
	 */
	@ApiField("approve_scene")
	private String approveScene;

	/**
	 * 业务场景， 目前支持：<br>
- LIANAIJI_INVITE_REPLY: 邀请回复场景 <br>
- LIANAIJI_WITHDRAW_APPROVE: 提现审批场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 审批人用户唯一标识
	 */
	@ApiField("identity")
	private String identity;

	/**
	 * 审批人账号类型，参考值如下：<br>
- OUT_USER_ID：商户侧用户唯一标识(仅支持在邀请回复场景传入该值) <br>
- ALIPAY_USER_ID：支付宝侧用户唯一标识
	 */
	@ApiField("identity_type")
	private String identityType;

	/**
	 * 审批单号（幂等字段）<br>
补充说明：幂等逻辑（process_id），商户集成时需注意，如换号重复发起，则认为是一笔新的请求<br>
- 该字段可在签约接口调用后，由alipay.fund.jointaccount.invite.completed或alipay.fund.jointaccount.fund.completed中返回<br>
- 该字段可在签约接口调用后，由alipay.fund.jointaccount.detail.query或alipay.fund.jointaccount.fund.order.query中返回
	 */
	@ApiField("process_id")
	private String processId;

	/**
	 * 销售产品码
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

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getApproveScene() {
		return this.approveScene;
	}
	public void setApproveScene(String approveScene) {
		this.approveScene = approveScene;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getIdentity() {
		return this.identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public String getIdentityType() {
		return this.identityType;
	}
	public void setIdentityType(String identityType) {
		this.identityType = identityType;
	}

	public String getProcessId() {
		return this.processId;
	}
	public void setProcessId(String processId) {
		this.processId = processId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
