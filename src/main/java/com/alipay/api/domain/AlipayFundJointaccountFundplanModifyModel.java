package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 共享资金-更新自动攒计划状态
 *
 * @author auto create
 * @since 1.0, 2022-07-21 12:14:05
 */
public class AlipayFundJointaccountFundplanModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5348433749254345298L;

	/**
	 * 账户ID</br>
补充说明：</br>
- 该字段可在签约接口alipay.fund.jointaccount.sign调用后，由账户变更通知alipay.fund.jointaccount.account.completed返回</br>
- 该字段可在签约alipay.fund.jointaccount.sign接口调用后，商户侧查询账户详情alipay.fund.jointaccount.detail.query接口返回
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 授权协议号</br>
补充说明：</br>
-该字段可在签约接口alipay.fund.jointaccount.sign调用后，由账户变更结果通知接口alipay.fund.jointaccount.account.completed中返回。</br>
-该字段可在签约接口调用后，商户侧查询账户详情接口alipay.fund.jointaccount.detail.query中返回
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
	 * 自动赞计划计划ID：</br>当前账户自动攒计划唯一标识</br>
补充说明：</br>
- 该字段可在签约接口alipay.fund.jointaccount.sign调用后（开户并自动攒场景），由自动攒变更结果通知alipay.fund.jointaccount.fundplan.completed返回</br>
- 该字段可在签约接口alipay.fund.jointaccount.sign接口调用后（开户并自动攒场景），商户侧查询自动攒列表alipay.fund.jointaccount.depositplan.list.query返回
	 */
	@ApiField("fund_plan_id")
	private String fundPlanId;

	/**
	 * （发起人）用户唯一标识
	 */
	@ApiField("identity")
	private String identity;

	/**
	 * （发起人）账号类型，参考值如下：</br>
-ALIPAY_USER_ID：支付宝侧用户唯一标识
	 */
	@ApiField("identity_type")
	private String identityType;

	/**
	 * 操作类型：</br>
- PAUSE：暂停 </br>
- DELETE：删除</br>
	 */
	@ApiField("operation_type")
	private String operationType;

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

	public String getFundPlanId() {
		return this.fundPlanId;
	}
	public void setFundPlanId(String fundPlanId) {
		this.fundPlanId = fundPlanId;
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

	public String getOperationType() {
		return this.operationType;
	}
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
