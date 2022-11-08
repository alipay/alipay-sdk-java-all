package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 共享资金-修改账户信息
 *
 * @author auto create
 * @since 1.0, 2022-07-21 12:11:32
 */
public class AlipayFundJointaccountAccountModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8746489158253881285L;

	/**
	 * 账户ID</br>
补充说明：</br>
- 该字段可在签约接口alipay.fund.jointaccount.sign调用后， 账户变更结果通知alipay.fund.jointaccount.account.completed中返回</br>
- 该字段可在签约接口alipay.fund.jointaccount.sign调用后，由查询账户详情alipay.fund.jointaccount.detail.query中返回
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 授权协议号</br>
补充说明：</br>
- 该字段可在签约接口alipay.fund.jointaccount.sign调用后， 账户变更结果通知alipay.fund.jointaccount.account.completed中返回</br>
- 该字段可在签约接口alipay.fund.jointaccount.sign调用后，由查询账户详情alipay.fund.jointaccount.detail.query中返回
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
	 * （发起人）账号类型，参考值如下</br>
ALIPAY_USER_ID：支付宝侧用户唯一标识
	 */
	@ApiField("identity_type")
	private String identityType;

	/**
	 * 新账户名称</br>
- 格式</br>
{"entity_name":"记账"}</br>
- key必须为：entity_name</br>
- 如出现敏感字、长度超长则修改失败，可包括数字、字母、空格、汉字，特殊字符、emoji等
	 */
	@ApiField("modify_items")
	private String modifyItems;

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

	public String getModifyItems() {
		return this.modifyItems;
	}
	public void setModifyItems(String modifyItems) {
		this.modifyItems = modifyItems;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
