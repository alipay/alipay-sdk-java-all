package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 自动攒计划详情查询
 *
 * @author auto create
 * @since 1.0, 2022-12-16 19:55:16
 */
public class AlipayFundJointaccountDepositplanDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4384693559636642878L;

	/**
	 * 合花群ID<br>
补充说明：<br>
- 该字段可在签约接口调用后，由alipay.fund.jointaccount.account.completed
中返回<br>
- 该字段可在签约接口调用后，由alipay.fund.jointaccount.detail.query中返回
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 授权协议号<br>
补充说明：<br>
- 该字段可在签约接口调用后，由alipay.fund.jointaccount.account.completed中返回<br>
- 该字段可在签约接口调用后，由alipay.fund.jointaccount.detail.query接口中返回
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 业务场景
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
	 * 当前合花群中的自动攒计划唯一标识列表<br>
补充说明：自动攒计划唯一标识列表最多包括30个<br>
- 该字段可新增自动攒计划后，由alipay.fund.jointaccount.depositplan.list.query中返回
	 */
	@ApiListField("fund_plan_id_list")
	@ApiField("string")
	private List<String> fundPlanIdList;

	/**
	 * （发起人）用户唯一标识
	 */
	@ApiField("identity")
	private String identity;

	/**
	 * （发起人）账号类型，参考值如下<br>
- ALIPAY_USER_ID：支付宝侧用户唯一标识
	 */
	@ApiField("identity_type")
	private String identityType;

	/**
	 * （发起人）用户唯一标识
	 */
	@ApiField("open_id")
	private String openId;

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

	public List<String> getFundPlanIdList() {
		return this.fundPlanIdList;
	}
	public void setFundPlanIdList(List<String> fundPlanIdList) {
		this.fundPlanIdList = fundPlanIdList;
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

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
