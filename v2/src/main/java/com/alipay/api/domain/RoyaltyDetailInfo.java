package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分账条款明细
 *
 * @author auto create
 * @since 1.0, 2024-03-01 14:29:22
 */
public class RoyaltyDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 2229682461723325935L;

	/**
	 * 分账金额，单位为元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 分账描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 分账场景，目前仅支持5中类型，RETURN_MONEY(垫资还款), CHARGE（费用）, REPLENISH（补贴），FUND_TRANS_IN_SWITCHING（存量资金搬迁），PUNISHMENT（处罚）
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 分账转入账户id。当分账账户id类型是cardSerialNo时，本参数为用户在支付宝绑定的卡编号；当分账账户id类型是userId时，本参数为用户的支付宝账号对应的支付宝唯一用户号；当分账账户id类型是loginName时，本参数为用户的支付宝登录号;当分账账户id类型是openId时，本参数为用户的在该应用下的支付宝OpenId; 当 trans_in_account_type 为defaultSettle时，本参数必须为空
	 */
	@ApiField("trans_in_account_id")
	private String transInAccountId;

	/**
	 * 分账转入账户id类型。 当trans_in_account_type 为bankCard时，本参数为cardSerialNo，表示分账账户id是银行卡编号; 当trans_in_account_type 为alipayBalance时，本参数为userId或者loginName或者openId，其中userId表示分账账户id是支付宝唯一用户号，loginName表示分账账户id是支付宝登录号，openId表示分账账户id是支付宝OpenId; 当 trans_in_account_type 为 defaultSettle 时，本参数必须为空。
	 */
	@ApiField("trans_in_account_id_type")
	private String transInAccountIdType;

	/**
	 * 分账账户类型。 bankCard: 分账账户为银行卡； alipayBalance: 分账账户为支付宝余额户; defaultSettle: 按默认结算规则分账
	 */
	@ApiField("trans_in_account_type")
	private String transInAccountType;

	/**
	 * 分账账户业务类型，目前仅支持已结算类型 settled
	 */
	@ApiField("trans_in_entity_biz_type")
	private String transInEntityBizType;

	/**
	 * 分账转出主体账 号。

当分账转出主体类型为SecondMerchant，本参数为二级商户的SecondMerchantID

当分账转出类型为Store，本参数为StoreID
	 */
	@ApiField("trans_in_entity_id")
	private String transInEntityId;

	/**
	 * 分账转入主体类型。 SecondMerchant：分账转入主体为二级商户
Store: 分账转入主体为门店
	 */
	@ApiField("trans_in_entity_type")
	private String transInEntityType;

	/**
	 * 转入方二级商户信息
	 */
	@ApiField("trans_in_sub_merchant")
	private SubMerchant transInSubMerchant;

	/**
	 * 分账转出方主体业务类型，目前仅支持已结算类型 settled
	 */
	@ApiField("trans_out_entity_biz_type")
	private String transOutEntityBizType;

	/**
	 * 分账转出主体账。

当分账转出主体类型为SecondMerchant，本参数为二级商户的SecondMerchantId

当分账转出类型为Store，本参数为StoreID
	 */
	@ApiField("trans_out_entity_id")
	private String transOutEntityId;

	/**
	 * 分账转出主体类型。 SecondMerchant：结算主体为二级商户
Store: 结算主体为门店
	 */
	@ApiField("trans_out_entity_type")
	private String transOutEntityType;

	/**
	 * 转出方二级商户信息
	 */
	@ApiField("trans_out_sub_merchant")
	private SubMerchant transOutSubMerchant;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getTransInAccountId() {
		return this.transInAccountId;
	}
	public void setTransInAccountId(String transInAccountId) {
		this.transInAccountId = transInAccountId;
	}

	public String getTransInAccountIdType() {
		return this.transInAccountIdType;
	}
	public void setTransInAccountIdType(String transInAccountIdType) {
		this.transInAccountIdType = transInAccountIdType;
	}

	public String getTransInAccountType() {
		return this.transInAccountType;
	}
	public void setTransInAccountType(String transInAccountType) {
		this.transInAccountType = transInAccountType;
	}

	public String getTransInEntityBizType() {
		return this.transInEntityBizType;
	}
	public void setTransInEntityBizType(String transInEntityBizType) {
		this.transInEntityBizType = transInEntityBizType;
	}

	public String getTransInEntityId() {
		return this.transInEntityId;
	}
	public void setTransInEntityId(String transInEntityId) {
		this.transInEntityId = transInEntityId;
	}

	public String getTransInEntityType() {
		return this.transInEntityType;
	}
	public void setTransInEntityType(String transInEntityType) {
		this.transInEntityType = transInEntityType;
	}

	public SubMerchant getTransInSubMerchant() {
		return this.transInSubMerchant;
	}
	public void setTransInSubMerchant(SubMerchant transInSubMerchant) {
		this.transInSubMerchant = transInSubMerchant;
	}

	public String getTransOutEntityBizType() {
		return this.transOutEntityBizType;
	}
	public void setTransOutEntityBizType(String transOutEntityBizType) {
		this.transOutEntityBizType = transOutEntityBizType;
	}

	public String getTransOutEntityId() {
		return this.transOutEntityId;
	}
	public void setTransOutEntityId(String transOutEntityId) {
		this.transOutEntityId = transOutEntityId;
	}

	public String getTransOutEntityType() {
		return this.transOutEntityType;
	}
	public void setTransOutEntityType(String transOutEntityType) {
		this.transOutEntityType = transOutEntityType;
	}

	public SubMerchant getTransOutSubMerchant() {
		return this.transOutSubMerchant;
	}
	public void setTransOutSubMerchant(SubMerchant transOutSubMerchant) {
		this.transOutSubMerchant = transOutSubMerchant;
	}

}
