package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 共享资金-页面预授权
 *
 * @author auto create
 * @since 1.0, 2025-04-21 14:57:57
 */
public class AlipayFundJointaccountPageAuthModel extends AlipayObject {

	private static final long serialVersionUID = 5771353174671629195L;

	/**
	 * 账户ID<br>
补充说明：<br>
-该字段可在签约接口alipay.fund.jointaccount.sign调用后，由账户变更结果通知接口alipay.fund.jointaccount.account.completed中返回。<br>
-该字段可在签约接口调用后，由查询账户详情接口alipay.fund.jointaccount.detail.query中返回。
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 授权协议号<br>
补充说明：<br>
-该字段可在签约接口alipay.fund.jointaccount.sign调用后，由账户变更结果通知接口alipay.fund.jointaccount.account.completed中返回。<br>
-该字段可在签约接口调用后，由查询账户详情接口alipay.fund.jointaccount.detail.query中返回。
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 业务场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 业务渠道</br>
补充说明：</br>
需要商户侧必传，支付宝侧不做强校验
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * （发起人）用户唯一标识
	 */
	@ApiField("identity")
	private String identity;

	/**
	 * （发起人）账号类型，参考值如下：<br>
-ALIPAY_USER_ID：支付宝侧用户唯一标识
	 */
	@ApiField("identity_type")
	private String identityType;

	/**
	 * 被邀请账号支付宝侧唯一标识
	 */
	@ApiField("invitee_id")
	private String inviteeId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("invitee_open_id")
	private String inviteeOpenId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 预授权页面类型</br>
- CLOSE_ACCOUNT：注销账户 </br>
 - BILL_LIST：查看账单列表</br>
 - FUND_PLAN_RESTART：重启自动攒计划</br>
 - MAKE_PROFIT ：开启生息</br>
 - UNFREEZE ：解锁</br>
 - DEVICE_MANAGE ：设备管理
	 */
	@ApiField("page")
	private String page;

	/**
	 * 销售产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 关系id，唯一代表设备和小荷包关系
	 */
	@ApiField("relation_id")
	private String relationId;

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

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
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

	public String getInviteeId() {
		return this.inviteeId;
	}
	public void setInviteeId(String inviteeId) {
		this.inviteeId = inviteeId;
	}

	public String getInviteeOpenId() {
		return this.inviteeOpenId;
	}
	public void setInviteeOpenId(String inviteeOpenId) {
		this.inviteeOpenId = inviteeOpenId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPage() {
		return this.page;
	}
	public void setPage(String page) {
		this.page = page;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getRelationId() {
		return this.relationId;
	}
	public void setRelationId(String relationId) {
		this.relationId = relationId;
	}

}
