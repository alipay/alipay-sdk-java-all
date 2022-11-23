package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 *  提现申请
 *
 * @author auto create
 * @since 1.0, 2021-09-07 10:34:04
 */
public class AlipayFundJointaccountFundApplyWithdrawModel extends AlipayObject {

	private static final long serialVersionUID = 1485512218134259144L;

	/**
	 * 合花群ID<br>
补充说明：<br>
1. 该字段可在签约接口调用后，由alipay.fund. jointaccount.account.completed返回<br>
2. 该字段可在签约接口调用后，由alipay.fund. jointaccount.detail.query返回<br>
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 授权协议号<br>
补充说明：<br>
1. 该字段可在签约接口调用后，由alipay.fund. jointaccount.account.completed返回<br>
2. 该字段可在签约接口调用后，由alipay.fund. jointaccount.detail.query返回
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 提现金额（单位为元，必须大于0且最多小数点后两位）
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * （审批人）支付宝侧用户唯一标识列表<br>
补充说明：审批人列表最多包括8个审批人，且唯一标识必须为支付宝侧用户唯一标识<br>
1. 该字段可群成员接受邀请后，由alipay.fund. jointaccount.member.completed返回<br>
2. 该字段可在签约接口调用后，由alipay.fund. jointaccount.detail.query返回
	 */
	@ApiListField("auditors")
	@ApiField("string")
	private List<String> auditors;

	/**
	 * 业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * （发起人）用户唯一标识
	 */
	@ApiField("identity")
	private String identity;

	/**
	 * （发起人）账号类型，参考值如下：<br>
ALIPAY_USER_ID：支付宝侧用户唯一标识
	 */
	@ApiField("identity_type")
	private String identityType;

	/**
	 * 商户侧单号（幂等字段）<br>
    补充说明：幂等逻辑（商户appid+out_biz_no），商户集成时需注意，如换号重复发起，则认为是一笔新的请求
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 提现申请倒计时（单位：秒），超时后撤销系统自动撤销提现申请<br>
补充说明：<br>
1. 商户传递时，最长不可超过999999秒（约11天）<br>
2. 商户不传该字段时，支付宝默认申请72小时后发起撤销操作
	 */
	@ApiField("pay_timeout")
	private String payTimeout;

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

	public List<String> getAuditors() {
		return this.auditors;
	}
	public void setAuditors(List<String> auditors) {
		this.auditors = auditors;
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

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPayTimeout() {
		return this.payTimeout;
	}
	public void setPayTimeout(String payTimeout) {
		this.payTimeout = payTimeout;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
