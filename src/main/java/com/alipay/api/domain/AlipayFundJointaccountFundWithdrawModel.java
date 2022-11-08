package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 共享资金-提现
 *
 * @author auto create
 * @since 1.0, 2022-07-21 12:13:53
 */
public class AlipayFundJointaccountFundWithdrawModel extends AlipayObject {

	private static final long serialVersionUID = 5256969377718588889L;

	/**
	 * 账户ID</br>
补充说明：</br>
- 该字段可在签约接口alipay.fund.jointaccount.sign调用后，由账户变更结果通知alipay.fund.jointaccount.account.completed中返回</br>
- 该字段可在签约接口alipay.fund.jointaccount.sign调用后，由查询账户详情alipay.fund.jointaccount.detail.query中返回
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 授权协议号</br>
补充说明：</br>
- 该字段可在签约接口alipay.fund.jointaccount.sign调用后，由账户变更结果通知alipay.fund.jointaccount.account.completed中返回</br>
- 该字段可在签约接口alipay.fund.jointaccount.sign调用后，由查询账户详情alipay.fund.jointaccount.detail.query中返回
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 转出金额（单位为元，必须大于0且最多小数点后两位）
	 */
	@ApiField("amount")
	private String amount;

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
	 * （发起人）账号类型，参考值如下</br>
ALIPAY_USER_ID：支付宝侧用户唯一标识
	 */
	@ApiField("identity_type")
	private String identityType;

	/**
	 * 备注标题</br>
订单标题，敏感字、长度超长会拒绝交易，可包括数字、字母、空格、汉字，但不能包括特殊字符、emoji等
	 */
	@ApiField("order_title")
	private String orderTitle;

	/**
	 * 商户侧单号（幂等字段）</br>
补充说明：</br>幂等逻辑（商户appid+out_biz_no），商户集成时需注意，如换号重复发起，则认为是一笔新的请求
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

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

	public String getOrderTitle() {
		return this.orderTitle;
	}
	public void setOrderTitle(String orderTitle) {
		this.orderTitle = orderTitle;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
